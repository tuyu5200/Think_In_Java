package tuyu.chapter6.access;

/**
 * Program is use
 * Version: 2016/8/7
 * Author: Tuyu
 */
class Soup1{
    private Soup1() {}

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }
    //单例模式
    private static Soup2 ps1=new Soup2();
    public static Soup2 access() {
        return ps1;
    }

    public void f() {

    }
}
public class Lunch {
    void testPrivate(){
        //Soup1 soup1=new Soup1();
    }
    void testStatic(){
        Soup1 soup1=Soup1.makeSoup();
    }
    void testSingleTon(){
        Soup2.access().f();
    }
}
