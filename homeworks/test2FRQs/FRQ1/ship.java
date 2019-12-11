/**
 * ship
 */

public class ship {
  private String name;
  private int crew;
  private double fuel;
  private double x;
  private double y;

  public ship(String n, double f, int c, double x1, double y1) {
    name = n;
    fuel = f;
    crew = c;
    x = x1;
    y = y1;
  }

  public String getName() {
    return name;
  }

  public int getFuelRemaining() {
    return fuel;
  }

  public int getCrewCapacity() {
    return crew;
  }

  // hard ones:
  public Point getCoordinates() {
    return new Point(x, y);
  }

public double calculateDistance(Ship s) {
  double xDiffSquared = (x - s.getCoordinates().getX())*(x-s.getCoordinatets().getX());

  double yDiffSquared = (y - s.getCoordinates().getY())*(y-s.getCoordinatets().getY());
  }
}
