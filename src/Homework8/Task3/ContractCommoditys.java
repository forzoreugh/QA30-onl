package Homework8.Task3;

import java.util.Date;

public class ContractCommoditys extends Document {
    protected String typeCommoditys;
    protected int countCommoditys;

    public ContractCommoditys(String numDoc, Date dateDoc, String typeCommoditys, int countCommoditys){
        super(numDoc, dateDoc);
        this.typeCommoditys = typeCommoditys;
        this.countCommoditys = countCommoditys;
    }

    public ContractCommoditys(){
        super();
    }


    @Override
    public String getInformation() {
        return "Контракт на поставку товара.\nНомер документа: " + numDoc + "\nТип товара: " +
                typeCommoditys + "\nКоличество товара: " + countCommoditys + "\nДата документа: " + dateDoc;
    }

}
