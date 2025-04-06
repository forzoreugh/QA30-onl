package Homework10.Task1;

public class StartString {
    public static void StartString1(String document) {
        System.out.println("Изначальный документ: " + document);
        Port1(document);
    }

    public static void Port1(String document) {
        getOne(document);
        getTwo(document);
        getThree(document);
        getFour(document);
        getFive(document);
        getSix(document);
        getSeven(document);
    }

    public static void getOne(String document) {
        String[] doc = document.split("-");
        System.out.println("Первое условие: " + doc[0] + "-" + doc[1]);
    }

    public static void getTwo(String document) {
        String doc = document.replaceAll("[(a-zA-Z)]{3}", "***");
        System.out.println("Второе условие: " + doc);
    }

    public static void getThree(String document) {
        String[] doc = document.split("-");
        System.out.println("Третье условие: " + doc[1].toLowerCase() + "/" + doc[3].toLowerCase()
                + "/" + doc[4].toLowerCase().charAt(1)
                + "/" + doc[4].toLowerCase().charAt(3));
    }

    public static void getFour(String document) {
        String[] doc = document.split("-");
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        stringBuilder.append(doc[1].toUpperCase()).append("/");
        stringBuilder.append(doc[3].toUpperCase()).append("/");
        stringBuilder.append(doc[4].toUpperCase().charAt(1)).append("/");
        stringBuilder.append(doc[4].toUpperCase().charAt(3));
        System.out.println("Четветрое условие: " + stringBuilder);
    }

    public static void getFive(String document) {
        if (document.toLowerCase().contains("abc")) {
            System.out.println("Пятое условие: Последовательность abc или ABC содержится документе!");
        } else {
            System.out.println("Пятое условие: Последовательность abc или ABC отсутствует.");
        }
    }

    public static void getSix(String document) {
        if (document.startsWith("555")) {
            System.out.println("Шестое условие: Последовательность 555 содержится в начале документа!");
        } else {
            System.out.println("Шестое условие: Последовательность 555 отсутствует.");
        }
    }

    public static void getSeven(String document){
        if (document.endsWith("1a2b")) {
            System.out.println("Седьмое условие: Последовательность 1a2b содержится в конце документа!");
        } else {
            System.out.println("Седьмое условие: Последовательность 1a2b отсутствует.");
        }
    }
}
