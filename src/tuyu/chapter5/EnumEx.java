package tuyu.chapter5;

import static tuyu.chapter5.Bills.TEN;
/**
 * Program is use
 * Version: 2016/8/7
 * Author: Tuyu
 */
enum Bills {
    ONE, FIVE, TEN, TEWNITY, FIFTY, HUNDRED
}
public class EnumEx {
    private Bills bills;
    public EnumEx(Bills bills) {
        this.bills = bills;
    }
    public void discrible() {
        switch (bills) {
            case  ONE:
                System.out.println("this is one bills");
                break;
            case FIVE:
                System.out.println("this is five bills");
                break;
            case TEN:
                System.out.println("this is ten bills");
                break;
            case TEWNITY:
                System.out.println("this is tewnity bills");
                break;
            case FIFTY:
                System.out.println("this is fifty bills");
                break;
            case HUNDRED:
                System.out.println("this is hundred bills");
                break;
            default:
                System.out.println("null");
        }
    }
    public static void main(String[] args) {
        for (Bills b : Bills.values()) {
            System.out.println(b + "  ordinal " + b.ordinal());
        }
        EnumEx enumEx=new EnumEx(TEN);
        System.out.println("the discrible of ten:");
        enumEx.discrible();

    }
}
