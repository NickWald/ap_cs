After	proving	yourself	with	relatively	menial	programming	tasks	related	to	automation,	we	at M-S	Interplanetary	Ventures	have	decided	to	offer	you	a probationary	position	on	our	traffic control unit.	 Your	goal	is	to	complete	the	following	two projects	related	to	existing	tasks	for our	fleet; you	will	report	your	progress	to	your	supervisor,	Mr.	Boolean,	who	will	make	a determination	about	the	value	of	your	contributions. Credits will	be	deducted	from	your	salary
if	you	needlessly	recreate	prewritten	code.

### Task	#1
Below	is	a	rudimentary	basis	for	a	tracking	system	representing	a	point	in	2-D	space. For	now, we	are	satisfied	with	mapping	all	ships	in	our	system	using	a	type	of	two-dimensional	projection.

Below	is	the	Point	class	that	you	are	required	to	make	use	of;	it	will also be	helpful	to	refer
back	to	it	for	task 2:



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
}
```

Your	job	is	to	develop	a	Ship	class	to	help	further	develop	our	ability	to	keep	tabs	on	our	assets,	as	well	as	to	avoid	unplanned	craft	interactions	and	improve	logistical	efficiency.	A	ship	must	have	a	unique	name,	a	fuel	level,	a	crew	capacity,	and	must	also	use	a	Point	as	a	basis	for	its	coordinate	in	space.		You	are	to	develop	a	constructor,	accessors	for	each	variable,	and	a	calculateDistance	method	that	takes	as	input	another	ship	and	returns	the	distance	between	the	coordinates	of	each	ship.		See	the	examples	below	for	guidance	on	the	methods	to	include


#### Usage Examples:
```java
Ship serenity = new Ship("Serenity", 4000.0, 12, 0.0, 0.0);
Ship enterprise = new Ship("Enterprise", 80000.0, 89, 8.0, 6.0);
double d = enterprise.calculateDistance(serenity); //Holds 10.0
String n = serenity.getName(); //holds "Serenity"
double f = serenity.getFuelRemaining(); //holds 4000.0
int c = enterprise.getCrewCapacity(); //holds 89
Point pos = serenity.getCoordinates(); //holds a Point object
with coordinates (0.0, 0.0)
```

ship is general idea of ship, so using ship.getCoordinates(othership) will get othership's x and y and the calculate the distance from the one used


## Point:
- getX() : double
- getY() : double
- move()

## Ship:
- getCoordinates() : point
