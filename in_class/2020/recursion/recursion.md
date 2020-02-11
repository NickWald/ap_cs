<link href="http://github.com/yrgoldteeth/darkdowncss/raw/master/darkdown.css" rel="stylesheet"></link>
# <div style="color: yellow">RECURSION </div> <div style="font-size: 15px; color: gray">2/11/19<br>Need to be able to read, not write recursion</div>


<br>

**Fibonacci Sequence: *0, 1, 1, 2, 3, 5, 8, 13, 21***

Write this with a loop
or write it self refferentially (recursively)

to get the next Fibonacci number:

![equation](https://latex.codecogs.com/png.latex?%5Cbg_white%20%5CLARGE%20f_n%20%3D%20f_n_-_1%20&plus;%20f_n_-_2)

![equation](https://latex.codecogs.com/png.latex?%5Cbg_white%20%5CLARGE%20f_2%20%3D%20f_%28_1_%29%20&plus;%20f_%28_0_%29)

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
* BACKPACK OF SIZE S, S = 9
* There is a list of items of various sizes {3, 7 ,8 , 15}
* **is it possible to take any random combination of these numbers to add to S?**

* Solution is a recursive relation/function
  *  Trying to brute force this is a bad choice because of runtime
```java
knapsack(x, 1) //first number is size of backpack, second number is item in list*
if(x == s1) return true;
```