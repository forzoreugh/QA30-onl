package Homework8.Task3;

public class Register {
    private int count;
    Document[] documents = new Document[10];

    public void saveDocuments(Document document){
        if (count < documents.length){
            documents[count++] = document;
        } else {
            System.out.println("Регистр переполнен, до свидания!");
        }
    }

    public void getInfoDocuments(Document document){
        System.out.println(document.getInformation());
    }
}
