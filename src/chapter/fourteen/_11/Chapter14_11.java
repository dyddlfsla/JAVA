package chapter.fourteen._11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Chapter14_11 {

  /*
  * ◆ 컬렉션 프레임워크와 함수형 인터페이스
  *
  * 컬렉션 프레임워크의 인터페이스에 다수의 디폴트 메서드가 추가되었는데, 그 중의 일부는 함수형 인터페이스를 사용한다.
  *
  * 1. Collection
  * boolean removeIf(Predicate<E> filter): 조건에 맞는 요소를 삭제한다.
  *
  * 2. List
  * void replaceAll(UnaryOperator<E> operator): 모든 요소를 변환하여 대체
  *
  * 3.Iterable
  * void forEach(Consumer<T> action): 모든 요소에 작업 action 을 수행
  *
  * 4.Map
  * V compute(K key, BiFunction<K, V, V> biFunction): 지정된 키의 값에 작업 biFunction 을 수행함.
  * V computeIfAbsent(K key, Function<K, V> function): 지정된 키가 없으면, 작업 function 을 수행.
  * V computeIfPresent(K key, BiFunction<K, V, V> biFunction): 지정된 키가 있으면, 작업 biFunction 을 수행.
  * V merge(K key, V value, BiFunction<V, V, V> biFunction): 모든 요소에 병합작업 biFunction 을 수행.
  * void forEach(BiConsumer<K, V> action): 모든 요소에 작업 action 을 수행.
  * void replaceAll(BiFunction<K, V, V> biFunction): 모든 요소에 치환작업 biFunction 을 수행.
  *
  * 이름만 봐도 어떤 일을 수행하는지 대강 알 수 있다. Map 인터페이스에 있는 'compute' 로 시작하는 메서드들은 맵의 value 을 변환하는 일을 하고
  * merge() 는 Map 을 병합하는 일을 한다.
  *
  *
  *
  * */

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    list.forEach(System.out::print);
    System.out.println();

    Predicate<Integer> f1 = x -> (x % 2 == 0);
    Predicate<Integer> f2 = x -> (x % 3 == 0);

    list.removeIf(f1.or(x -> x % 3 == 0));
    System.out.println(list);

    list.replaceAll(i -> i * 10);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();

    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    map.forEach((k, v) -> System.out.printf("{ %s, %s },", k, v));
    System.out.println();
  }
}
