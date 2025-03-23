package Homework6.Task1;


class RAM {
    private String name;
    private int volume;

    public RAM() {
        this.name = "ОЗУ по умолчанию";
        this.volume = 8;

    }


    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }


    public void displayInfo() {
        System.out.println("RAM:");
        System.out.println("Название: " + name);
        System.out.println("Объем: " + volume + " ГБ");
    }
}