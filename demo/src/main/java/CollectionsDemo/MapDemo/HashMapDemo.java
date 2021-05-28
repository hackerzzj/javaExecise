package CollectionsDemo.MapDemo;

import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:zzj
 * @date:2021/3/24 0024 22:48
 * Map是一个具有键值对特性的接口
 * HashMap是一个key不重复且无序的容器。
 * key重复放入会导致value的覆盖。
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1001,"张三");
        map.put(1002,"李四");
        map.put(1003,"王五");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(1001));;
        System.out.println(map.containsValue("张三"));
        System.out.println(map.isEmpty());
        // 迭代方式一
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println("key"+next+"value"+map.get(next));
        }
        // 迭代方式二
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator1 = set2.iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer,String> next = iterator1.next();
            System.out.println("key2"+next.getKey()+"value2"+next.getValue());
        }
    }
}
