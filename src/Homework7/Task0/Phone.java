package Homework7.Task0;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public void getInformation() {
        System.out.println("Продукция Apple, подлежащая продаже в нашем магазине:");
        System.out.println("Номер продавца: " + this.number + "\n" +
                "Модель iPhone: " + this.model + "\n" +
                "Вес телефона составляет в кг: " + this.weight);
    }

    public void receiveCall(String callName) {
        System.out.println();
        System.out.println("Входящий звонок!");
        System.out.println("Звонит: " + callName);
        System.out.println("Номер продавца: " + getNumber());
        System.out.println();
    }

    public Phone(){
    }

    public Phone(int number, String model){
        this(375, "iPhone 5s", 0);
    }

    public void sendMessage(int ... numbers) {
        for (int number = 0; number < numbers.length; number++) {
            System.out.println("Номер телефона, которому будет отправлено сообщение: " + numbers[number]);
        }
    }
 public void receiveCall(int number, String callName){
     System.out.println();
     System.out.println("Пропущенный звонок..");
     System.out.println("Имя звонящего: " + callName);
     System.out.println("Номер телефона: " + number);
     System.out.println();
 }

    public double getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }


}