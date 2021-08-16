package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        String substring1 = "";
        Map<String,Integer> map = new HashMap<>();
        for(String str:collection1){
            Integer i = 1; //定义一个计数器，用来记录重复数据的个数

            if(map.get(str) != null){
                i=map.get(str)+1;
            }

            if (str.contains("-")){
                String substring = str.substring(2);
                Integer i1 = Integer.valueOf(substring);
                substring1 = str.substring(0,1);
                str = substring1;
                for (Map.Entry<String, Integer> m :map.entrySet())  {
                    if (m.getKey()=="t"){
                        map.put( m.getKey(),m.getValue() +1 );
                    }
                }
                i = i1;
            }



            if (str.contains("[")){
                int index1 = str.indexOf("[");
                int index2 = str.indexOf("]");
                String s = str.substring(index1 + 1, index2);
                Integer it1 = Integer.valueOf(s);
                str = str.substring(0,1);
                i = map.get(str) + it1;
            }
               /* if (str.contains("-")){
                    String substring = str.substring(2);
                    Integer it2 = Integer.valueOf(substring);
                    str = str.substring(0,1);

                }*/


            if (str.contains(":")){
                String substring = str.substring(2);
                Integer i5 = Integer.valueOf(substring);
                i = i5 +i-1;
                substring1 = str.substring(0,1);
                str = substring1;
            }

            map.put(str,i);
        }
        return map;
    }
}
