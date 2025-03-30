package Homework8.Task3;

import java.util.Date;

public abstract class Document {
    protected String numDoc;
    protected Date dateDoc;


    public Document(String numDoc, Date dateDoc){
        this.numDoc = numDoc;
        this.dateDoc = dateDoc;
    }

   public Document(){}

    public abstract String getInformation();
}
