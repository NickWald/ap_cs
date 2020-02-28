# **3/3 TEST TOPIC SHEET**

<div style="color: gray; font-size:20px;">Nick Wald</div>
<br>
<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [**3/3 TEST TOPIC SHEET**](#33-test-topic-sheet)
	- [<span style="color: #34b334; font-weight: bold;">CLASS STRUCTURE</span>](#span-stylecolor-34b334-font-weight-boldclass-structurespan)
		- [<span style="color: #2a8f2a; font-weight: bold;">CLASS EXTENSION</span>](#span-stylecolor-2a8f2a-font-weight-boldclass-extensionspan)
	- [<span style="color: #8400ff; font-weight: bold;">2D ARRAYS</span>](#span-stylecolor-8400ff-font-weight-bold2d-arraysspan)
	- [<span style="color: #ff257f; font-weight: bold;">ARRAYLIST</span>](#span-stylecolor-ff257f-font-weight-boldarraylistspan)
		- [<div style="color: #f5c71a; font-weight: bold;">Key Methods:</div>](#div-stylecolor-f5c71a-font-weight-boldkey-methodsdiv)
			- [<div style="color: #005ae9; font-weight: bold;">ADD</div>](#div-stylecolor-005ae9-font-weight-boldadddiv)
			- [<div style="color: #005ae9; font-weight: bold;">SET</div>](#div-stylecolor-005ae9-font-weight-boldsetdiv)
			- [<div style="color: #005ae9; font-weight: bold;">GET</div>](#div-stylecolor-005ae9-font-weight-boldgetdiv)
			- [<div style="color: #005ae9; font-weight: bold;">REMOVE</div>](#div-stylecolor-005ae9-font-weight-boldremovediv)
	- [<span style="color: #ff5800; font-weight: bold;">SORTING + SEARCHING](#span-stylecolor-ff5800-font-weight-boldsorting-searching)
	- [<span style="color: #00308f; font-weight: bold;">STATIC](#span-stylecolor-00308f-font-weight-boldstatic)
	- [<span style="color: #cc0600; font-weight: bold;">RECURSION](#span-stylecolor-cc0600-font-weight-boldrecursion)
		- [<span style="color: #8400ff; font-weight: bold;">INHERITENCE + POLYMORPHISM](#span-stylecolor-8400ff-font-weight-boldinheritence-polymorphism)

<!-- /TOC -->

---

## <span style="color: #34b334; font-weight: bold;">CLASS STRUCTURE</span>

---

### <span style="color: #2a8f2a; font-weight: bold;">CLASS EXTENSION</span>

---

## <span style="color: #8400ff; font-weight: bold;">2D ARRAYS</span>

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

**Example 2:**
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

### <span style="color: #8400ff; font-weight: bold;">INHERITENCE + POLYMORPHISM

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tocbot/4.4.2/tocbot.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/tocbot/4.4.2/tocbot.min.js"></script>

<script>
tocbot.init({
  // Where to render the table of contents.
  tocSelector: '.js-toc',
  // Where to grab the headings to build the table of contents.
  contentSelector: '.js-toc-content',
  // Which headings to grab inside of the contentSelector element.
  headingSelector: 'h1, h2, h3',
  // For headings inside relative or absolute positioned containers within content.
  hasInnerContainers: true,
});
</script>
