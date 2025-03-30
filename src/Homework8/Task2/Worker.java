package Homework8.Task2;

public class Worker implements InterfaceTask2 {
    private String job = "Рабочий";
    public Worker(){
        getJobTitle(job);
    }


    @Override
    public void getJobTitle(String job) {
        InterfaceTask2.super.getJobTitle(job);
        System.out.println(job + "\n");
    }


}
