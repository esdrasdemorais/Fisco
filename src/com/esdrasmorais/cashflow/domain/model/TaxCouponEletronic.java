
package com.esdrasmorais.cashflow.domain.model;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import com.esdrasmorais.cashflow.domain.model.interfaces.ICoupon;

import com.esdrasmorais.cashflow.domain.model.interfaces.ICoupon;

public class TaxCouponEletronic extends IdentifiedDomainObject implements ICoupon {
    private static final String header = "";

    private static final String separator = "------------------------------------";

    private static final String title = "CUPOM FISCAL";  

    private static final String version = "01.00.00 ECF:002 LJ:0001";

    private Date time;

    public TaxCouponEletronic() {
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
        header = header.trim().length() == 0 ?
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
    	return "";
    }

    public void setFooter(String footer) {

    }

    public void setItems(List<OrderItem> items) {
    	
    }

    public boolean save(ICoupon coupon) {
    	return true;
    }

    public boolean cancel(ICoupon coupon) {
    	return true;
    }
}
