package mx.edu.j2se.Pacheco.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTaskList{


    int n=1;
    Task[] arrayTask=new Task[n];

    int index;
    int from;
    int to;

    //Task task=new Task();
    //Task array[]=new Task[n];


    public void add (Task task){
    if(task==null){
        throw new IllegalArgumentException("Task have contain an active");
    }
        Task[] temp=new Task[arrayTask.length+1];
        System.arraycopy(arrayTask,0,temp,0,arrayTask.length); //(source_arr,sourcePos,dest_arr,destPos,len);
        temp[arrayTask.length + 1]= task;
        this.arrayTask=temp;

    }

    public boolean remove (Task task){

        Task[] temp2=new Task[arrayTask.length];
        boolean inthelist=false;

        for (int i=0; i<arrayTask.length;i++){
            temp2[i]=arrayTask[i];
            if(arrayTask[i].getTitle()==task.getTitle()){
               inthelist=true;
                for(int j=i;j<temp2.length-1;j++){
                    temp2[j]=arrayTask[j+1];
                }
                break;

            }
        }
        this.arrayTask=Arrays.copyOf(temp2,temp2.length-1);
        return inthelist;

    }

    public int size(){

        return arrayTask.length;
    }

    public Task getTask(int index) {
        if (index < arrayTask.length && index >= 0) {
            return arrayTask[index];
        }
        throw new IndexOutOfBoundsException("No valid index");
    }


    public ArrayTaskList incoming(int from, int to){

        ArrayTaskList inRange = new ArrayTaskList();
        for (int i = 0;i < arrayTask.length; i++) {
            if(arrayTask[i].active) {
                if(arrayTask[i].start>=from && arrayTask[i].end<=to || arrayTask[i].time>=from && arrayTask[i].time<=to){
                    inRange.add(arrayTask[i]);
                }
            }
        }

        Task arrayTemp2[] = new Task[arrayTask.length];
        int k=0;
        int j=0;
        for (int i = 0;i < arrayTask.length; i++) {
            if(inRange.arrayTask[i] != null){
                arrayTemp2[j] = inRange.arrayTask[i];
                j++;
                k++;
            }
        }
        inRange.arrayTask = Arrays.copyOf(arrayTemp2,k);
        return inRange;
    }



}
