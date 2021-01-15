public class gameSpinner{
  private int sectorCount;
  private int spinCount; //(length)
  private int random = (int) (Math.random() * 4) + 1

  public gameSpinner(int s){
    sectorCount = s;
    spinCount = 0;
  }

  public int currentRun(){
    return spinCount;
  }

  public int spin(){
    return random;
    spinCount++;
  }
}
