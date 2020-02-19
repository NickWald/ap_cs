public class bear {
  private int hugCount;
  private static int totalHugs;

  public bear () {
    hugCount = 0;
    hugCount += totalHugs;
  }

  public void hug(bear b1){
    totalHugs++;
  }

  public static int returnHugs(){
    return hugCount+totalHugs;
  }
}
