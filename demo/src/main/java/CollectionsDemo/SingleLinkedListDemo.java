package CollectionsDemo;

/**
 * @author:zzj
 * @date:2021/3/20 0020 15:11
 * 
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        // 创建一个node节点
        Node head = new Node("黑桃A");
        // 在当前节点上构造下一个节点
        head.next = new Node("黑桃B");
        head.next.next = new Node("梅花3");
        System.out.println(head);
    }
}
class Node{
    // 定义一个object对象，用来定义一个节点
    Object value;
    // 每个节点拥有下一个节点的对象
    Node next;
    // 创建一个有参的构造函数
    public Node(Object value) {
        this.value = value;
    }
    // 重写object方法

    @Override
    public String toString() {
        return next == null ? value.toString() : value.toString()+""+next.toString();
    }
}