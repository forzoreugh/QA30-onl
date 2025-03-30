package Homework8and9.Task3HM8and9;

import java.util.Date;

public class ContactFinance extends Document{
    protected String codeDepartment;
    protected double sumCount;

    public ContactFinance(String numDoc, Date dateDoc, String codeDepartment, double sumCount) throws DocNumbException {
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
