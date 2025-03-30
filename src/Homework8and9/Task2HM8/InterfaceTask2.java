package Homework8and9.Task2HM8;

public interface InterfaceTask2  {
    default void getJobTitle(String job){
        System.out.print("Наименование должности: ");
    }
}
