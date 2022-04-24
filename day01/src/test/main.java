package test;

public class main {
    public static void main(String[] args) {
        System.out.println("1234");

        test1();
        test2("zhangsan");
        String s = test3(100);
        System.out.println(s);

    }
    public static void test1(){
        System.out.println("11111");
    }

    public static void test2(String str){
        System.out.println(str);
    }

    public static String test3(Integer i){
        return i.toString();
    }


}
