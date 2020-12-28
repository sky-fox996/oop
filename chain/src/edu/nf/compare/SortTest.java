package edu.nf.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangl
 * @date 2020/11/23
 */
public class SortTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(6);
        list.forEach(i -> System.out.println(i));
        System.out.println("--------------------");
        Collections.sort(list);
        list.forEach(i -> System.out.println(i));
    }
}
