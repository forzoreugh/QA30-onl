package Homework7.Task1;

public class Surgeon extends Staff{

    public Surgeon (String specialization, int officeNumber, String FLname, int age) {
        super(specialization, officeNumber, FLname, age);
    }

    @Override
    public void getTreatment() {
        super.getTreatment();
        costOfTreatment = 15_950.50;
        performingTheOperation = true;
        treatmentTime = "3 месяца";
        System.out.println("Метод лечения пацента в хирургическом отделении:");
        System.out.println("Стоимость лечения: " + costOfTreatment + "\n" + "Требуется ли операция: " +
                performingTheOperation + "\n" + "Время восстановления: " + treatmentTime);
    }
}
