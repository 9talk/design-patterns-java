package top.talk.design.pattern;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 属性适配器
 *
 * @author DING
 */
public class PropertyAdapter {
    
    private static final ObjectMapper MAPPER = new ObjectMapper();
    
    public static UnityOrderDTO doConvert(OrderDTO orderDTO, Map<String, String> link) throws IOException {
        Map<String, Object> map = MAPPER.convertValue(orderDTO, new TypeReference<Map<String, Object>>() {
        });
        return doConvert(map, link);
    }
    
    
    public static UnityOrderDTO doConvert(PopOrderDTO orderDTO, Map<String, String> link) throws IOException {
        Map<String, Object> map = MAPPER.convertValue(orderDTO, new TypeReference<Map<String, Object>>() {
        });
        return doConvert(map, link);
    }
    
    private static UnityOrderDTO doConvert(Map<String, Object> orderMap, Map<String, String> link) throws IOException {
        UnityOrderDTO result = null;
        
        // 根据link字段转换
        HashMap<String, Object> newOrderMap = new HashMap<>();
        for (Map.Entry<String, Object> order : orderMap.entrySet()) {
            String newKey = link.get(order.getKey());
            if (null != newKey) {
                newOrderMap.put(newKey, order.getValue());
            }
        }
        
        if (!newOrderMap.isEmpty()) {
            result = MAPPER.readValue(MAPPER.writeValueAsString(newOrderMap), UnityOrderDTO.class);
        }
        
        return result;
    }
    
}

