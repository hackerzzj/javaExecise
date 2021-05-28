package snake;

import java.util.LinkedList;

/**
 * @author:Administrator
 * @date:2021/3/24 0024 14:44
 */
public class SnakeFiled {
    // 高度和宽度
    public static final int MAX_X = 20;
    public static final int MAX_Y = 10;
    // 射对象
    Snake snake;
    // TODO 游戏棋盘上有食物对象
    // TODO 食物初始化
    public void print(){
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_X; j++) {
                if (i==0||i==MAX_Y-1||j==0||j==MAX_X-1){
                    System.out.print("*");
                } else if (snake.contains(j,i)){
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public SnakeFiled() {
    }

    public SnakeFiled(Snake snake) {
        this.snake = snake;
    }
}
