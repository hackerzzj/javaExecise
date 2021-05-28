package lession18.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author:Administrator
 * @date:2021/4/15 0015 20:38
 */
public class CreateStreamDemo {
    @Test
    public void testCollection(){
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,"abc","jack","sam");
        Stream<String> liststream = list.stream();
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"123","qwqq","123123","eeer");
        Stream<String> setStream = set.stream();

    }
    public void testMap(){
        Map<String,Integer> map = new HashMap<>();
        Set<String> strings = map.keySet();
        Stream<String> stream1 = strings.stream();
        Collection<Integer> values = map.values();
        Stream<Integer> stream2 = values.stream();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream3 = entries.stream();
    }
    public void testArray(){
        int[] arr = {1,2,3,4,5,6};
        Stream<int[]> arr1 = Stream.of(arr);
        String[] arr2 = {"123","1232"};
        Stream<String> arr21 = Stream.of(arr2);

    }
}
