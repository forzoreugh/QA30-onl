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
        casting();
    }

    /*
    Приведение типов бывает: (1) Автоматическое (2) Принудительное
    (1) Комплитор сам может расширить значение, две и более переменных должны иметь пространство и тип данных
    (2) При сужении данных требуется принудить комплиятор сделать это
    */
    public static void casting() {

        // (1)
        byte yourByte = 127;
        int yourInt = yourByte;
       // long yourLong = yourInt; (также сработает)
        double yourDouble = yourInt; // byte < int < double, поэтому сделает автоматически
        System.out.println("Автоматическое расширение = " + yourDouble);

        // (2)
        long myLong = 1_000_000_000L;
        int myInt = (int) myLong; // без принудительного (int) сужение не сработает
        System.out.println("Сужение данных = " + myInt);

        int myAge = 23;
        String stringAge = String.valueOf(myAge); // из integer в string через данный метод
        System.out.println("Сколько мне лет? Ответ = " + stringAge);
        int stringAgeConverted = Integer.parseInt(stringAge); // из string в integer
        System.out.println("Сколько мне лет? Ответ = " + stringAgeConverted);

        boolean isAlive = true; // данный тип нельзя привести к чему-либо

    }
}

