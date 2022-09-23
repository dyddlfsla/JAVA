package chapter.twelve.exercise._01;

public class Ex12_1 {

  /*
   * 다음 중 오류가 발생하는 문장과 경고가 발생하는 문장은?
   *
   * ① Box<Object> b = new Box<String>();
   * ② Box<Object> b = (Object) new Box<String>();
   * ③ new Box<String>().setItem(new Object());
   * ④ new Box<String>().setItem("ABC");
   *
   * sol: ① → 참조변수의 타입 매개변수와 생성자의 타입 매개변수는 일치해야 하므로 에러가 발생한다.
   *      ② → 참조변수의 타입은 Box<String> 인데 대입되는 타입은 Object<String> 이므로 형변환 에러가 발생한다.
   *      ③ → setItem() 메서드는 매개변수로 T 를 받고 있는데 객체가 new Box<String>()으로 만들어졌다면
   *           해당 메서드의 선언부는 void setItem(String item) 이다. 그런데 이 메서드의 매개변수로 new Object() 를 넣게 되면 형변환 에러가 발생한다.
   *
   *
   *
   * */
  public static void main(String[] args) {
//    Box<Object> b = new Box<String>();
//    Box<Object> b2 = (Object) new Box<String>();
//    new Box<String>().setItem(new Object());
//    new Box<String>().setItem("ABC");
  }

}

class Box<T> {
  T item;

  void setItem(T item) {
    this.item = item;
  }

  T getItem(T item) {
    return item;
  }
}





