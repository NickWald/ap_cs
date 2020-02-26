---
|-
  5! = 5 * 4 * 3 * 2 * 1
  ![equation](http://www.sciweavers.org/upload/Tex2Img_1581520600/render.png)

  <br>
---

<link href="http://github.com/yrgoldteeth/darkdowncss/raw/master/darkdown.css" rel="stylesheet">

# <div style="color: #3CB371;  margin: 0;">RECURSION </div> <div style="font-size: 15px; color: gray;"> <strong> <sup>2/11/19</sup> <br> <sup>Need to be able to read, not write recursion<sup>
</strong>
</div>

##<div style="font-size: 20px; color: white;"> THE SAME FUNCTION, BUT SMALLER</div>
</div>

--------------------------------------------------------------------------------



## <div style="color: #3CB371">USING A FUNCTION INSIDE ITSELF</div>

- RIGHT SIDE OF MATRIX IS BASE CASE, SAYS WHAT TO DO AT BOTTOM/BASE OF CONDITION

  - DEFINES THE STARTING CASE

- LEFT SIDE IS RECURSIVE CASE,

  - USES FUNCTION INSIDE ITSELF
  - LOOKING AT SELF-SIMILARITY / BREAKING DOWN A PROBLEM

### REDUCING SIZE OF PROBLEM UNTIL WE REACH BASE CASE

WORKS WITH METHODS ONLY

PRIME EXAMPLE: [TO ADD DIGITS](/in_class/2020/recursion/addDigits.md)<br>

--------------------------------------------------------------------------------

```
f(16) = f(8) + 1
f
```
**REVERSING A STRING**
![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cbg_white%20%5Ctextbf%7BREVERSE%20A%20STRING%7D%20%5Clinebreak%20%5Clinebreak%20f_%28%20_%5Ctextrm%7BString%20s%7D_%29%20%3D%20%5Cbegin%7BBmatrix%7D%20s%26%20%5Ctextrm%7Bif%20s.length%28%29%7D%20%3C%3D%201%20%5Ctextrm%7B%20%28base%20case%29%7D%5C%5C%20f_%28%20_%5Ctextrm%7Bs.substring%281%29%7D%20_%29&plus;%20%5Ctextrm%7B%5Ctextit%7Bs.charAt%7D%7D%280%29%20%26%20otherwise%20%5Ctextrm%7B%20%28recursive%20case%29%7D%5C%5C%5C%20%5Cend%7BBmatrix%7D)

```java
public String f(String s){
  if(s.length()<= 1) return s;
  return f(s.substring(1)) + s.charAt(0);
}
```

--------------------------------------------------------------------------------

**Fibonacci Sequence: _0, 1, 1, 2, 3, 5, 8, 13, 21_**

Write this with a loop or write it self refferentially (recursively)

to get the next Fibonacci number:

![equation](https://latex.codecogs.com/png.latex?%5Cbg_white%20%5CLARGE%20f_n%20%3D%20f_n_-_1%20+%20f_n_-_2)

![equation](https://latex.codecogs.com/png.latex?%5Cbg_white%20%5CLARGE%20f_2%20%3D%20f_%28_1_%29%20+%20f_%28_0_%29)

Here is the loop for this:

```java
public int func(int x){
  if(x > 0) return func(x-1)+1;
  else return 1;
}
```

```java

/*
 * @param n >= 0
 */
public int fib(int n){
  if(n == 0) return 0;
  else if(n == 1) return 1;
  else{
    return fib(n-1)+fib(n-2);
  }
}
```

**FULL CLASS:**

```java
public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
            StdOut.println(i + ": " + fibonacci(i));
    }

}
```

## ZERO-ONE KNAPSACK PROBLEM

- BACKPACK OF SIZE S, S = 9
- There is a list of items of various sizes {3, 7 ,8 , 15}
- **is it possible to take any random combination of these numbers to add to S?**

- Solution is a recursive relation/function

  - Trying to brute force this is a bad choice because of runtime

    ```java
    knapsack(x, 1) //first number is size of backpack, second number is item in list*
    if(x == s1) return true;
    ```
