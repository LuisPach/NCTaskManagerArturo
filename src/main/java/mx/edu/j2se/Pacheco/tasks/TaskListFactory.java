package mx.edu.j2se.Pacheco.tasks;

public class TaskListFactory {
    public static AbstractTaskList createTaskList(ListTypes.types type) {

        if(type==ListTypes.types.ARRAY){
            AbstractTaskList arrayTask = new ArrayTaskList();
            return arrayTask;

                        } else if(type==ListTypes.types.LINKED){
            AbstractTaskList listTask = new LinkedTaskList();
            return listTask;

        } else{
            return null;
        }
    }
    }