package top.talk.design.pattern;

import java.util.Date;

/**
 * 内部订单类
 *
 * @author DING
 */
public class OrderDTO {
    /**
     * 订单ID
     */
    private String id;
    /**
     * 用户ID
     */
    private String uid;
    /**
     * 下单时间
     */
    private Date createTime;
    /**
     * 商品ID
     */
    private String sku;
    /**
     * 商品标签
     */
    private String label;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUid() {
        return uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public String getSku() {
        return sku;
    }
    
    public void setSku(String sku) {
        this.sku = sku;
    }
    
    public String getLabel() {
        return label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return "OrderDTO{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", createTime=" + createTime +
                ", sku='" + sku + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
