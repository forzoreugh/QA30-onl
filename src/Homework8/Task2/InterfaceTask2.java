package Homework8.Task2;

public interface InterfaceTask2  {
    default void getJobTitle(String job){
        System.out.print("Наименование должности: ");
    }
}
