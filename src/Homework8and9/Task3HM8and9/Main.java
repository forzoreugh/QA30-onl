package Homework8and9.Task3HM8and9;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        System.out.println();

        ContactFinance contactFinance = null;
        try {
            contactFinance = new ContactFinance("555/111/22", new Date(122, 2,
                    2), "ИО-22-00",
                    200_000);
            register.saveDocuments(contactFinance);
            register.getInfoDocuments(contactFinance);
        } catch (DocNumbException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        ContractCommoditys contractCommoditys = null;
        try {
            contractCommoditys = new ContractCommoditys("abc", new Date(125,
                    1, 3),
                    "Типовой", 22);
            register.saveDocuments(contractCommoditys);
            register.getInfoDocuments(contractCommoditys);
        } catch (DocNumbException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        ContractEmployee contractEmployee = null;
        try {
            contractEmployee = new ContractEmployee("TEST/1a2b", new Date(123, 12, 12),
                    "Артем", new Date(125, 1, 1));
            register.saveDocuments(contractEmployee);
            register.getInfoDocuments(contractEmployee);
        } catch (DocNumbException e) {
            System.out.println(e.getMessage());
        }
    }
}
