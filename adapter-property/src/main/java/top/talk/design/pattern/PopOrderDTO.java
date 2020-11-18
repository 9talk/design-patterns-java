package top.talk.design.pattern;

import java.util.Date;

/**
 * 外部订单实体类
 *
 * @author DING
 */
public class PopOrderDTO {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 用户ID
     */
    private String popUid;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 商品名称
     */
    private String sku;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品金额
     */
    private String decimal;
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getPopUid() {
        return popUid;
    }
    
    public void setPopUid(String popUid) {
        this.popUid = popUid;
    }
    
    public Date getOrderTime() {
        return orderTime;
    }
    
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    
    public String getSku() {
        return sku;
    }
    
    public void setSku(String sku) {
        this.sku = sku;
    }
    
    public String getSkuName() {
        return skuName;
    }
    
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    
    public String getDecimal() {
        return decimal;
    }
    
    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }
    
    @Override
    public String toString() {
        return "PopOrderDTO{" +
                "orderId='" + orderId + '\'' +
                ", popUid='" + popUid + '\'' +
                ", orderTime=" + orderTime +
                ", sku='" + sku + '\'' +
                ", skuName='" + skuName + '\'' +
                ", decimal='" + decimal + '\'' +
                '}';
    }
}
