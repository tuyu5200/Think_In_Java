package tuyu.chapter7.practice;


import static net.mindview.util.Print.*;

/**
 * Program is use
 * Version: 2016/8/7
 * Author: Tuyu
 */
public class testOverLoad extends OverLoad {
    //构造器也是static方法
    public testOverLoad() {
    }

    @Override
    void method(int i) {
        super.method(i);
        print("method extends " + i);
    }

    public static void main(String[] args) {
        testOverLoad test=new testOverLoad();
        test.method(5);
        test.method(2.5f);
        test.method("test");
        //test.method(4);

    }
}
