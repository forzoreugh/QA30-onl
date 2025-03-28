package Homework7.Task0;


public class Operation {
    public static void main(String[] args) {
getObject();
    }

    public static void getObject() {

        Phone model1 = new Phone(25748, "5s", 0.2);
        Phone model2 = new Phone(99099,"12Pro", 0.4);
        Phone model3 = new Phone(33873, "13Ultra Pro Edition", 0.6);

        System.out.println();
        model1.getInformation();
        System.out.println();
        model2.getInformation();
        System.out.println();
        model3.getInformation();

        model1.receiveCall("Artsiom Svidzinski");
        model2.receiveCall("Arsen Marrioli");
        model3.receiveCall("Daniel Feduchinni");

        model1.sendMessage(25748, 33333, 44444, 55555);

        model1.receiveCall(801713, "Artsiom Testirovich");
        model2.receiveCall(8800555, "Artsiom Proverochkin");
        model3.receiveCall(353535, "Testerov Test");
    }

}