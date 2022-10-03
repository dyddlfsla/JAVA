package chapter.fourteen._46;

public class Chapter14_46 {
  /*
  * ◆ 스트림을 컬렉션, 배열로 반환
  *
  * 스트림의 모든 요소를 컬렉션에 수집하려면, Collectors 클래스의 toList() 와 같은 메서드를 사용하면 된다.
  * List 나 Set 이 아닌 특정 컬렉션을 지정하려면, toCollection() 에 원하는 컬렉션의 생성자 참조를 매개변수로 넣어주면 된다.
  *
  * List<String> names = stuStream.map(Student::getName)
  *                               .collect(Collectors.toList()); // List 컬렉션 으로 반환.
  * ArrayList<String> list = names.stream()
  *                               .collect(Collectors.toCollection(ArrayList::new)); // ArrayList 라는 특정 컬렉션을 지정하여 반환.
  *
  * Map 은 키와 값의 쌍으로 저장해야하므로 객체의 어떤 필드를 키로 사용하고, 값으로 사용할지를 정해주어야 한다.
  *
  * Map<String, Person> map = personStream
  *                               .collect(Collectors.toMap(p -> p.getRegId(), p -> p));
  *
  * 위의 문장은 요소의 타입이 Person 인 스트림에서 사람의 주민번호(regId) 를 키로 하고, 값으로는 Person 객체 자체를 저장하도록 하여 Map 으로 반환시킨다.
  *
  * 스트림에 저장된 요소들을 'T[]' 타입의 배열로 변환하려면, toArray() 를 사용하면 된다. 단 해당 타입의 생성자 참조를 매개변수로 지정해주어야 한다.
  * 만일 매개변수를 지정하지 않으면 반환되는 배열의 타입은 'Object[]' 이다.
  *
  * Student[] stuNames = studentStream.toArray(Student[]::new); // OK.
  * Student[] stuNames = studentStream.toArray(); // 매개변수를 지정하지 않으면 자동적으로 Object[] 타입이 되는데 참조변수 타입이 Student[] 이므로 맞지 않아 에러가 발생한다.
  * Object[] stuNames = studentStream.toArray(); // OK. 참조변수의 타입을 Object[] 로 지정했기 때문에 가능하다.
  *
  *
  *
  *
  *
  *
  *
  * */

}
