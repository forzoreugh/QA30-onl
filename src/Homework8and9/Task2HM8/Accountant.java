package Homework8and9.Task2HM8;

public class Accountant implements InterfaceTask2 {
    private String job = "Бухгалтер";
    public Accountant(){
getJobTitle(job);
    }

    @Override
    public void getJobTitle(String job) {
        InterfaceTask2.super.getJobTitle(job);
        System.out.println(job + "\n");
    }
}
