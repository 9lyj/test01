package first.java;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        //集合
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for(int i= 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //数组
        int[] shuzu = new int[]{1,2,3};
        for (int i = 0; i < shuzu.length; i++) {
            System.out.println(shuzu[i]);
        }
        String aa ="hahah";
        System.out.println(aa.length());
    }
}
