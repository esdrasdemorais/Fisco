
package br.com.esdrasmorais.cashflow.domain.model;

import java.util.Date;
import java.util.SimpleDateFormat;
import br.com.esdrasmorais.cashflow.domain.model.interfaces;

public class TaxCouponEletronic extends IdentifiedDomainObject implements ICoupon {
    private static final header = "";

    private static final separator = "------------------------------------";

    private static final title = "CUPOM FISCAL";  

    private static final version = "01.00.00 ECF:002 LJ:0001";

    private DateTime time;

    public TaxCoupon() {
        this.setTime(new Date());
    }

    public String getTime() {
        SimpleDateFormat sdf = new SimpleDateFormat(
            "dd/MM/yyyy HH:mm:ss"
        );
        return sdf.format(this.time) + "V";
    }

    private void setTime(Date date) {
        this.time = date;
    }

    public void setHeader(String header) {
        this.header = header.trim().length() == 0 ?
            "COMERCIAL TRES IRMAOS LTDA - ME\n" +
            "Av. Otávio Braga de Mesquita, 3795 Jd. São Geraldo\n" +
            "CEP:07140-230 TEL:(11)4307-1852 GUARULHOS SP\n" +
            "CNPJ:49.284.557/0001-90\nIE:336.098.866.112" : header;
    }

    public void setTitle(String title) {

    }

    public void setSeparator(String separator) {

    }

    public String getCode() {

    }

    public void setFooter(String footer) {

    }

    public void setItems(List<OrderItem> items) {

    }

    public boolean save(Coupon coupon) {

    }

    public boolean cancel(Coupon coupon) {
    
    }
}
