package top.talk.design.pattern;

import java.util.Date;

/**
 * 订单超集实体类
 *
 * @author DING
 */
public class UnityOrderDTO {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 订单创建时间
     */
    private Date createOrderTime;
    /**
     * 商品ID
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
    /**
     * 商品标签
     */
    private String label;
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public Date getCreateOrderTime() {
        return createOrderTime;
    }
    
    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
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
    
    public String getLabel() {
        return label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return "UnityOrderDTO{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", createOrderTime=" + createOrderTime +
                ", sku='" + sku + '\'' +
                ", skuName='" + skuName + '\'' +
                ", decimal='" + decimal + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
