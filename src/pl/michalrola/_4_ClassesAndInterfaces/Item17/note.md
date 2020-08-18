##Minimize mutability

#####To make a class immutable, follow these five rules:
>1. **Don’t provide methods that modify the object’s state** (known as mutators).
>
>2. **Ensure that the class can’t be extended.** This prevents careless or malicious
subclasses from compromising the immutable behavior of the class by
behaving as if the object’s state has changed. Preventing subclassing is
generally accomplished by **making the class final**, but **there is an alternative
that we’ll discuss later**.
>
>3. **Make all fields final.** This clearly expresses your intent in a manner that is en-
forced by the system. Also, it is necessary to ensure correct behavior if a refer-
ence to a newly created instance is passed from one thread to another without
synchronization, as spelled out in the memory model.
>
>4. **Make all fields private.** This prevents clients from obtaining access to
mutable objects referred to by fields and modifying these objects directly.
While it is technically permissible for immutable classes to have public final
fields containing primitive values or references to immutable objects, it is not
recommended because it precludes changing the internal representation in a
later release (Items 15 and 16).
>
>5. **Ensure exclusive access to any mutable components.** If your class has any
fields that refer to mutable objects, ensure that clients of the class cannot obtain
references to these objects. Never initialize such a field to a client-provided
object reference or return the field from an accessor. Make defensive copies
(Item 50) in constructors, accessors, and readObject methods (Item 88).
>
>
###Notes
>
>* Immutable objects are simple.
>* Immutable objects are inherently thread-safe; they require no synchronization.
>* A consequence of the fact that immutable objects can be shared freely is that
   you **never have to make defensive copies** of them (Item 50). In fact, you never
   have to make any copies at all because the copies would be forever equivalent to
   the originals. Therefore, you need not and should not provide a clone method or
   copy constructor (Item 13) on an immutable class.
>* Not only can you share immutable objects, but they can share their internals.
>* Immutable objects make great building blocks for other objects
>* Immutable objects provide failure atomicity for free
>* The major disadvantage of immutable classes is that they require a separate object for each distinct value.
>* 
>