/**
 * author Artem Svidinskiy
 * teacher Archil Sikharulidze
 * academy TeachMeSkills
 */

package Lesson2;

public class Main {
    public static void main(String[] args) {
        // Метод вызова (Method call)
        getBasicVariables();
    }

    // Методы (Methods)
    public static void getBasicVariables() {
        System.out.println("Добрый день, коллеги!");
        System.out.print("Данный код выполнен в рамках лекции №2\n");

        // Примитивные типы (Primitive types)
        //  Целочисленные значения (Integer)
        byte myByte = 127; // от -127 до 128 [1 байт]
        short myShort = 32767; //от -32768 до 32767 [2 байта]
        int myInt = -2_147_483_648; // от -2_147_483_648 до 2_147_483_647 [4 байта]
        long myLong = -9_223_372_036_854_775_808L; // L - добавляем, т.к. по по дефолту пытается преобразовать в int

        // Значения с плавающей запятой
        float myFloat = 345544.5436F; // [4 байта] F - добавляем, т.к. по дефолту пытается преобразоваться в double
        double myDouble = 84757853963.3534636; // [8 байтов]

        // Целочисленное значение (знак)
        char myChar = 'P';

        // Логическое значение (true/false)
        boolean isActive = true;

        // Ссылочные типы (Reference types)
        String string = "Текст для привлечения внимания!";

        System.out.println("--------------------------------------------");

        System.out.println("Byte = " + myByte);
        System.out.println("Short = " + myShort);
        System.out.println("Int = " + myInt);
        System.out.println("Long = " + myLong);

        System.out.println("--------------------------------------------");

        System.out.println("Заданное значение в переменной float = " + myFloat);
        System.out.println("Данное значение = " + myDouble + " и относится к переменной double");

        System.out.println("--------------------------------------------");

        System.out.println("Знак 'Р' из таблицы целочисленных значений = " + (int) myChar);
        myChar = 'F';
        System.out.println("Знак = " + myChar + " из таблицы целочисленных значений = " + (int) myChar);

        System.out.println("--------------------------------------------");

        System.out.println("Данная кнопка является активной? Ответ: " + isActive);

        System.out.println("--------------------------------------------");

        getAdditionallyBasicVariables();
    }

    public static void getAdditionallyBasicVariables() {
        String myAge = 23 + " года мне на данный момент.";
        System.out.println("Привет, сейчас " + myAge);

        System.out.println("--------------------------------------------");

        getArithmeticOperations();
    }
    public static void getArithmeticOperations(){
        // К арифметическим операциям относятся: +, -, /, *, %
        int myHeight = 193;
        int notMyHeight = 178;
        int dif = myHeight - notMyHeight;
        System.out.println("Какое значение между ростом твои и моим? " + dif + " - разница между значениями.");
        System.out.print("Разница между нашими ростами составляет " + (myHeight - notMyHeight) + " см\n");

        int a = 3;
        float b = 9.3F;
        System.out.println("Сколько будет 9 умножить на 3? Ответ получится " + (a * b));

        int ab = 3;
        float ba = 9.3F;
        System.out.println("Деление значения ba на ab даст ответ без остатка = " + (ba %- ab));

        System.out.println("--------------------------------------------");

        int days = 366;
        int months = 12;
        double weeks = (double) days / months; // Без указания (double) выводит значение без остатка
        System.out.println("Количество недель в году составляет  " + weeks);

        System.out.println("Остаток месяцев от дней: " + (days%months));

        int num1 = 3;
        int num2 = 10;
        System.out.println("Умножение num1 на num2 = " + (num1 *= num2));
    }
}




public static void casting(){
    // Приведение типов
    // 1. Автоматическое
    // 1.1. Когда компилятор может самостоятельно расширить значение, для этого две или более переменные
    // должны иметь достаточное пространство и тип данных
    short value = 31_456;
    int intValue = value; // автоматическое расширение типа, потому что значение типа short может свободно уложиться
    // в тип данных int
    long myLong = intValue; // int меньше по размеру и меньше по данным нежели long, поэтому автоматически сделает

    double myDouble = intValue; // double 8 bytes и может свободно хранить значения типа int

    // 2. Принудительное
    double doubleBigValue = 34_568;
    int storeDouble = (int) doubleBigValue; // когда идет сужение данных от большего к наименьшему я обязан
    // это принудить сделать компилятор

    // 56.567 (int) 56

    // Есть типы, которые нельзя ни к чему привести
    boolean isAlive = true;
    // MISTAKE: int booleanValue = (int) isAlive;

    int age = 36;
    // Из целого числа в строчку можно лишь через специальный метод
    // String name = 35; -> MISTAKE
    // From Integer to String
    String stringAge = String.valueOf(age);
    // From String to Integer
    int stringAgeConverted = Integer.parseInt(stringAge);
}


