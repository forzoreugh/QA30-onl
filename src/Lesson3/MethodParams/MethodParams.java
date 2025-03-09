package Lesson3.MethodParams;

public class MethodParams {
    public static void main(String[] args) {
calculate("Artsiom", "Svidzinski", 23, "Belarus");
    }

    public static void calculate(String firstname, String lastname, int age, String nationality) {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(nationality);
        int x = 33;
        double y = 55.5;
        calculateSum(x, y);
        String message = "Всем привет!!!";
        getMsg(message);
    }

    public static void calculateSum(int x, double y) {
        double sum = x + y;
        System.out.println(sum);
    }
    public static void getMsg(String msg) {
       System.out.println("Твое сообщение " + msg);
    }
}







