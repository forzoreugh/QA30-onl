package Task11and12;

public class MyMain {
    public static void main(String[] args) {
        MyCollection<Object> collection = new MyCollection<>();

        collection.add("HELLO");
        collection.add(123);
        collection.add("//");
        collection.add("Hi Archil");
        System.out.println("Наличие в коллекции: " + collection);

        System.out.println("В индексе 3 находится: " + collection.getIndex(3));

        collection.remove(1);
        System.out.println("При удалении индекса 1 коллекция выглядит: " + collection);

        System.out.println("Наличие в коллекции: " + collection.getElements("//"));

        collection.clearCollection();
        System.out.println("Наличие в коллекции: " + collection);
    }
}
