
package com.esdrasmorais.cashflow.domain.model.interfaces;

public interface Coupon {
    public void setHeader(String header);
    public void setTitle(String title);
    public void setSeparator(String separator);
    public String getCode();
    public void setFooter(String footer);
    public void setItems(List<OrderItem> items);
    public boolean save(Coupon coupon);
    public boolean cancel(Coupon coupon);
}
