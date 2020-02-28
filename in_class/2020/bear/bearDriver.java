public class bearDriver {
  public static void main(String[] args) {
    bear mama = new bear();
    bear dog = new bear();
    bear friend = new bear();
    bear francis = new bear();

    mama.hug(dog);
    dog.hug(friend);
    friend.hug(francis);
    friend.hug(dog);
    friend.hug(dog);
    friend.hug(friend);

    System.out.println(friend.getHugs());
    System.out.println(bear.getTotalHugs());
    mama = dog = friend = francis = null; //kills all bears, but bear class still keeps track of totalHugs becuase it is static
    System.out.println(bear.getTotalHugs());
  }
}
