public class bear {
  private int hugs; //instance variable (belongs to each object individually)
  private static int totalHugs = 0; //class variable (shared by all objects/bears amongst the full class)

  //declared at top so all bears have total hugs starting at 0 - you dont want to update the class variable in this case

  public bear () {
    hugs = 0;
  }

  public void hug(bear b){
    this.hugs++; //refers to bear that uses .hug
    //this. is based on use, basically, "this" becomes whatever is before the dot when used
    b.hugs++; //bear in argument / bear to be hugged
    totalHugs++;
  }

  public static int getTotalHugs(){
    return totalHugs;
  }

  public int getHugs() {
    return hugs;
  }
}
