After proving yourself with relatively menial programming tasks related to automation, we at M-S Interplanetary Ventures have decided to offer you a probationary position on our traffic control unit. Your goal is to complete the following two projects related to existing tasks for
our fleet; you will report your progress to your supervisor, Mr. Boolean, who will make a determination about the value of your contributions. Credits will be deducted from your salary if you needlessly recreate prewritten code.

## Task 1
Below is a rudimentary basis for a tracking system representing a point in 2-D space. For now, we are satisfied with mapping all ships in our system using a type of two-dimensional projection.


Below is the Point class that you are required to make use of; it will also be helpful to refer back to it for task 2:

```java
public class Point {
 /** Constructs a new Point object. */
 public Point(double x, double y) {
   /* implementation not shown */
 }

 /** @return the x coordinate of the point */
 public double getX() {
   /* implementation not shown */
 }

 /** @return the y coordinate of the point */
 public double getY() {
   /* implementation not shown */
 }

 /**
 * Changes the value of this point by a given
amount.
 * @param x a change in the x coordinate
 * @param y a change in the y coordinate
 */
 public void move(double x, double y) {
   /* implementation not shown */
 }

 //There may be instance variables, constructors, and methods that are not shown.
}
```


Your job is to develop a Ship class to help further develop our ability to keep tabs on our assets, as well as to avoid unplanned craft interactions and improve logistical efficiency. A ship must have a unique name, a fuel level, a crew capacity, and must also use a Point as a basis for its coordinate in space. You are to develop a constructor, accessors for each variable, and a calculateDistance method that takes as input another ship and returns the distance between the coordinates of each ship. See the examples below for guidance on the methods to include.

For reference, distance formula is:
\[\sqrt{(x_{2} - x_{1})^{2} + (y_{2} - y_{1})^{2}}\]

```java
Ship serenity = new Ship("Serenity", 4000.0, 12, 0.0, 0.0);
Ship enterprise = new Ship("Enterprise", 80000.0, 89, 8.0, 6.0);
double d = enterprise.calculateDistance(serenity); //Holds 10.0
String n = serenity.getName(); //holds "Serenity"
double f = serenity.getFuelRemaining(); //holds 4000.0
int c = enterprise.getCrewCapacity(); //holds 89
Point pos = serenity.getCoordinates(); //holds a Point object with coordinates (0.0, 0.0)
```

***

For the task below, assume Ship has been constructed properly regardless of your answer above. This means that Ship has available the following methods:
```java
getName();
getFuelRemaining();
getCrewCapacity();
getCoordinates();
calculateDistance(Ship o);
```

## Task 2
Below is a class representing a fleet. You are to implement methods to determine net crew capacity in the case of an emergency. You must also write a method to move a ship specified by name in order to give a command to rearrange the fleet. Finally, you must complete part C (implementation of a method to calculate the maximum distance between ships in the fleet).

Below is an outline of the fleet class:

```java
public class Fleet {
 private Ship[] armada;

 /** Constructor for the Fleet class */
 public Fleet(int size){
   armada = new Ship[size];
   /* Assume the array is somehow initialized */
 }

 /**
 * @return the total fuel reserves across all ships in the armada. You
 * must use the getFuelRemaining() method to receive full credit.
 * Postcondition: armada must not be changed.
 */
 public double calculateFuelReserves(){
   /* To be implemented in Part A */
 }

 /**
 * Precondition: ship names are unique.
 * @param name The name of the ship
 * @param deltaX the change in X
 * @param deltaY the change in Y
 */
 public void moveShip(String name, double deltaX, double deltaY) {
   /* To be implemented in Part C */
 }

 /**
 * @return the maximum spacing between Ship objects in the * armada array
 */
 public double maxSpacing() {
   /* To be implemented in Part B*/
 }
}
```

###A) Write the calculateFuelReserves() method below.

```java
 /**
 * @return the total fuel reserves across all ships in the armada
 * Postcondition: armada must not be changed.
 */
 public double calculateFuelReserves(){

 }
```

LOOP THROUGH, ADD ALL VALUES TO NEW SUM VAR


###B) Write the maxSpacing() method.
```java
/** @return the maximum spacing between Ship objects in the armada array.
* This is the maximum distance between any two Ships in the armada.
*/
 public double maxSpacing() {

 }
```

COMPARE TO ALL, FIND DISTANCE
ADD NEW VARIABLE TO STORE CURRENT MAX
WOULD NEED A DOUBLE LOOP

### C) BONUS:
Write the moveShip() method below.
```java
/**
 * Precondition: ship names are unique.
 * Moves the ship in the armada specified by name by the given amounts
 * @param name The name of the ship
 * @param deltaX the change in X
 * @param deltaY the change in Y
 */
 public void moveShip(String name, double deltaX, double deltaY) {

 }
```
Loop through list, find ship with particular name, update coordinates

```
loop through armada
  if(name = ship.getName)
  ship.getCoordinates().move(xCoord, yCoord)
```

or
for(ship ship: armada)
