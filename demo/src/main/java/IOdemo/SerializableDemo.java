package IOdemo;

import java.io.*;

/**
 * @author zzj
 * 该类用来显示序列化和反序列化的例子
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(1001, "同学", 24, new Book(123, "西游记"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person1.ser"));
        oos.writeObject(p1);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person1.ser"));
        Person p2 = (Person) ois.readObject();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.book == p2.book);
        ois.close();
    }
}

class Person implements Serializable {

    int pid;
    String name;
    int age;
    Book book;

    public Person(int pid, String name, int age, Book book) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}

class Book implements Serializable {
    int bid;
    String namne;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", namne='" + namne + '\'' +
                '}';
    }

    public Book(int bid, String namne) {
        this.bid = bid;
        this.namne = namne;
    }
}