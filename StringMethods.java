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
        System.out.println(replacedName);

    }
}
