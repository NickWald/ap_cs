#AP CS A EXAM REVIEW SHEET (NICK WALD)


```viz
digraph G {
  fontname = "SF Mono"
  fontsize = 10

  node [
          fontname = "SF Mono"
          fontsize = 11
          shape = "record"
          width = 1
  ]

  edge [
          fontname = "SF Mono"
          fontsize = 5
  ]

  Monster [
          label = "{ Read question \l}"
  ]
  Vampire [
          label = "{Vampire \l}"
  ]
  Zombie [
          label = "{Zombie \l}"
  ]
  MonsterSub [
          label = "{Monster\l}"
  ]

  Monster -> Zombie
  Monster -> MonsterSub
  Monster -> Vampire

}
```

##Basics:


###instantiation
###booleans
###forEach loop / enhanced for loop

###Operator Precedence

##Arrays
use .length
**Declaration:**
```java
//dataType[] name;
double[] apList;
```
**Instantiation:**
```java
//dataType[] listName = new dataType[arraySize]
double[] apList = new double[10];
```
####Common methods:
```java
//loop thru array and print each item
public static void printArray(int[] array) {
   for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
   }
}
```

###ArrayList
####Methods:
#####ADD
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
#####SET
```java
listName.set(index, value)
//whatever is in position index has now been changed to the new value
```

```java
arrList.set(0, "owen")
//the value at position 0 becomes owen
```
<sup style="font-weight: bold;">Replaces value at specified position with new specified value</sup>

#####GET
```java
arrList.get(0);
//returns value at position 0
```
<sup style="font-weight: bold;">Return value at specified position</sup>

#####REMOVE
```java
arrList.remove(1);
```
<sup style="font-weight: bold;">Removes value at specified index, shifts all subsequent indexes down by 1</sup>


####FRQ 1 - Arrays / ArrayLists

####FRQ 2 - Methods and Control Structures

##QUICK REFERENCE
**class java.lang.Object**
- boolean equals(Object other)
- String toString()

**class java.lang.Integer**
- Integer(int value)
- int intValue()
- Integer.MIN_VALUE `minimum value represented by an int or Integer`
- Integer.MAX_VALUE `maximum value represented by an int or Integer`

**class java.lang.String**
- int length()
- String substring(int from, int to)
`returns the substring beginning at from and ending at to-1`
- String substring(int from)
`returns substring(from, length())`
- int indexOf(String str)
`returns the index of the first occurrence of str;`
`returns -1 if not found`
- int compareTo(String other)
`returns a value < 0 if this is less than other`
`returns a value = 0 if this is equal to other`
`returns a value > 0 if this is greater than other`

**class java.lang.String**
- int length()
- String substring(int from, int to)
`returns the substring beginning at from and ending at to-1`
- String substring(int from)
`returns substring(from, length())`
- int indexOf(String str)
`returns the index of the first occurrence of str;`
 `returns -1 if not found`
- int compareTo(String other)
`returns a value < 0 if this is less than other`
`returns a value = 0 if this is equal to other`
`returns a value > 0 if this is greater than other `

**interface java.util.List<E>**
- int size()
- boolean add(E obj)
appends obj to end of list; returns true
- void add(int index, E obj)
`inserts obj at position index <= 0 <= size; moving elements at position index and higher to the right (adds 1 to their indices) and adjusts size`
- E get(int index)
- E set(int index, E obj)
`replaces the element at position index with obj`
`returns the element formerly at the specified position`
- E remove(int index)
`removes element from position index, moving elements at position index + 1 and higher to the left (subtracts 1 from their indices) and adjusts size`
`returns the element formerly at the specified position`
