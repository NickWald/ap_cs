public class bearDriver {
  public static void main(String[] args) {
    bear mama = new bear();
    bear baby = new bear();
    bear papa = new bear();

    mama.hug(baby);
    mama.hug(papa);
    mama.hug(papa);

    mama.returnHugs();
  }
}
