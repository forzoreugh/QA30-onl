package Homework6.Task1;

class Computer {

    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;


    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void displayInfo() {
        System.out.println("Компьютер:");
        System.out.println("Стоимость: " + price + " USD");
        System.out.println("Модель: " + model);
        ram.displayInfo();
        hdd.displayInfo();
    }

        public static void main(String[] args){
            Computer computer1 = new Computer(1000, "Модель 1");
            computer1.displayInfo();

            System.out.println();

            RAM ram2 = new RAM("Kingston", 16);
            HDD hdd2 = new HDD("Seagate", 1000, "внешний");
            Computer computer2 = new Computer(1500, "Модель 2", ram2, hdd2);
            computer2.displayInfo();
        }
    }