package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String h:collectionA.keySet()){
            for(String j:object.get("value")){
                if (h.equals(j)){
                    if (collectionA.get(h)/3 >0){
                        Integer i = collectionA.get(h)/3;
                        Integer v = collectionA.get(h);
                        collectionA.put(h,v-i);
                    }else {
                        Integer i = collectionA.get(h);
                        collectionA.put(h,i-1);
                    }

                }
                collectionA.put(h,collectionA.get(h));

            }

        }
        return collectionA;

    }
}
