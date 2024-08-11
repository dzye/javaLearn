package com.lagou.task15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        System.out.println(map);
        map.put("key4","value44");
        System.out.println(map);
        String key4 = map.get("key4");
        System.out.println(key4);
        Boolean b1 = map.containsKey("key1");
        System.out.println(b1);
        Boolean b2 = map.containsValue("value2");
        System.out.println(b2);
        System.out.println(map);
        String remove = map.remove("key2");
        System.out.println(remove);
        System.out.println(map);

        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for(String value : values){
            System.out.println(value);
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry : entrySet){
            System.out.println(entry);
        }
    }
}
