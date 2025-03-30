package Homework8.Task2;

public class Director implements InterfaceTask2 {
    private String job = "Директор";
    public Director(){
        getJobTitle(job);
    }



    @Override
    public void getJobTitle(String job) {
        InterfaceTask2.super.getJobTitle(job);
        System.out.println(job + "\n");
    }
}
