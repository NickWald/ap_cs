## Inheritence + Polymorphism <div style="font-size: 20px; color: gray;">2/21/20</div>



**Animal Class - Properties**:
* `boolean hasLegs;`
* `int eyeCount;`
* `Animal[] predators; OR ArrayList <Animal> predators;`
* `Animal[] prey; OR ArrayList <Animal> prey;`
* `boolean isPredator;`
* `String type`

this gets annoying at a large scale, and is insufficent with regard to sea animals and insects

Thus, maybe I need different types of animals, just more specific

Making static variables allows use of Animal properties along with more specific ones

EXTENDS, makes snake a subclass, keeping animal classes while adding its own

```java
public class Snake extends Animal;
```


So snake has access to animal properties and its own

**Snake Class - Properties**:
* `poison`
* `length`
* `speed`
* `thickness`
* `pattern`


HIERARCHY:

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
