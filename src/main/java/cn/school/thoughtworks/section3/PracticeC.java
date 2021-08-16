package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<>();
        for(String str:collectionA){
            Integer i = 1; //定义一个计数器，用来记录重复数据的个数
            if(map.get(str) != null){
                i=map.get(str)+1;
            }
            map.put(str,i);
        }
        for (String h:map.keySet()){
            for(String j:object.get("value")){
                if (h.equals(j)){
                    if (map.get(h)/3 >0){
                        Integer i = map.get(h)/3;
                        Integer v = map.get(h);
                        map.put(h,v-i);
                    }else {
                        Integer i = map.get(h);
                        map.put(h,i-1);
                    }

                }
                map.put(h,map.get(h));

            }

        }
        return map;
    }
}
