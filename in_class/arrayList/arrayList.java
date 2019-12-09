import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(); // default size is 10

    for (int i = 0; i < 200; i++) {
      list.add(i);
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for (int i : list) {
      System.out.println(i);
    }

  }
}
