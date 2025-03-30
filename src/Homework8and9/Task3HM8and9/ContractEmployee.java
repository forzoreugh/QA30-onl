package Homework8and9.Task3HM8and9;

import java.util.Date;

public class ContractEmployee extends Document {
    protected String name;
    protected Date dateEndContract;

    public ContractEmployee(String numDoc, Date dateDoc, String name, Date dateEndContract) throws DocNumbException{
        super(numDoc, dateDoc);
        this.name = name;
        this.dateEndContract = dateEndContract;
    }

    public ContractEmployee(){
        super();
    }


    @Override
    public String getInformation() {
        return "Контракт с сотрудником.\nНомер документа: " + numDoc + "\nИмя сотрудника: " +
                name + "\nДата окончания контракта: " + dateEndContract + "\nДата документа: " + dateDoc;

    }
}
