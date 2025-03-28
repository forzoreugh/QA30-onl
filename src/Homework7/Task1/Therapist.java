package Homework7.Task1;

public class Therapist extends Staff{
    public Therapist(String specialization, int officeNumber, String FLname, int age) {
        super(specialization, officeNumber, FLname, age);
    }

    @Override
    public void getTreatment() {
        super.getTreatment();
        costOfTreatment = 1_665.80;
        performingTheOperation = false;
        treatmentTime = "9 дней";
        System.out.println("Метод лечения пацента в терапевтическом отделении:");
        System.out.println("Стоимость лечения: " + costOfTreatment + "\n" + "Требуется ли операция: " +
                performingTheOperation + "\n" + "Время восстановления: " + treatmentTime);
    }
}
