package com.company.collection.set;
import com.company.collection.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Set set = new HashSet();

		/*
//		去除了字符串中的重复元素。
		set.add("nba");
		set.add("java");
		set.add("haha");
		set.add("itcast");
		set.add("haha");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("itcast");*/

        /*
         *
         * 为什么学生对象没有保证唯一性呢？
         * 通过对哈希表的分析。
         * 存储元素时，先调用了元素对象的hashCode()方法，而每个学生对象都是新建立的对象，
         * 所以hashCode值都不相同，也就不需要判断equals了。
         * 想要按照需求同姓名同年龄来保证学生对象的唯一性咋办？
         * 不能使用Object中hashCode方法，需要重新定义hashCode的算法内容。
         * 简单说：重写hashCode方法。
         */
        set.add(new Student("lisi1", 21));
        set.add(new Student("lisi2", 22));
        set.add(new Student("lisi1", 21));
        set.add(new Student("lisi2", 22));
        set.add(new Student("lisi1", 21));

        "abc1".hashCode();

        for (Iterator it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

    }

}
