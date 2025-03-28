package Homework7.Task1;

import Homework7.Task1.Dentist;
import java.util.Scanner;

/*





Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно
плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод
лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод лечить.


 */
public class Hospital {
    public static void main(String[] args) {
getTreatmentMethod();
    }


    public static void getTreatmentMethod() {

        Patient patient1 = new Patient("Аркадий Гёзенберг", 33);
        Patient patient2 = new Patient("Викторов Алексей", 22);
        Patient patient3 = new Patient("Сидоров Ваня", 56);


        Surgeon surgeon = new Surgeon("Хирург", 1, "Федеринни И. Ю.", 63);
        Dentist dentist = new Dentist("Дантист", 44, "Бонуччи Ф. П.", 88);
        Therapist therapist = new Therapist("Терапевт", 22, "Федотто О. О.", 23);


        System.out.println("----------------------------------");
        patient1.getInfoPatient();
        System.out.println("----------------------------------");
        TreatmentPlan numb = new TreatmentPlan(1);
        numb.getNumber();
        System.out.println("----------------------------------");
        surgeon.getTreatment();
        System.out.println("----------------------------------");

        System.out.println();

        patient2.getInfoPatient();
        System.out.println("----------------------------------");
        TreatmentPlan numb1 = new TreatmentPlan(2);
        numb1.getNumber();
        System.out.println("----------------------------------");
        dentist.getTreatment();
        System.out.println("----------------------------------");

        System.out.println();

        patient3.getInfoPatient();
        System.out.println("----------------------------------");
        TreatmentPlan numb2 = new TreatmentPlan(44);
        numb2.getNumber();
        System.out.println("----------------------------------");
        therapist.getTreatment();
        System.out.println("----------------------------------");
    }

    }

