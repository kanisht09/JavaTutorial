- For classes we use Pascal Convention for naming.
- For functions we use Camel Convention for naming.

---

Data-types in Java Language

There are two types of data-types in Java : Primitive and Non-Primitive data-types.

- Primitive data-types :-

  - byte
  - short
  - boolean
  - int
  - char
  - float
  - double
  - long

- Non-Primitive data-types :-

  - Class
  - Object
  - String
  - Array
  - Interface

  <br/>

- byte :- 1 byte
- short :- 2 bytes
- char :- 2 bytes
- int :- 4 bytes
- float :- 4 bytes
- double :- 8 bytes
- long :- 8 bytes
- boolean :- size depends on JVM (Java Virtual Machine)

#### Deafult values of data types in Java

- byte -> 0
- short -> 0
- int -> 0
- boolean -> false
- float -> 0.0f
- long -> 0
- double -> 0.0d
- char -> '\u0000'

### NOTE : In Java char consumes 2 bytes unlike in C/C++ where it consumes only 1 byte.

This is because char in Java also supports unicode.

- To get the maximum value of long in Java we can use Long.MAX_VALUE and to get the minimum value of long in Java we can use Long.MIN_VALUE.
- To get the maximum value of int in Java we can use Integer.MAX_VALUE and to get the minimum value of int in Java we can use Integer.MIN_VALUE.

### Strings are immutable in Java .

For printing in Java we can use :

```
System.out.print()

System.out.println()  // same as System.out.print() with additional '/n' character

System.out.printf() // format specifier -> similar to C

System.out.format() // format specifier
```

### Converting string to integer in java

```
  String s="5";
  int x=Integer.parseInt(s);
```

### Converting integer to string in java

```
  int x=6;
  String s=Integer.toString(x);
```

In case of arrays reference is passed and same is the case for objects being passed in methods.
Two or more methods can have same name but different parameters.Such methods are called overloaded methods.

OOPS Terminologies

Abstraction : Hiding internal details (show only necessary information).  
Encapsulation : Wrapping of data into a single unit.  
Inheritance : The act of deriving new things from existing things.  
Polymorphism : One entity many forms.

IMP :In one Java file we can only have 1 public class.

Access Modifiers in Java :-

- private
- default
- public
- protected

---

```
Random obj = new Random();
int x=obj.nextInt(l,r); // here l denotes starting value and r denotes the bound
```

Constructor - a member function used to initialize an object while creating it.
