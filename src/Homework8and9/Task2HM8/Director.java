package Homework8and9.Task2HM8;

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
