package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PracticeA {
    List<String> c = null;
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        c = new ArrayList(collection1);
        c.retainAll(collection2);
        return c;

    }
//        collection2.addAll(collection1);
//        HashMap<String,Integer> mapList=new HashMap<>();
//        for(String str:collection2){
//            int count=0;
//            if(mapList.get(str)!=null){
//                count=mapList.get(str)+1;
//            }
//            mapList.put(str,count);
//        }
//        System.out.println("11:");
//        for(String key:mapList.keySet()){
//            if(mapList.get(key)!=null && mapList.get(key)>0){
//                System.out.println(key);
//            }
//        }
//
//        return null;
    }

//    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        list1.add("a");
//        list1.add("b");
//        list1.add("c");
//        list1.add("d");
//        list2.add("d");
//        list2.add("f");
//        list2.add("a");
//        list2.add("h");
//        list2.add("k");
//        List<List<String>> list3=new ArrayList<>();
//        list3.addAll(Collections.singleton(list2));
//        PracticeA practiceA= new PracticeA();
//        PracticeB practiceB= new PracticeB();
//        practiceA.collectSameElements(list1,list2);
//        practiceB.collectSameElements(list1,list3);
//
//    }

