package mx.edu.j2se.Pacheco.tasks;

public class Task {

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
        if (time != null) {
            inactive = 1;
            return "inactive task";

        } else {
            return;
        }
        if (this.title = title) {
            repeatedName = 1;
            return "Repeated task";
        }
    }
    public String Task(title,start,end, interval){
        if (start==null || end=null){
            inactive=1;
        }
        }

    public String getTitle(){
            return title;
        }

    public void setTitle(String title){
            this.title=title;
        }

    public boolean isActive(){
            if(inactive=1){
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
            if (repeatedName=1){
                return start;
            }
            else {
                return time;
            }
        }
    public void setTime(int time){
        this.time=time;
        }

    public int getStartTime(){
            if(repeatedName!=1){
                return timeExecution;
            }
        }
    public int getEndTime(){
        if(repeatedName!=1){
            while(true) {
                timeExecution++;
                }
            return timeExecution;
            }
        }
    public int getRepeatInterval(){
        if(repeatedName!=1){
            return 0;
        }
        else{
            return interval;
        }

    }
    public void setTime(int start, int end, int interval){
        if(repeatedName!=1){
           this.start=time;
           getEndTime();
           getEndTime();


        } else{
            this.start=start;
            this.end=end;
            this.interval=interval;
        }

    }
    public boolean isRepeated(){
        if(repeatedName=1){
            return true;
        }else{
            return false;
        }
    }
    public int nextTimeAfter(int current){
        current=current+timeExecution;
        return current;
    }
}



