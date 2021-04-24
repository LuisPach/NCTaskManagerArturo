package mx.edu.j2se.Pacheco.tasks;

import java.util.Objects;

public class Task {
    String  title;
    int     time;
    int     start;
    int     end;
    int     interval;
    boolean active;
    int current;



    public Task(String title, int time){
       if (time<0) {
        throw new IllegalArgumentException ("Use a positive value, please");
        }
            this.title = title;
            this.time = time;

    }

    public Task(String title, int start, int end, int interval) {
        if(start<0 || end<start || interval<=0){
            throw new IllegalArgumentException ("Use proper values, please");
        }
            this.title = title;
            this.start = start;
            this.end = end;
            this.interval = interval;

    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }



    public int getTime() {
        if (isRepeated()) {
            return start;
        } else {
            return time;
        }
    }



    public int getStartTime() {
        if (isRepeated()) {
            return start;
        } else {
            return time;
        }
    }

    public int getEndTime() {
        if (isRepeated()) {
            return end;
        } else {
            return time;
        }
    }

    public int getRepeatInterval() {
        if (isRepeated()) {
            return interval;
        } else {
            return 0;
        }
    }

    public void setTime(int time) {
        if(time<0){
            throw new IllegalArgumentException("Use a positive value, please");
        }
        if (isRepeated()) {
            this.time = time;
            this.start = 0;
            this.end = 0;
            this.interval = 0;
        }
        else {
            this.time = time;
        }
    }
    public void setTime(int start, int end, int interval) {
        if(start<0 || end<start || interval<=0){
            throw new IllegalArgumentException ("Use proper values, please");
        }
        if (isRepeated()) {

            this.start = start;
            this.end = end;
            this.interval = interval;

        } else {
            this.time = 0;
            this.start = start;
            this.end = end;
            this.interval = interval;
        }
    }


    public boolean isRepeated() {
        return interval > 0;
    }

    public int nextTimeAfter(int current) {
        if(isActive()) {
            if(isRepeated() && current <= start) {
                return start;
            } else if(isRepeated() && current <= end && current > start) {
                return start = start + interval;
            } else if(!isRepeated() && current <= time) {
                return time;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public boolean equals(Object a){
    if(this==a){
        return true;
    }else if(a==null || !(a instanceof Task)){
        return false;
    }
        Task b = (Task) a;

        if(!b.title.equals(this.title))
            return false;
        else if(this.time != b.time)
            return false;
        else if(this.start != b.start)
            return false;
        else if (this.end != b.end)
            return false;
        else if(this.interval != b.interval)
            return false;
        else return true;
    }

    public int hashCode() {
        return Objects.hash(title, time, start, end, interval, active);
    }

    public String toString() {
        String temp;
        if(this.isRepeated()){
            temp = "\n Title:"+title+"\t Start:"+start+"\t End:"+end+"\t Interval:"+interval+"\t Active: "+active+
                    "\t Repetitive: "+isRepeated();
        }else{
            temp = "\n Title:"+title+"\t Time:"+time+"\t Active:"+active+"\t Repetitive:"+isRepeated();
        }
        return temp;
    }

    public Object copy() throws CloneNotSupportedException {

        return super.clone();

    }


}



