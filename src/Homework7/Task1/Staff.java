package Homework7.Task1;

public class Staff {
    protected String FLname;
    protected int age;
    protected String specialization;
    protected int officeNumber;

    protected double costOfTreatment;
    protected boolean performingTheOperation;
    protected String treatmentTime;


    public Staff(String specialization, int officeNumber, String FLname, int age){
        this.specialization = specialization;
        this.officeNumber = officeNumber;
        this.FLname = FLname;
        this.age = age;
    }


    public void getInformation(){
        System.out.println("Информация о враче:");
        System.out.println("ФИО: " + FLname + "\n" + "Возраст: " + age + "\n" + "Специализация: " + specialization +
                "\n" + "Номер кабинета: " + officeNumber);
    }

    public void getTreatment(){
 //       System.out.println("Метод лечения пацента:");
 //       System.out.println("Стоимость лечения: " + costOfTreatment + "\n" + "Требуется ли операция: " +
 //               performingTheOperation + "\n" + "Время восстановления: " + treatmentTime);
    }
}
