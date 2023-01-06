public class MethodOverloading {
    
    static void tellJoke(){
        System.out.println("I invented a new word\n"+"Plagiarism");
    }
    static void change(int x){ // number gets copied
        x=55;
    }
    static void change(int [] marks){ // reference gets copied
        marks[0]=55;
    }
    public static void main(String[] args) {
        tellJoke();
        
        // Case 1: changing a number

        int x=65;
        change(x);
        System.out.println(x); // NO change

        // case 2: changing the array

        int [] marks={56,77,86,90,93}; // marks stores the address of the object 
        change(marks); // now we are passing the reference or address of the object we created
        System.out.println(marks[0]); // array element gets changed


        /*
         *  In case of arrays reference is passed and same is the case for objects being passed in methods.
         */

    }
}
