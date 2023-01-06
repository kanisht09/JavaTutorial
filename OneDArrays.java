public class OneDArrays {
    public static void main(String[] args) {
        
        /*
         *  Array is a collection of similar types of data.
         * 
         * 
        */
        int n=5;
        int [] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=(i+1)*2;
        }
        
        // marks[5]=7; -> throws an error

        for(int i=0;i<n;i++){
            System.out.printf("%d ",marks[i]);
        }


        System.out.println();
        
        // forEach loop in java

        for(int mark:marks){
            System.out.printf("%d ",mark);
        }
        System.out.println();

        // Printing the length of an array -> use length method no paranthesis
        System.out.println(marks.length);

        int [] a= {1,2,4,5,5,5}; // declaration + initialisation 
        System.out.println(a.length);

        float [] b={1.33f,2.34f,244,343};
        System.out.println(b.length);
        for (float f : b) {
            System.out.printf("%.2f ",f);
        }
        System.out.println();

        String [] students = {"Harry","Ravi","Kavi","Shami"}; // Array of strings
        System.out.println(students.length);
        for (String student : students) {
            System.out.printf("%s ",student);
        }

    }
}
