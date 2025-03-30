package Homework8.Task3;

import java.util.Date;

public class ContactFinance extends Document{
    protected String codeDepartment;
    protected double sumCount;

    public ContactFinance(String numDoc, Date dateDoc, String codeDepartment, double sumCount){
        super(numDoc, dateDoc);
        this.codeDepartment = codeDepartment;
        this.sumCount = sumCount;
    }

    public ContactFinance(){
        super();
    };

    @Override
    public String getInformation() {
        return "Финансовая накладная.\nНомер документа: " + numDoc + "\nКод департамента: " +
                codeDepartment + "\nИтоговая сумма за месяц: " + sumCount + "\nДата документа: " + dateDoc;
    }



}
