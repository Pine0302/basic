package com.company.collection.set;

import com.company.collection.comparator.ComparatorByLength;

import java.util.*;

public class HashSetTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("abcde");
        set.add("haha");
        set.add("z");
        set.add("java");

		/*Object max = Collections.max(set);
		System.out.println("max="+max);*/

       /* Object obj1 = getMax(set);
        System.out.println(obj1);*/
		/*Object obj2 = getMax(set,new ComparatorByLength());
		System.out.println(obj2);*/

    }

    /**
     * 获取Set集合的最大值，通过自然排序。
     * @param set
     * @return
     */
    public static Object getMax(Set set) {

        /*
         * 最值思路： 1，需要比较，并记录每次比较后较大的值。不断的重复这个动作(循环)
         */

        // 1，定义变量，记录较大的值，初始化为元素中的任意一个。
        // 取出set集合中一个元素，通过迭代器。
        // 先获取迭代器。
        Iterator it = set.iterator();
        // 获取其中一个元素。
        Object max = it.next();

        // 2，遍历集合，获取集合的每一个元素，
        while (it.hasNext()) {

            Object o = it.next();

            Comparable temp = (Comparable) o;

            // 3，在遍历中，和变量中记录的元素进行比较。让变量记录住比较后较大值。
            if (temp.compareTo(max) > 0) {
                max = temp;
            }
        }

        // 4，返回最大值。
        return max;
    }

    /**
     * 获取Set集合最大值，通过给定的比较器。
     * @param set
     * @param comp
     * @return
     */
    public static Object getMax(Set set, Comparator comp) {

        if (comp == null) {
            throw new NullPointerException();
        }
        /*
         * 最值思路： 1，需要比较，并记录每次比较后较大的值。不断的重复这个动作(循环)
         */

        // 1，定义变量，记录较大的值，初始化为元素中的任意一个。
        // 取出set集合中一个元素，通过迭代器。
        // 先获取迭代器。
        Iterator it = set.iterator();
        // 获取其中一个元素。
        Object max = it.next();

        // 2，遍历集合，获取集合的每一个元素，
        while (it.hasNext()) {
            Object o = it.next();
            // 3，在遍历中，和变量中记录的元素进行比较。让变量记录住比较后较大值。
            if (comp.compare(o, max) > 0) {
                max = o;
            }
        }

        // 4，返回最大值。
        return max;
    }
}
