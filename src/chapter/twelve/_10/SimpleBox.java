package chapter.twelve._10;

public class SimpleBox {

  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static void main(String[] args) {
    StringBox stringBox = new StringBox();
    stringBox.setData("문자열");

//    Integer data = (Integer) stringBox.getData();
//    int i = data + 1;
//    System.out.println(i);
  }
  /*
  *
  * */

}

class StringBox {
  private String data;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

}
