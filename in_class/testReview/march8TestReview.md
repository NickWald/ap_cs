# **3/3 TEST TOPIC SHEET**
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tocbot/4.4.2/tocbot.css">


<div style="color: gray; font-size:20px;">Nick Wald</div>

<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [**3/3 TEST TOPIC SHEET**](#33-test-topic-sheet)
	- [<span style="color: #34b334; font-weight: bold;">CLASS STRUCTURE</span>](#span-stylecolor-34b334-font-weight-boldclass-structurespan)
		- [<span style="color: #2a8f2a; font-weight: bold;">CLASS EXTENSION</span>](#span-stylecolor-2a8f2a-font-weight-boldclass-extensionspan)
	- [<span style="color: #8400ff; font-weight: bold;">2D ARRAYS</span>](#span-stylecolor-8400ff-font-weight-bold2d-arraysspan)
		- [<span style="color: #2F4F4F; font-weight: bold;"> Useful loops for checking 2D Arrays:](#span-stylecolor-2f4f4f-font-weight-bold-useful-loops-for-checking-2d-arrays)
			- [<span style="color: #6A5ACD; font-weight: bold;"> Return sum of all int values in a 2D Array </span>](#span-stylecolor-6a5acd-font-weight-bold-return-sum-of-all-int-values-in-a-2d-array-span)
			- [<span style="color: #6A5ACD; font-weight: bold;"> Return sum of all even int values in a 2D Array </span>](#span-stylecolor-6a5acd-font-weight-bold-return-sum-of-all-even-int-values-in-a-2d-array-span)
			- [<span style="color: #6A5ACD; font-weight: bold;"> Printing a 2D Array </span>](#span-stylecolor-6a5acd-font-weight-bold-printing-a-2d-array-span)
	- [<span style="color: #ff257f; font-weight: bold;">ARRAYLIST</span>](#span-stylecolor-ff257f-font-weight-boldarraylistspan)
		- [<div style="color: #f5c71a; font-weight: bold;">Key Methods:</div>](#div-stylecolor-f5c71a-font-weight-boldkey-methodsdiv)
			- [<div style="color: #005ae9; font-weight: bold;">ADD</div>](#div-stylecolor-005ae9-font-weight-boldadddiv)
			- [<div style="color: #005ae9; font-weight: bold;">SET</div>](#div-stylecolor-005ae9-font-weight-boldsetdiv)
			- [<div style="color: #005ae9; font-weight: bold;">GET</div>](#div-stylecolor-005ae9-font-weight-boldgetdiv)
			- [<div style="color: #005ae9; font-weight: bold;">REMOVE</div>](#div-stylecolor-005ae9-font-weight-boldremovediv)
	- [<span style="color: #ff5800; font-weight: bold;">SORTING + SEARCHING](#span-stylecolor-ff5800-font-weight-boldsorting-searching)
		- [**<span style="color: gold;">SORTING</span>**](#span-stylecolor-goldsortingspan)
			- [**<span style="color: yellow;">BUBBLE SORT</span>**](#span-stylecolor-yellowbubble-sortspan)
			- [**<span style="color: yellow;">Standard Swap:</span>**](#span-stylecolor-yellowstandard-swapspan)
		- [**<span style="color: CORNFLOWERBLUE;">SEARCHING</span>**](#span-stylecolor-cornflowerbluesearchingspan)
			- [**<span style="color: PINK;">STANDARD SEQUENTIAL SEARCH:</span>**](#span-stylecolor-pinkstandard-sequential-searchspan)
			- [**<span style="color: PINK;">SPACE EFFICIENCY</span>**](#span-stylecolor-pinkspace-efficiencyspan)
			- [**<span style="color: PINK;">SEQUENTIAL SEARCH</span>**](#span-stylecolor-pinksequential-searchspan)
	- [<span style="color: #00308f; font-weight: bold;">STATIC](#span-stylecolor-00308f-font-weight-boldstatic)
	- [<span style="color: #cc0600; font-weight: bold;">RECURSION](#span-stylecolor-cc0600-font-weight-boldrecursion)
		- [<span style="color: #a30500; font-weight: bold;">INHERITENCE + POLYMORPHISM](#span-stylecolor-a30500-font-weight-boldinheritence-polymorphism)

<!-- /TOC -->

---

## <span style="color: #8400ff; font-weight: bold;">2D ARRAYS</span>
Array with arrays inside, written as ```[][]```

```java
[rows][columns]
[4][6] = 4 rows, 6 columns

//standard format:
dataType [][] name = new dataType[r][c]

//printing an 8x5 grid:
int [][] grid = new int[8][5];
//array of size 8 with each slot containing an array of size 5
```

### <span style="color: #2F4F4F; font-weight: bold;"> Useful loops for checking 2D Arrays:

#### <span style="color: #6A5ACD; font-weight: bold;"> Return sum of all int values in a 2D Array </span>
```java
public int sumArr(int[][] nums){
	int total = 0;
	for (int r = 0; r < nums.length; r++) {
  		for (int c = 0; c < nums[r].length; c++) {
    		total += nums[r][c];
  		}
	}
	return total;
}
```

#### <span style="color: #6A5ACD; font-weight: bold;"> Return sum of all even int values in a 2D Array </span>
```java
public int sumEvens(int[][] nums){
  int sum = 0;
  for (int r = 0; r < nums.length; r++) {
    for (int c = 0; c < nums[r].length; c++) {
      if(nums[r][c] % 2 == 0){
        sum += nums[r][c];
      }
    }
  }
  return sum;
}
```

#### <span style="color: #6A5ACD; font-weight: bold;"> Printing a 2D Array </span>

```java
int[][] arr = new int[4][3];

for (int r = 0; r < arr.length; r++) { //rows
  for (int c = 0; c < arr[r].length; c++) { //columns
    System.out.print(arr[r][c] + "");
  }
  system.out.println();
}
```

---

## <span style="color: #ff257f; font-weight: bold;">ARRAYLIST</span>
<span style="font-size: 15px; color: ">A dynamically sized array which has methods attached to it by default</span>

<br>

**To Create A New arrayList:**

```java
ArrayList <String> arrList = new ArrayList <String>(100);
//parentheses can often be ignored, default size is 10
```

<br>

### <div style="color: #f5c71a; font-weight: bold;">Key Methods:</div>


#### <div style="color: #005ae9; font-weight: bold;">ADD</div>

<sup style="font-weight: bold;">Adds value to end of arrayList, or at specified position which shifts all subsequent indices up by 1</sup>

```java
listName.add(value);
//adds parameter to end of arrayList
listName.add(index, value);
//adds value at specified index, shifts all other indexes up by 1
```

```java
arrList.add("hi");
//final value in arrList is now hi
```

```java
arrList.add(0, "nick");
//value at position 0 becomes nick
//value @ pos 0 shifts to pos 1
//value @ pos 1 shifts to pos 2, etc...
```

#### <div style="color: #005ae9; font-weight: bold;">SET</div>

<sup style="font-weight: bold;">Replaces value at specified position with new specified value</sup>

```java
listName.set(index, value)
//whatever is in position index has now been changed to the new value
```

```java
arrList.set(0, "owen")
//the value at position 0 becomes owen
```

#### <div style="color: #005ae9; font-weight: bold;">GET</div>

<sup style="font-weight: bold;">Return value at specified position</sup>

```java
arrList.get(0);
//returns value at position 0
```

#### <div style="color: #005ae9; font-weight: bold;">REMOVE</div>

<sup style="font-weight: bold;">Removes value at specified index, shifts all subsequent indexes down by 1</sup>

```java
arrList.remove(1);
```

---

## <span style="color: #ff5800; font-weight: bold;">SORTING + SEARCHING
### **<span style="color: gold;">SORTING</span>**

#### **<span style="color: yellow;">BUBBLE SORT</span>**
*(kind of inefficient)* /
(ONLY LOOKING AT TWO LOOPS)

Basically does this:
+ POS 0 > ALL?
+ POS 1 > ALL?
+ POS 2 > ALL?

To do this, we need to know how to swap 2 elements. How?

| 3 | 4 | -1 | 7 |
|---|---|----|---|

How do I move 7 in slot 3 to where 3 is in slot 0?
```java
int s = arr[0];
arr[0] = arr[3];
arr[3] = s;
```

Why cant you just do this?:
```java
arr[0] = arr[3];
arr[3] = arr[0]
```
*because you need to keep track of what you are replacing*

A swap has 3 integral parts:

1. store the first thing
2. overwrite the first thing
3. hold that first thing in a variable

#### **<span style="color: yellow;">Standard Swap:</span>**

```java
int temp = arr[0];
arr[0] = arr[3];
arr[3] = temp;
```


### **<span style="color: CORNFLOWERBLUE;">SEARCHING</span>**

#### **<span style="color: PINK;">STANDARD SEQUENTIAL SEARCH:</span>**
```java
/**
** Sequential Search
** @return loc, -1 if not found
**/
public int findElement(int[] arr, int target){
  for(int i = 0; i < arr.length; i++){
    if(arr[i] == target){
      return i
    }
  }
  return -1;
}
```

| 0 | 1 | 2 | 3 |
|---|---|---|---|
| 1 | 3 | 5 | 2 |

Target = 5

#### **<span style="color: PINK;">SPACE EFFICIENCY</span>**
How much space is taken up, for n length how much space will it take up
**big O notation**

O <efficiencyLevel>
so, it takes O(n) steps
  (big O of N)
  Double loop = n<sup>2</sup> steps


#### **<span style="color: PINK;">SEQUENTIAL SEARCH</span>**
* Makes it easier to find something
  * Computer does not know what is in list, just whether it is in order

A system for searching through a list would look like this:
**Target = 15**

| 2 | 3 | 8 | 12 | 15 | 22 | 64 | 322 |
|---|---|---|----|----|----|----|-----|
<SUP>Start by cutting the list in half. so it becomes:</SUP>

| 2 | 3 | 8 | 12 |
|---|---|---|----|

<sup>Then, compare: is ```target > target-1 || target < target-1```? ```if(target < target-1)``` cut other half out, and sort next half
| 15 | 22 | 64 | 322 |
|----|----|----|-----|

Cut in half again, check if less than 22, if it is, it can only be 15, done.

***BINARY SEARCH*** (much more efficient, this only took 3 steps)

if we have n steps, and n = 8, the max number of half cuts is the log<sub>2</sub>(n)

***O(log<sub>2</sub>(n))***

so log<sub>2</sub>(10) = 4

log<sub>2</sub>(17) = 5

number of cuts does not scale based on actual space, but on the log, as we are cutting it in half.

This can be done with anything, objects, words, letters, etc
Only requirement of binary search is that the list is in order

---

## <span style="color: #00308f; font-weight: bold;">STATIC
A METHOD THAT APPLIES SPECIFICALLY TO A CLASS

* **INSTANCE DATA** - variables and methods
  * belong to objects ONLY
  * directly modify object Data

```java
String s = "hi";
s.charAt(0);
```
  * objectName.method
  * **dependent on state** (data referring to current value)
    * state of snake in snake game = position, health, length, etc.
		<br/>
* Class data belongs to the class:

 ```java
 math.Pi;
 math.random()
 ```
  * className.method

  **Static** refers to anything that is class data or a class method
  * If it belongs to the **class**, it is **static**
  * If it belongs to an **instance**, it is **not static**

  STATIC = **UNIVERSAL** - DOESN'T BELONG TO ONLY THE CLASS
<br>
  **Example:**
  CitiBank class, objects are branches of bank

```java
public class citiBank {

  private int location;
  private int money;
  private String branchName;
  /*bank also needs to know total money supply,
  * need a static variable to store information for
  * just the class
  */
  private static int totalAssets = 0;
  //static, belongs to class: can use citiBank.totalAssets();

  public citiBank () {
    //INSTANCE DATA (BECAUSE IT DIDN'T SAY STATIC):
    location = 0;
    money = 500;
    branchName = "here";
    totalAssets += money;
  }
}
```

IN ANOTHER FILE:

```java
citiBank big = new citiBank();
citiBank small = new citiBank();
```
---

## <span style="color: #cc0600; font-weight: bold;">RECURSION
**Using a function inside itself, repeatedly shortening and checking through input**
ESSENTIALLY REDUCING PROBLEM SIZE UNTIL BASE CASE IS REACHED

***Example 1: Reversing a string***
$$
f(\text{String s}) =
  \begin{cases}
   \ s & \text{if s.length  } \leq 1 \text{ (base case)}\\
   f(\text{s.substring(1)}) + \text{ s.charAt(0)}       & \text{otherwise (recursive case)} \\
  \end{cases}
$$
```java
public String f(String s){
  if(s.length()<= 1) return s;
  return f(s.substring(1)) + s.charAt(0);
}
```

***Example 2:***
```java
/*
* @param if i have no digits, return 0
*/
public int addDigits(int num){
  if(num==0) return 0;
  return num%10 + addDigits(num/10); //using method on a smaller scale
  //with integer division, when you divide by 10, last number is chopped off, leaving rightmost digits to check. then run again at a smaller scale w the last digit chopped off
}
```

Start by writing base case, then recursive cases
Cases in which the function is called inside itself are recursive cases

**Recursively tracing the number 7315 using addDigits function:**

```
addDigits(7315)
= 5 + addDigits(731)
= 5 + (1 + addDigits(73))
= 5 + (1 + (3 + addDigits(7)))
= 5 + (1 + (3+ (7 + addDigits(0))))
= (5 + (1 + (3 + (7 + 0))))
= 16
```
---

### <span style="color: #a30500; font-weight: bold;">INHERITENCE + POLYMORPHISM


```viz
digraph G {
  fontname = "SF Mono"
  fontsize = 11

  node [
          fontname = "SF Mono"
          fontsize = 11
          shape = "record"
          width = "2"
  ]

  edge [
          fontname = "SF Mono"
          fontsize = 11
  ]

  parent [
          label = "{Parent Class|
            DEFAULT VALUES
            |
            DEFAULT METHODS()\l}"
  ]
  child [
          label = "{Child|
            CARRIES ALL DEFAULT PARENT VALUES \l
            ALSO CARRIES SUBCLASS-UNIQUE VALUES \l
            |
            + CARRIES ALL DEFAULT PARENT METHODS \l}"
  ]

  parent -> child
}
```

Making static variables allows use of parent properties in child class along with more specific ones

EXTENDS, makes child a **subclass**, keeping animal classes while adding its own

```java
public class Snake extends Animal;
```


```viz
digraph G {
  fontname = "SF Mono"
  fontsize = 11

  node [
          fontname = "SF Mono"
          fontsize = 11
          shape = "record"
          width = 2.5
  ]

  edge [
          fontname = "SF Mono"
          fontsize = 11
  ]

  Animal [
          label = "{ Animal|
            - name : string\l
            - age : int\l
            - length : int\l
            - weight : int\l
            - eyeCount: int\l
            - hasLegs : boolean\l
            - Animal[] predators\l
            - Animal[] prey\l
            - isPredator : boolean\l
            - type : string\l
            |
            + die() : void\l
            + eat() : void\l}"
  ]
  Snake [
          label = "{Snake|
            ALL ANIMAL PROPERTIES +\l
            - hasPoison : boolean\l
            - speed : int\l
            - thickness : int\l
            - pattern\l
            |
            + die() : void\l}"
  ]

  Animal -> Snake
}
```
