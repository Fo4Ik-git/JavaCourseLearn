package com.fo4ik.learn.variable;

import java.util.*;

public class Variable {

    /**
     * Variable is a name given to a storage area that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.
     * Primitive data types are predefined by the language and named by a keyword.
     * Non-primitive data types are created by the programmer and is not defined by the language. Non-primitive types are created by using predefined keywords.
     *
     * Primitive data types:
     * byte, short, int, long, float, double, boolean, char
     *
     * Non-primitive data types:
     * {@link String}, {@link Arrays}, {@link Class}, Interface, {@link Enum}
     *
     * Primitive data types are stored in stack memory, non-primitive data types are stored in heap memory.
     * Primitive data types are faster than non-primitive data types.
     * Primitive data types are immutable, non-primitive data types are mutable.
     * Primitive data types are passed by value, non-primitive data types are passed by reference.
     **/

    public static void main(String[] args) {
        //byte is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
        byte byteVar = 127;
        //short is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
        short shortVar = 32767;
        //int is a 32-bit signed two's complement integer. It has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.
        int intVar = 2147483647;
        //long is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.
        long longVar = 9223372036854775807L;
        //float is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with the recommendations for
        float floatVar = 3.4028235E38f;
        //double is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
        double doubleVar = 1.7976931348623157E308;
        //boolean is a data type which has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
        boolean booleanVar = true;
        //char is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
        char charVar = 'a';


        //String is a sequence of characters. String is an object, which contain methods that can perform certain operations on strings. For example, the length method of String class returns the length of a string.
        String stringVar = "Hello World!";
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        int[] intArray = {1, 2, 3, 4, 5};
        //Classes are used to create user-defined types. Classes are the basics of object-oriented programming.
        //Interfaces are used to achieve abstraction. There can be only abstract methods in the interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.


    }
}
