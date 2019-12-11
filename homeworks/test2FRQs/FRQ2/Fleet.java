public class Fleet {
  private Ship[] armada;

  /** Constructor for the Fleet class */
  public Fleet(int size) {
    armada = new Ship[size];
    /* Assume the array is somehow initialized */
  }

  /**
   * @return the total fuel reserves across all ships in the armada. You must use
   *         the getFuelRemaining() method to receive full credit. Postcondition:
   *         armada must not be changed.
   */
  public double calculateFuelReserves() {
    double tF = 0;
    for (int i = 0; i < armada.length; i++) {
      tF += armada[i].length.getFuelRemaining();
    }
    return tF;
  }

  /**
   * Precondition: ship names are unique. * @param name The name of the ship
   *
   * @param deltaX the change in X
   * @param deltaY the change in Y
   */
  public void moveShip(String name, double deltaX, double deltaY) {

  }

  /** @return the maximum spacing between Ship objects in the armada array */
  public double maxSpacing() {
    double max = armada[0].calculateDistance(armada[i]); // starting point
    if (armada.length < 2) {
      return 0;
    }
    // hard part (double loop):
    for (int i = 0; i < armada.length; i++) {
      for (int j = i + 1; j < armada.length - 1; j++) {

        double currDist = armada[i].calculateDistance(armada[j]);
        if (currDist > max) {
          max = currDist;
        }
      }
    }
    return max;
  }
}
