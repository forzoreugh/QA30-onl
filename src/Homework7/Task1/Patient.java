package Homework7.Task1;

public class Patient{
    protected String name;
    protected int age;

    public Patient(String name, int age) {
    this.name = name;
    this.age = age;
    }

public void getInfoPatient(){
    System.out.println("Информация о поступившем больном:");
    System.out.println("Имя Отчество пациента: " + name + "\n" + "Количество лет пациента: " + age);
}


}

