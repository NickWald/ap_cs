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
	- [<span style="color: #00308f; font-weight: bold;">STATIC](#span-stylecolor-00308f-font-weight-boldstatic)
	- [<span style="color: #cc0600; font-weight: bold;">RECURSION](#span-stylecolor-cc0600-font-weight-boldrecursion)
		- [<span style="color: #a30500; font-weight: bold;">INHERITENCE + POLYMORPHISM](#span-stylecolor-a30500-font-weight-boldinheritence-polymorphism)

<!-- /TOC -->

---

## <span style="color: #34b334; font-weight: bold;">CLASS STRUCTURE</span>
dsf

---

### <span style="color: #2a8f2a; font-weight: bold;">CLASS EXTENSION</span>
df

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

---

## <span style="color: #00308f; font-weight: bold;">STATIC

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

<script src="https://cdnjs.cloudflare.com/ajax/libs/tocbot/4.4.2/tocbot.min.js">tocbot.init({
  // Where to render the table of contents.
  tocSelector: '.js-toc',
  // Where to grab the headings to build the table of contents.
  contentSelector: '.js-toc-content',
  // Which headings to grab inside of the contentSelector element.
  headingSelector: 'h1, h2, h3',
  // For headings inside relative or absolute positioned containers within content.
  hasInnerContainers: true,
});</script>
