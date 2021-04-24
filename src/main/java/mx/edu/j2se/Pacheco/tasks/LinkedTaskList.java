package mx.edu.j2se.Pacheco.tasks;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedTaskList extends AbstractTaskList{

    LinkedList<Task> listTask= new LinkedList<Task>();

    public void add(Task task){
        listTask.add(task);
    }

    public boolean remove(Task task){

        boolean intheList=false;

        for (int i=0; i<listTask.size();i++){
            if(listTask.get(i).getTitle()==task.getTitle()){
                intheList=true;
                listTask.remove(i);
                  break;

            }
        }

        return intheList;
    }

    public int size(){
        return listTask.size();
    }

    public Task getTask(int index){
        if (index < listTask.size() && index >= 0) {
            return listTask.get(index);
        }
        throw new IndexOutOfBoundsException("No valid index");

    }

    public LinkedTaskList incoming(int from, int to){
        LinkedTaskList inRange= new LinkedTaskList();

        for (int i = 0;i < listTask.size(); i++) {
            if(listTask.get(i).active) {
                if(listTask.get(i).start>=from && listTask.get(i).end<=to || listTask.get(i).time>=from && listTask.get(i).time<=to){
                    inRange.add(listTask.get(i));
                }
            }
        }
        return inRange;
    }
}
