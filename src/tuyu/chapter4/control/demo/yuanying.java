package tuyu.chapter4.control.demo;

import static net.mindview.util.Print.*;
/**
 * Program is use
 * Version: 2016/7/28
 * Author: Tuyu
 */
public class yuanying {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) (26 * Math.random() + 'a'); //加上一个偏移量“a”，即可产生小写字母
            //chars[i] = (char) c;
            printnb(chars[i] + "   ");
        }
        print();
        for (char c1 : chars) {
            switch (c1) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print(c1 + "  is yuanyin");
            }
        }
    }
}
