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

--------------------------------------------------------------------------------

**Fibonacci Sequence: _0, 1, 1, 2, 3, 5, 8, 13, 21_**

Write this with a loop or write it self refferentially (recursively)

to get the next Fibonacci number:

$$
f_n = \displaystyle{{f}_{{{n}-{1}}}} = \displaystyle{{f}_{{{n}-{2}}}}
$$


$$
\displaystyle{{f}_{{2}}=}{{f}_{{{\left({1}\right)}}}+}{{f}_{{{\left({0}\right)}}}}
$$


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
