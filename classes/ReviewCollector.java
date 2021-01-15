public class ReviewCollector{
  private ArrayList<ProductReview> reviewList;
  private ArrayList<String> productList;

  /** Constructs a ReviewCollector object and initializes the instance variables. */
  public ReviewCollector(){
    reviewList = new ArrayList<ProductReview>();
    productList = new ArrayList<String>();
  }

  /** Adds a new review to the collection of reviews, as described in part (a). */

  public void addReview(ProductReview prodReview){
    /* to be implemented in part (a) */
    reviewList.add(prodReview);
    productList.add(prodReview.getName);
  }

  /** Returns the number of good reviews for a given product name, as described in part (b). */

  public int getNumGoodReviews(String prodName){
    /* to be implemented in part (b) */
    int numGood, numNotGood = 0;
    for(int i = 0; i < reviewList.size(); i++){
      if(reviewList.get(i).getReview.contains("best") == true && reviewList.get(i).getName.equals(prodName)){
        numGood++;
      }
      else numNotGood++;
    }
    return numGood;
  }

  // There may be instance variables, constructors, and methods not shown.

}
