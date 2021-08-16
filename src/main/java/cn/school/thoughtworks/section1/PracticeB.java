package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> x = null;
        List<String> list = collection2.get(0);
        x =new ArrayList(collection1);
        x.retainAll(list);
        return x;
    }
}
