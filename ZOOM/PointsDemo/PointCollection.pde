public class PointCollection {
  private ArrayList<Point> collection;

  public PointCollection(int numPoints) {
    collection = new ArrayList<Point>();
    for (int i = 0; i < numPoints; i++) {
      int randX = (int) random(0, width);
      int randY = (int) random(0, height);
      collection.add(new Point(randX, randY));
    }
  }
  public void show() {
    for (int i = 0; i < collection.size(); i++) {
      collection.get(i).show();
    }
  }
  public void addPoint(Point p) {
    collection.add(p);
  }
  // removes the closest pair of Points in the list, 
  // returns a String with their coordinates in the format:
  // "Removed {(x1, y1), (x2, y2)}."
  // where x1, y1, x2, and y2 are the coordinates of the removed points.
  // Precondition: there are at least two points in collection
  public Line removeClosestPair() {
    //to be implemented.
    //set an index for the two elements that are currently closest
    if (collection.size()>=2) {
      int i1 = 0;
      int i2 = 1;
      double minDistance = collection.get(i1).calculateDistance(collection.get(i2));

      //loop through and compare each point to each other point
      //requires a double loop
      for (int i = 0; i < collection.size() - 1; i++) {
        for (int j = 0; j < collection.size(); j++) {
          if (j != i) {
            double currDist = collection.get(i).calculateDistance(collection.get(j));
            if (currDist < minDistance) {
              minDistance = currDist;
              i1 = i;
              i2 = j;
              //sets the points I want to remove, and sets the metric of comparison
            }
          }
        }
      }
      //do the removal and returning.
      //make sure that i1 and i2 are removed in descending order
      if (i2 < i1) {
        return new Line(collection.remove(i1), collection.remove(i2));
      } else {
        return new Line(collection.remove(i2), collection.remove(i1));
      }
    } else return null;
  }
}
