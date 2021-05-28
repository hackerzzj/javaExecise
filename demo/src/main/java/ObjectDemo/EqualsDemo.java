package ObjectDemo;

/**
 * @author:Administrator
 * @date:2021/3/2 0002 11:40
 * 1、首先判断两个对象是否相等
 * 2、判断传入的对象是否为null
 * 3、判断传入的对象的类型是否与调用对象的类型相等
 * 4、强制转换传入的类型
 * 5、判断两个对象的属性值是否相等
 */
public class EqualsDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add1 = new Address("Beijing");
//        Address add2 = new Address("Changsha");
        Address add2 = (Address) add1.clone();
//        add1.city = "shijiazhuang";
        person p1 = new person("wu",12,add1);
        person p2 = new person("wu",12,add2);
        System.out.println(p1.equals(p2));
    }
}
class person{
    String name;
    int age;
    Address address;

    public person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public person() {
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        } else if(object.getClass() != getClass()){
            return false;
        } else if(object == this){
            return true;
        } else {
            person p1 = (person) object;
            if(p1.address.city.equals(this.address.city) && p1.name.equals(this.name) && p1.age == this.age){
                return true;
            } else {
                return false;
            }
        }
    }
}
class Address implements Cloneable{
    String city;

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
