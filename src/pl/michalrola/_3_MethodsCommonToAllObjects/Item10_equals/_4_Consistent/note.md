>**Consistency**—The fourth requirement of the equals contract says that if two
 objects are equal, they must remain equal for all time unless one (or both) of them
 is modified. In other words, mutable objects can be equal to different objects at
 different times while immutable objects can’t. When you write a class, think hard
 about whether it should be immutable (Item 17). If you conclude that it should,
 make sure that your equals method enforces the restriction that equal objects
 remain equal and unequal objects remain unequal for all time.