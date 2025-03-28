package Homework7.Task1;

public class TreatmentPlan {
    private final int number;

public TreatmentPlan(int number){
        this.number = number;
}

    public void getNumber() {
        if (number == 1) {
            Surgeon surgeon = new Surgeon("Хирург", 1, "Федеринни И. Ю.", 63);
            surgeon.getInformation();
        } else if (number == 2) {
            Dentist dentist = new Dentist("Дантист", 22, "Юрченко А. А.", 45);
            dentist.getInformation();
        } else {
            Therapist therapist = new Therapist("Терапевт", 5, "Бонуччи Ю. Ю.", 87);
            therapist.getInformation();
        }
    }
}

