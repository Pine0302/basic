package com.company.collection.map;


import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 练习：
         * "werertrtyuifgkiryuiop",获取字符串中每一个字母出现的次数。
         * 要求返回结果个格式是  a(1)b(2)d(4)......;
         * 思路：
         * 1，获取到字符串中的每一个字母。
         * 2，用字母取查表，如果查到了该字母对应的次数，就将这个次数+1后重新存回表中。
         * 	如果没有查到呢？将该字母和1存到表中。
         * 3，每一字母都查完表后，表中记录的就是所有字母出现的次数。
         *
         * 字母和次数之间存在对应关系，而且字母是唯一性的，所以可以使用map集合做表进行查询。
         * 通过结果发现 字母有顺序的，所以可以通过map集合中的treemap作为表。
         *
         */

        String str = "awaa+acr=ebarct,btydui[efgkiryuiop";
        str = getCharCount(str);
        System.out.println(str);
    }

    /**
     * 获取字符串中的字母出现次数。
     *
     * @param str
     * @return 返回一个每一个字母对应次数的字符串 格式  char1(count)char2(count).....;
     */
    public static String getCharCount(String str) {

        //1，将字符串转成字符数组。
        char[] chs = str.toCharArray();

        //2，定义表。treemap.
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        //3，遍历字符数组。
        for (int i = 0; i < chs.length; i++) {

            //判断必须是字母。
            if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z')){
                continue;
            }

            //4，将遍历到的字母作为键去查map这个表。获取对应的次数。
            Integer value = map.get(chs[i]);

            //5，有可能要查询的字母在表中不存在对应的次数，需要判断。
            //如果返回是null，说明字母没有对应的次数。就将这个字母和1存储到表中。
            if(value == null){

                //将字母和1存储。
                map.put(chs[i],1);
            }else{

                //否则，说明有对应的次数对次数自增。将字母和新的次数存储到表中。
                value++;
                map.put(chs[i],value);
            }
			/*
			 //两个if判断，选择哪个都行。
			int count = 0;
			if(value!=null){
				count = value;//用count记录次数。
			}
			count++;//自增。
			map.put(chs[i], count);
			*/
        }

        //将map集合中的键值转成   格式是  a(1)b(2)d(4)......


        return mapToString(map);
    }

    /*
     * 将map集合中的键值转成   格式是  a(1)b(2)d(4)......
     * map中有很多数据，无论是多少个，什么类型，最终都变成字符串。
     * StringBuffer 这个容器就符合这个需求。如果是单线程，建议使用StringBuilder。
     *
     */
    private static String mapToString(Map<Character, Integer> map) {
        //1，明确容器。
        StringBuilder sb = new StringBuilder();

        //2,遍历map集合。
        for(Character key  : map.keySet()){
            Integer value = map.get(key);

            sb.append(key+"("+value+")");
        }
        return sb.toString();
    }
}

