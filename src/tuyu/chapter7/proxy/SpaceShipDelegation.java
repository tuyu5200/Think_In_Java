package tuyu.chapter7.proxy;

/**
 * Program is use 代理
 * Version: 2016/8/7
 * Author: Tuyu
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls= new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
   //Delegated Methods 使用代理方法
    /**
     * 代理是继承和组合之间的中庸之道，解决了下列难题
     * 我们将一个成员对象置于所要构造的类中（就像组合），但与此同时我们在新类中暴露了该成员对象的所有方法（就行继承）。
     */
    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void forward(int velocity) {
        controls.foward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShip = new SpaceShipDelegation("NASA");
        spaceShip.forward(100);

    }
}
