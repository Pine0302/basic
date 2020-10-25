package com.company.io.file;

import java.io.File;
import java.util.LinkedList;

public class GetAllFilesByQueue {

    /*
     * 遍历文件夹，不用递归咋办？
     * 思路：
     * 1，可以通过对每一个目录进行for循环，但是目录层级很多，for会死掉。
     * 2，每遍历到一个目录，不对其进行遍历，而是先临时存储起来。 相当于把所有目录（无论同级不同级）都存储起来。
     * 3，遍历容器时取到就是目录，然后对目录遍历即可。 4，从容器中取到目录遍历时发现内部还有目录，一样将这些目录存储到容器中。
     * 5，只要不断的遍历这个容器就哦了。
     *
     * 通过图解：发现这个容器只要是一个简单的队列就可以解决这个问题。
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        File dir = new File("/Volumes/Work/java_project/basic/src");
        File[] list = dir.listFiles();
        listAll(list);

    }

    public static void listAll(File[] list) {// dir:接收目录以及子目录。
        Queue<File> queue = new Queue<File>();
        // 1,对dir进行当前目录的遍历。
        for (File file : list) {
            if (file.isDirectory()) {
                // 2, 如果有子目录，存储到队列中。
                System.out.println("dir:" + file.getName());
                queue.QAdd(file);
            }else{
                System.out.println("file:" + file.getName());
            }
        }
        //3,遍历队列容器。因为子目录都在队列中。
        while(!queue.isNull()){
            File subDir = queue.Qget();
            //4,遍历子目录。
            for (File subfile : subDir.listFiles()){
                if (subfile.isDirectory()) { //如果子目录中还有子目录，继续存储到队列中。
                    System.out.println("dir:" + subfile.getName());
                    queue.QAdd(subfile);
                }else{
                    System.out.println("file:" + subfile.getName());
                }
            }

        }


    }

    static class Queue<E> {
        private LinkedList<E> link;

        public Queue() {
            link = new LinkedList<E>();
        }

        /**
         * 队列添加元素
         *
         * @param obj
         */
        public void QAdd(E obj) {
            link.addFirst(obj);
        }


        /**
         * 队列获取元素
         */
        public E Qget() {
            return link.removeLast();
        }

        public boolean isNull() {
            return link.isEmpty();
        }

    }


}
