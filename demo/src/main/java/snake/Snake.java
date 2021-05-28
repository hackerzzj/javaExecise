package snake;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author:zzj
 *
 * @date:2021/3/24 0024 11:34
 */
public class Snake {
    LinkedList<Node> snake ;
    // 定义方向
    int dir;
    // 定义方向的四个常量
    public static final int LEFT = -10;
    public static final int RIGHT = 10;
    public static final int DOWN = 1;
    public static final int UP = -1;
    // 定义蛇的构造函数

    public Snake() {
        this.snake = new LinkedList<Node>();
        this.snake.add(new Node(2,2));
        this.dir = DOWN;
    }

    public Snake(LinkedList<Node> snake, int dir) {
        this.snake = snake;
        this.dir = dir;
    }
    // 蛇的移动方法
    public void step(int dir) {
        // 判断是否与上次移动正好相反，相反则不允许移动
        if (this.dir+dir==0){
//            System.out.println("方向反了");
//            System.exit(0);
            throw new IllegalArgumentException("方向反了");
        }
        // 得到头部
        Node head = snake.getFirst();
        int x = head.getX()+dir/10;
        int y = head.getY()+dir%10;
        Node newHead = new Node(x,y);
        // TODO 判断是否撞墙
        if (x == 0||x == SnakeFiled.MAX_X-1||y == 0||y == SnakeFiled.MAX_Y-1){
            throw new IllegalArgumentException("撞墙");
        }
        // 判断是否撞到了自己
        if (snake.contains(newHead)){
            System.out.println("you are dead");
            System.exit(0);
        }
        snake.addFirst(newHead);
        // 判断是否吃了东西
        snake.removeLast();
        this.dir = dir;
    }
    // 蛇的移动方法
    public void step()  {
        this.step(this.dir);
    }
    private boolean eat(){
        return false;
    }
    // 这个方法就是用来判断是否包含
    public boolean contains(int x,int y) {
        Iterator<Node> ite = snake.iterator();
        while (ite.hasNext()){
            Node node = ite.next();
            if (node.getX() == x && node.getY() == y){
                return true;
            }
        }
        return false;
    }
}
