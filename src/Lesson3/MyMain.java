package Lesson3;

public class MyMain {
    public static void main(String[] args) {
setLocalVariables();
    }
    public static void setLocalVariables() {
        // Переменная (код) внутри блока называе(ю)тся локальными.
        // Код написанный в методе называется локальным кодом уровня метода
        // Локальная переменная существует от ковычки до ковычки
        int myInt = 100;
        {
            int myInt2 = 101;
            System.out.println(myInt + myInt2); // myInt выше уровнем, читается
        }
        System.out.println(myInt); // myInt2 находится ниже уровнем, поэтому не читается;

        setDefaultVariables();
    }

    public static void setDefaultVariables(){

        String myName = null; // null - ключевое слово, которое показывает отсутствие значений
        String yourName = "";
        int myWeight = 0;

        System.out.println(myName);
        System.out.println(myWeight);
    }
}