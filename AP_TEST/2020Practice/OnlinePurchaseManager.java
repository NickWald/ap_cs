public class OnlinePurchaseManager{
/**
* An ArrayList of purchased Gizmo objects, instantiated in the constructor.
*/
  private ArrayList<Gizmo> purchases;

/**
* @return the number of purchased Gizmo objects that are
* electronic and are
* manufactured by maker, as described in part (a).
*/
  public int countElectronicsByMaker(String maker){
       /* to be implemented in part (a) */
    int count = 0;
    for(Gizmo g : purchases){
      //or for(int i = 0; i < purchases.size(); i++){
      if(g.isElectronic() && g.getMaker().equals(maker)){
        count++;
      }
    }
    return count;
  }



  /** @return true if any pair of adjacent purchased Gizmo
  * objects are equivalent, and
  * false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair() {
    for(int i = 1; i < purchases.size(); i++){
      if(purchases.get(i).equals(purchases.get(i-1))){
        return true;
      }
    }
    return false;
  }
// There may be instance variables, constructors, and methods not shown.
}

//part c:
public Gizmo getCheapestGizmoByMaker(String maker){}

/**
* I'd need to make a private double price inside Gizmo to keep track of the price of a Gizmo
*/

/**
* I'd need to make an accessor method (getter) to return the price inside gizmo. This would be * public, and return a double
*
* I would need to set the starting value fro price in a constructor, so the constructor would
* need to have an argument for price.
*/
