# static
#### 2/19/20

Difference between instance data & class data
* Instance Data - Variables and methods
  * belong to objects
  * directly modify object Data

```java
String s = "hi";
s.charAt(0);
```
  * objectName.method
  * **dependent on state (data referring to current value)**
    * state of snake in snake game = position, health, length, etc.

* Class data belongs to the class:

 ```java
 math.Pi;
 math.random()
 ```

  * className.method

  **Static** refers to anything that is class data or a class methods
<br>
  If it belongs to the **class**, it is **static**
  If it belongs to an **instance**, it is **not static**

  STATIC = DOESN'T BELONG TO THE CLASS
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
