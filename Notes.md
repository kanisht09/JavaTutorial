- For classes we use Pascal Convention for naming.
- For functions we use Camel Convention for naming.

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

- byte 1 byte
- short 2 bytes
- char 2 bytes
- int 4 bytes
- float 4 bytes
- double 8 bytes
- long 8 bytes
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

#### Strings are immutable in Java .

For printing in Java we can use :

- System.out.print()
- System.out.println() // same as System.out.print() with additional '/n' character
- System.out.printf() // format specifier -> similar to C
- System.out.format() // format specifier
