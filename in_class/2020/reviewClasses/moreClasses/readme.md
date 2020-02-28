## <b>1/8/20 - Vector Class</b>



+ A Vector has a size and direction, also x and y components
+ A vector can be represented as (x, y), a list of instructions on how to move
+ Vector is the path to the point


When you want to add vectors, just add the pieces

```viz
digraph G {
  fontname = "SF Mono"
  fontsize = 10

  node [
          fontname = "SF Mono"
          fontsize = 12
          shape = "record"
          width = "2.5"
  ]

  edge [
                fontname = "SF Mono"
                fontsize = 10
  ]

  Vector [
          label = "{ Vector |
            - name : string\l
            - x : int\l
            - y : int \l
            - weight : int\l
            - eyeCount: int\l
            - hasLegs : boolean\l
            - Animal[] predators\l
            - Animal[] prey\l
            - isPredator : boolean\l
            - type : string\l
            |
            + add() : void\l
            + subtract() : void\l
            + toString() : void\l
            + dotProd() : void\l}"
  ]
}
```



## Classes:
+ Template or Blueprint, defines a datatype
+ (Something we can make a variable out of)

int x, String s, Complex c

## Objects
+ The specific manifestation of that idea


```viz
digraph G {
  fontname = "SF Mono"
  fontsize = 10

  node [
          fontname = "SF Mono"
          fontsize = 12
          shape = "record"
          width = "2.15"
  ]

  edge [
                fontname = "SF Mono"
                fontsize = 10
  ]

  Point [
          label = "{ Point |
            - name : string\l
            - x : int\l
            - y : int \l
            |
            + set() : void\l
            + get() : void\l
            + toString() : void\l}"
  ]
}
```
