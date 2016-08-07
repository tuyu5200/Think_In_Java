package tuyu.chapter7.practice;

import static net.mindview.util.Print.*;
/**
 * Program is use
 * Version: 2016/8/7
 * Author: Tuyu
 */
public class OverLoad {
    /**
     * 默认访问权限是 包访问权限
     * @param i
     */
    void method(int i) {
        print("method int "+i);
    }

    void method(String s) {
        print("method string " + s);
    }

    void method(float f) {
        print("method float " + f);
    }
}
