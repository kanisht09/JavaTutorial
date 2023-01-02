public class StringMethods {
    public static void main(String[] args) {

        String name = new String("harry");
        System.out.println(name);

        /* Another method for declaring strings */

        // String name2 = "Harry";
        // System.out.println(name2);

        // String length

        int len = name.length();
        System.out.printf("The string lemgth is %d\n", len);

        // Converting string into uppercase

        String nameInUppercase = name.toUpperCase();
        System.out.println(nameInUppercase);

        // Converting string into lowercase

        String nameInLowercase = name.toLowerCase();
        System.out.println(nameInLowercase);

        // Trimming white space before first and last character (i.e trailing and
        // leading spaces)

        name = "      Harry      God      ";
        System.out.println(name);
        String trimmedName = name.trim();
        System.out.println(trimmedName);

        // Printing substring of a string
        name = "Hello World";
        System.out.println(name.substring(1, 4)); // note : ending index is not included.
        System.out.println(name.substring(4)); // starts printing from 4th index till the end.

        name = "I am Harry";
        String replacedName = name.replace('r', 'p');

        /*
         * replace method replaces all the
         * occurences of a character or a
         * string
         */

        System.out.println(replacedName);
        replacedName = replacedName.replace("ppy", "rry");
        System.out.println(replacedName);

        name = "Hello";
        System.out.println(name.startsWith("Hel")); // prints true

        /*
         * Method name : startsWith()
         * Parameter : string only (no single character)
         * Return type : boolean
         * Description : checks whether the given string starts with the input parameter
         */

        System.out.println(name.startsWith("Eel")); // prints false

        /*
         * Method name : endsWith()
         * Parameter : string only (no single character)
         * Return type : boolean
         * Description : checks whether the given string ends with the input parameter
         */

        System.out.println(name.endsWith("llo")); // prints true
        System.out.println(name.endsWith("tlo")); // prints false

        // name.charAt(i) is equivalent to name[i] in C/C++ but we are not allowed to
        // change its value

        name = "Hello";

        System.out.println(name.charAt(1));

        // name.charAt(1)='e'; // this statement is forbidden in Java

        // name.indexOf("string") -> returns the first index of the input parameter

        /* NOTE : indexOf() returns -1 if pattern is not found */

        name = "Helelo"; // first index of "el" is at position 1

        System.out.println(name.indexOf("el"));

        System.out.println(name.indexOf("el", 2)); /* additional parameter where to start searching from */

        // last index of "el" is at position 3

        System.out.println(name.lastIndexOf("el"));

        System.out.println(name.lastIndexOf("el", 2)); /* additional parameter where to start searching from */

        // equals() similar to == method for string comparison in C++
        // NOTE : In Java you can't compare strings using == operator

        name = "golu";
        System.out.println(name.equals("golu"));
        System.out.println(name.equals("Golu"));
        System.out.println(name.equalsIgnoreCase("Golu")); // ignoring case of characters

    }
}
