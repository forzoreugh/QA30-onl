package Homework8and9.Task3HM8and9;

import java.util.Date;

public abstract class Document {
    protected String numDoc;
    protected Date dateDoc;


    public Document(String numDoc, Date dateDoc) throws DocNumbException {
        validateDocNumber(numDoc);
        this.numDoc = numDoc;
        this.dateDoc = dateDoc;
    }

    protected void validateDocNumber(String numDoc) throws DocNumbException {
        if (numDoc.contains("abc")) {
            throw new DocNumbException("Номер документа не должен содержать 'abc'.");
        }
        if (numDoc.startsWith("555")) {
            throw new DocNumbException("Номер документа не должен начинаться с '555'.");
        }
        if (numDoc.endsWith("1a2b")) {
            throw new DocNumbException("Номер документа не должен заканчиваться на '1a2b'.");
        }
    }
   public Document(){}

    public abstract String getInformation();
}
