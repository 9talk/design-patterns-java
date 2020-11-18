package top.talk.design.pattern;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/**
 * 测试运行方法
 *
 * @author DING
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId("内部订单ID");
        orderDTO.setCreateTime(new Date());
        orderDTO.setLabel("内部订单标签");
        orderDTO.setUid("内部订单用户ID");
        orderDTO.setSku("内部订单SKU");
        
        HashMap<String, String> linkMap = new HashMap<>();
        linkMap.put("id", "orderId");
        linkMap.put("uid", "userId");
        linkMap.put("createTime", "createOrderTime");
        linkMap.put("sku", "sku");
        linkMap.put("label", "label");
        
        UnityOrderDTO unityOrderDTO = PropertyAdapter.doConvert(orderDTO, linkMap);
        System.out.println(unityOrderDTO);
    }
}
