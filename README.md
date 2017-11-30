# ProgrammingPatterns

Examples of different common programming patterns written in Java. Most have a gamey theme. Some don't.

Currently includes:
  Strategy Pattern
  Observer Pattern
  Decorator Pattern
  
  
  Strategy Pattern
  The strategy pattern tries to solve the issue of needing to change the algorithm an object uses at runtime.
  The strategy pattern uses interfaces to ensure a class will have a certain method, and so can be hotswapped.
  In the example provided here, there is a Player class that takes a class that implements IArmourStrategy
  and an IWeaponStrategy in it's constructor. Any weapon or armour can extend this interface and be passed in,
  and because of this the method used to generate the attack and defence values can be decided or swapped at
  runtime. The Player can be asked for it's attack or defence value and it will just use it's current IWeaponStrategy
  and IArmourStrategy to calculate the value.
  
  Observer Pattern
  The observer pattern was design to eliminate the problem of polling. If an object needs to monitor another
  objects data and do things when that data changes, it can seem intuitive to just have it ask. This is fine
  if there is only a few objects but it doesn't scale. It is easier to have the object with the data to tell
  all the objects that need to know about it's state changes if and when it happens, rather than them asking
  periodically.
  I couldn't think of a game related thing to do in this example, so I just did a simple messaging system.
  There are 2 interfaces, one named IObserver and one named IObserverable. The EmergencyBroadcastSystem is
  an IObservable, and contains a HashMap that stores IObserver. There is a class called Citizen that is an
  IObserver. It takes a message in it's update method, and then calls it's own method to print that message.
  EmergencyBroadcastSystem iterates through it's HashMap of Citizens, passing them all the new message through
  their update method.
  
  Decorator Pattern
  The decorator pattern solves the issue of needing an object in multiple different configurations. No one wants
  to write deep nested if statements, and what if new configurations are need down the road? The decorator pattern
  solves this by have classes take objects as their own type in their constructor, and chaining method calls.
  In my example there is an abstract class called Entity that ensures anything inheriting from it has to implement
  getAttack and getDefence methods. Player is a concrete class that inherits from it and has the default behaviour
  for these methods, which is to just return the Player's attack and defence values.
  Equipment is an abstract class that inherits from Entity. Equipment has a default constructor that takes any Entity
  in it's constructor to ensure anything that inherits from it has to also implement this default constructor.
  ShortSword and Leather armour inherit from Equipment and both take the attack/defence value from the Entity they
  got from their contructor, and add to it in their getAttack/Defence methods.
  With this setup we can make a Player, the wrap it in a ShortSword, then wrap that in a LeatherArmour, and so on and
  so forth. When you call getAttack, you are calling the outer most layer. The outer layer calls the next layer which
  calls the next layer, all the way to the Player.