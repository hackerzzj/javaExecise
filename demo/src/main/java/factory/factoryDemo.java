package factory;

/**
 * @author:
 * @date:2021/3/26 0026 17:49
 */
public class factoryDemo {


    public static void main(String[] args) {
        Apple apple = (Apple) FruitFactory.getApple();
        Banana banana = (Banana) FruitFactory.getBanana();
    }
}
class FruitFactory {
    public static  Fruit getApple(){
        return new Apple();
    }
    public static Fruit getBanana(){
        return new Banana();
    }
}
interface Fruit{
     void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("苹果好吃");
    }
}
class Banana implements Fruit{
    public void eat(){
        System.out.println("香蕉好吃");
    }
}