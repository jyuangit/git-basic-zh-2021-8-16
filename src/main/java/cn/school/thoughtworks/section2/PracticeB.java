package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<>();
        for(String str:collection1){
            Integer i = 1; //定义一个计数器，用来记录重复数据的个数

            if(map.get(str) != null){
                i=map.get(str)+1;
            }
            boolean contains = str.contains("-");
            if (contains){
                String substring = str.substring(2);
                i = Integer.valueOf(substring);
                String substring1 = str.substring(0,1);
                str = substring1;
            }
            map.put(str,i);
        }
        return map;

    }
}
