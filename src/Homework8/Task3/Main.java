package Homework8.Task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        System.out.println();

        ContactFinance contactFinance = new ContactFinance("Hello", new Date(122, 2, 2), "ИО-22-00",
                200_000);
        register.saveDocuments(contactFinance);
        register.getInfoDocuments(contactFinance);

        System.out.println();

        ContractCommoditys contractCommoditys = new ContractCommoditys("QA30-ONL", new Date(125, 1, 3),
                "Типовой", 22);
        register.saveDocuments(contractCommoditys);
        register.getInfoDocuments(contractCommoditys);

        System.out.println();

        ContractEmployee contractEmployee = new ContractEmployee("HC/33/32", new Date(123, 12, 12),
                "Артем", new Date(125, 1, 1));
        register.saveDocuments(contractEmployee);
        register.getInfoDocuments(contractEmployee);
    }
}
