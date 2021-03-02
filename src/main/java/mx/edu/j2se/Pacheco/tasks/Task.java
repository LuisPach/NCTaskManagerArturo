package mx.edu.j2se.Pacheco.tasks;

public class Task {

    String task;
    String title;
    int time;
    int start;
    int end;
    int interval;
    int repeatedName;
    boolean active;
    int inactive;
    int timeExecution=0;
    int current;

    public String Task(String title, int time) {
        if (this.time == ' ') {
            inactive = 0;
            this.time = time;

        } else {
            inactive = 1;
            //return "Inactive";
        }
        if (this.title != title) {
            repeatedName = 0;
            this.title = title;
        } else {
            repeatedName = 1;
           //return "Repeated task";
        }
        return task;
    }


    public String Task(String title,int start,int end, int interval){
        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval;

        return task;
        }

    public String getTitle(){
            return title;
        }

    public void setTitle(String title){
            this.title=title;
        }

    public boolean isActive(){
            if(inactive==1){
                active=false;
                return active;
            }
            else {
                active=true;
                return active;
            }

        }

    public void setActive(boolean active){

            this.active=active;
        }
    public int getTime(){
            if (repeatedName==1){
                return start;
            }
            else {
                return time;
            }
        }
    public void setTime(int time){
        if(isRepeated()){
            this.start=time;
            this.end=time;
            this.interval=0;
        } else{
            this.time=time;
        }
    }

    public int getStartTime(){
            if(isRepeated()){
                return start;
            } else{
                return time;
            }
        }

    public int getEndTime(){
        if(isRepeated()){
            return end;
        } else{
            return time;
        }
    }

    public int getRepeatInterval(){
        if(isRepeated()){
            return interval;
        }
        else{
            return 0;
        }

    }
    public void setTime(int start, int end, int interval){
        if(isRepeated()){
           this.start=start;
           this.end=end;
           this.interval=interval;

        } else{
            this.time=' ';
            this.start=start;
            this.end=end;
            this.interval=interval;
        }
    }

    public boolean isRepeated(){
        if(interval>0){
            return true;
        }else{
            return false;
        }
    }
    public int nextTimeAfter(int current){
        if (isRepeated() && current<start){
            return start;
        }else if (isRepeated() && current<end && current>=start){
            start=start+interval;
            return start;
        }else if(isRepeated()==false && current<time){
            return time;
        } else{
            return -1;
        }

    }
}



