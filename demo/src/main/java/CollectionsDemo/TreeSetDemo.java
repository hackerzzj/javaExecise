package CollectionsDemo;

import java.util.TreeSet;

/**
 * @author:Administrator
 * @date:2021/3/24 0024 10:55
 */
public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet set = new TreeSet();
//        set.add(100);
//        set.add("1234");
//        set.add(true);
//        set.add('x');
//        System.out.println(set.size());
//        System.out.println(set);
        TreeSet<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(304);
        System.out.println(set.size());
        System.out.println(set);
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("asdf");
        set1.add("assf");
        set1.add("addf");
        set1.add("aeff");
        System.out.println(set1.size());
        System.out.println(set1);
        TreeSet<Student> set2 = new TreeSet<>();
        set2.add(new Student(12,"sum"));
        set2.add(new Student(13,"jack"));
        set2.add(new Student(14,"chen"));
        set2.add(new Student(15,"liu"));
        System.out.println(set2);
    }
}
class Student implements Comparable<Student>{
    int age;
    String name;
    static int i = 0;
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        // 都返回0的话，就会输出一个元素
        // 返回正数时，代表该属性值的升序-->本身属性-参数属性
        // 返回负数时，代表该属性值的降序-->参数属性-本身属性
        System.out.print("比较了"+i+++"次");
        System.out.println(this.name+"  "+o.name);
        return o.age - this.age;
    }
}
