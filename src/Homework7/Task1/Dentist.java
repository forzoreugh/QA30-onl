package Homework7.Task1;

public class Dentist extends Staff{
    public Dentist(String specialization, int officeNumber, String FLname, int age) {
        super(specialization, officeNumber, FLname, age);
    }

    @Override
    public void getTreatment() {
        super.getTreatment();
        costOfTreatment = 9005.20;
        performingTheOperation = false;
        treatmentTime = "2 недели";
        System.out.println("Метод лечения пацента в стоматологическом отделении:");
        System.out.println("Стоимость лечения: " + costOfTreatment + "\n" + "Требуется ли операция: " +
                performingTheOperation + "\n" + "Время восстановления: " + treatmentTime);
    }
}
