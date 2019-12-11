For	the	task below,	assume	Ship	has	been	constructed	properly	regardless	of	your	answer
above. This	means	that	Ship	has	available	the	following	methods:

```java
getName();
getFuelRemaining();
getCrewCapacity();
getCoordinates();
calculateDistance(Ship o);
```

## Task	2
Below	is	a	class	representing	a	fleet.
+ You	are	to	implement	methods	to	determine	net	crew	capacity	in	the case	of	an	emergency.
+ You	must	also	write	a	method	to	move	a	ship	specified	by	name in	order	to	give	a	command	to	rearrange	the	fleet.
+ Finally,	you must	complete	part	C	(implementation	of	a	method	to	calculate	the	maximum distance	between	ships	in	the	fleet).

Below is an outline of the fleet class:

```java
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
  public double calculateFuelReserves() { /* To be implemented in Part A */
  }

  /**
   * Precondition: ship names are unique. * @param name The name of the ship
   *
   * @param deltaX the change in X
   * @param deltaY the change in Y
   */
  public void moveShip(String name, double deltaX, double deltaY) { /* To be implemented in Part C */
  }

  /** @return the maximum spacing between Ship objects in the armada array */
  public double maxSpacing() {
    /* To be implemented in Part B */
  }
}

```

#### Write the calculateFuelReserves() method.

#### Write the maxSpacing() method.
+ Find max distance between **any** two ships
+ check every ship vs every ship
+ need 2 loops.
  + one to move through array, one to check each ship in array;

0. if (less than 2 ships) return 0
1. set starting maximum
2. compare all distances to that max, change if greater
  + this part requires a double loop
3. return max

What if I have one ship? Max distance is 0

#### (BONUS) Write the moveShip() method below.
