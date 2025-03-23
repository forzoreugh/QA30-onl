package Homework6.Task1;

class HDD {
    private String name;
    private int volume;
    private String type;

    public HDD() {
        this.name = "HDD по умолчанию";
        this.volume = 500;
        this.type = "внутренний";
    }


    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("HDD:");
        System.out.println("Название: " + name);
        System.out.println("Объем: " + volume + " ГБ");
        System.out.println("Тип: " + type);
    }
}