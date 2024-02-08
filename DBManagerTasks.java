package Classes;

import java.util.ArrayList;

public class DBManagerTasks {
    private  static ArrayList<Tasks> tasks = new ArrayList<>();
    private  static  long id = 4L;
    static {
        tasks.add(new Tasks(1L,"Bekarys","important","2021-02-05",false));
        tasks.add(new Tasks(2L,"Arnur"," not important","2020-05-06",false));
        tasks.add(new Tasks(3L,"Yelzhas","important","2020-04-10",false));
    }

   public static void addTask(Tasks task){

       task.setId(id);
       task.setStatus(false);
       id++;
       tasks.add(task);
   }

    public  static  Tasks getTask(Long id){
       Tasks task = new Tasks();
        for (int i =0;i<tasks.size();i++){
            if(id == tasks.get(i).getId()){
                return  tasks.get(i);
            }
        }
        return  task;
    } // этот метод возвращает объект задачи по id

    public static   ArrayList getAllTasks(){
        return  tasks;
    } //этот метод возвращает список всех задач

    public  void deleteTask(Long id){
        for(Tasks task: tasks){
            if ( id == task.getId()){
                tasks.remove(task);
            }
        }
    } //этот метод удаляет задачу из списка по id
}
