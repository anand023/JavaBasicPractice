#Immutable
### Following are the requirements:
1. The **class** must be declared as **final**. _(So that child classes can’t be created)_
2. **Data members** in the class must be declared as **private**. _(So that direct access is not allowed)_
3. **Data members** in the class must be declared as **final**. _(So that we can’t change the value of it after object creation)_
3. **A parametrized constructor should initialize all the fields** performing a deep copy. _(So that data members can’t be modified with object reference)_
4. Deep Copy of objects should be performed in the getter methods _(To return a copy rather than returning the actual object reference)_
5. **No setters** _(To not have the option to change the value of the instance variable)_

* **Immutable** class means that once an object is created, **we cannot change its content**. _In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well._ 


Hello