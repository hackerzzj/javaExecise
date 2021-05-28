package lession9.javaBean; //有包

import java.io.Serializable;
import java.util.Objects;

/**
 * @author:Administrator
 * @date:2021/3/5 0005 10:22
 */
// public修饰
public class PojoDemo implements Serializable { //序列化接口
    // 私有化
    private int id;
    private String name;
    // 无参构造
    // get、set方法

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
