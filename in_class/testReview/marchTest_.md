#  APCS TEST REVIEW - 3/3/20<br>
  
  
<div style="color: gray; font-size:20px;">Nick Wald</div>
  
##  CLASS STRUCTURE
  
  
###  CLASS EXTENSION
  
  
##  2D ARRAYS
  
  
--------------------------------------------------------------------------------
  
##  <span style="color: #ff257f;">ARRAYLIST</span>
  
  
<br>
  
<sup>
  <span style="font-size: 15px; color: ">A dynamically sized array which has methods attached to it by default</span>
</sup>
  
**To Create A New arrayList:**
  
```java
ArrayList <String> arrList = new ArrayList <String>(100);
//parentheses can often be ignored, default size is 10
```
  
<div style="color: #f5c71a; font-weight: bold;">Key Methods:</div>
  
<br>
  
  
  
<div style="color: #005ae9; font-weight: bold;">ADD</div>
  
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
  
  
  
<div style="color: #005ae9; font-weight: bold;">SET</div>
  
<sup style="font-weight: bold;">Replaces value at specified position with new specified value</sup>
  
  
  
```java
listName.set(index, value)
//whatever is in position index has now been changed to the new value
```
  
```java
arrList.set(0, "owen")
//the value at position 0 becomes owen
```
  
  
  
<div style="color: #005ae9; font-weight: bold;">GET</div>
  
<sup style="font-weight: bold;">Return value at specified position</sup>
  
  
  
```java
arrList.get(0);
//returns value at position 0
```
  
  
  
<div style="color: #005ae9; font-weight: bold;">REMOVE</div>
  
<sup style="font-weight: bold;">Removes value at specified index, shifts all subsequent indexes down by 1</sup>
  
  
  
```java
arrList.remove(1);
```
  
--------------------------------------------------------------------------------
  
##  SORTING + SEARCHING
  
  
##  STATIC
  
  
##  RECURSION
  
  
###  INHERITENCE + POLYMORPHISM
  
  