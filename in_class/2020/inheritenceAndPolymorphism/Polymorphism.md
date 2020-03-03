# Polymorphism (part of extension)
## Full power of extension/polymorphism is seen in interfaces

This is a way to use this relationship to make programs more robust and general.

Polymorphism = is a ___ also a ___ ?

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
          fontsize = 11
  ]

  Monster [
          label = "{ Monster \l}"
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

```processing
monster unknown;
void setup(){
  size(800, 800);
  m = new monster(0, 0);
  v = new vampire(1000, 100000, false);
  unknown = new vampire(10, 0, true);
}
```

Which of these are legal:
<div style="text-align: left;">General</div> <div style="text-align: right;">Specific</div>
```java
Monster m = new Werewolf(); //LEGAL
```
```java
Werewolf w = new Werewolf(); //LEGAL
```
```java
Werewolf w1 = new Monster(); //ILLEGAL
```
```java
Vampire v = new werewolf(); //ILLEGAL
```
### ALSO WORKS W/ ARRAYS, to speed this up, use an array

Fill with a random set of monsters:
```java
int prettyBig = 5;
Monster [] menagerie = new Monster[prettyBig];
for (int i = 0; i < prettyBig; i++) {
  int rand = (int)(math.random()*4);
  if(rand == 0){
    menagerie[i] = new Vampire();
  }
  else if(rand == 1){
    menagerie[i] = new Monster();
  }
  else if (rand == 2) {
    menagerie[i] == new Zombie();
  }
  else menagerie[i] == new Werewolf();
}

//to show everything:
for(Monster m: menagerie) {
  m.show();
  m.emitSound(); //if the sub doesn't have an emitSound, it defaults to the parent class's method
}

//SO, TO CAST:
if(menagerie[0] instanceOf Vampire){
//instanceOf = is the class type equal?
//(== for class type)
  ((Vampire) menagerie[0]).emitSound();
}
```

```java
//SO, TO CAST:
((Vampire) menagerie[0]).emitSound();
```


###### THIS IS USING 1 ARRAY OF 1 TYPE TO HOLD MULTIPLE DATATYPES
(woah)


Array can hold a UI element as a parent class, with a subclass being button, or cursor, or etc.
