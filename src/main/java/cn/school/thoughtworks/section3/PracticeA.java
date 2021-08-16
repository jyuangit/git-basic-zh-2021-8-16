package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String h:collectionA.keySet()){
            for(String j:object.get("value")){
                if (h.equals(j)){
                    Integer i = collectionA.get(h);
                    collectionA.put(h,i-1);
                }
                collectionA.put(h,collectionA.get(h));

            }

        }
        return collectionA;
    }
}
