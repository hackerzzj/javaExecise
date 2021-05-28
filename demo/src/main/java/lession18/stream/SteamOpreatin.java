package lession18.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author:Administrator
 * @date:2021/4/15 0015 21:08
 */
public class SteamOpreatin {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张学友","王祖贤","刘德华","张三疯","张杰");
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);
        list.stream().limit(3).forEach(System.out::println);
        list.stream().skip(3).forEach(System.out::println);
        Stream<String> concat = Stream.concat(list.stream().limit(2), list.stream().skip(4));
        concat.distinct()
    }
}
