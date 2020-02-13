
# ArrayList (1/21/20) </center>

+ Like an array that is dynamically sized, which has methods with it
+ A list in array form
  + Basically a list that is stored in an array, can add to end easily
  + ArrayList is more malleable than a tradition array


```java
ArrayList <String> list1 = new ArrayList <String>(100);
vs.
String[] list2 = new String[100];
```

DEFAULT SIZE IS 10

HOW TO USE:

#### Add
```java
list1.add("hi");
```
add on to back of list using add command

```java
list1.add(0, "Alexa");
```
replaces value at 0 with whats in quotes, shifts everything over by 1

#### Set
```java
lis1.set(0, "Lucie")
```
whatever is in position 0 has now been changed to the new string

#### Get
```java
list1.get(0);
```
return value at specified position

#### Remove
```java
list1.remove(1);
```
removes slot 1, slot in front decreases by 1, as does one after

---
# 1/27/20
