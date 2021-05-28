package snake;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2021/3/24 0024 15:10
 */
public class SnakeTestDemo {
    public static void main(String[] args) {
        LinkedList<Node> list = new LinkedList<>();
        list.add(new Node(3,3));
        list.add(new Node(3,2));
        list.add(new Node(2,2));
        list.add(new Node(1,3));
        Snake snake = new Snake(list,Snake.RIGHT);
        SnakeFiled snakeFiled = new SnakeFiled(snake);
        Scanner sc = new Scanner(System.in);
        while (true) {
            snakeFiled.print();
            String order = sc.next();
            if("w".equalsIgnoreCase(order)){
                snake.step(Snake.UP);
            } else if("s".equalsIgnoreCase(order)){
                snake.step(Snake.DOWN);
            }else if("a".equalsIgnoreCase(order)){
                snake.step(Snake.LEFT);
            }else if("d".equalsIgnoreCase(order)){
                snake.step(Snake.RIGHT);
            } else {
                System.out.println("请输入WASD来移动");
            }
        }
    }
}
