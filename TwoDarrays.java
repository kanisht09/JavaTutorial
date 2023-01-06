import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        
        // int [] marks;    // 1-D array
        int [][] flats; // 2-D array

        Scanner sc=new Scanner(System.in);

        // marks=new int[5];
        flats=new int[2][3];

        for(int i=0;i<2;i++){
            System.out.println("Enter flat numbers in floor number "+i);
            for(int j=0;j<3;j++){
                flats[i][j]=sc.nextInt();
            }
        }
        System.out.println("Flat Details");
        for (int[] flat : flats) {
            
           for (int details : flat) {
                System.out.printf("%d ",details);
           }
           System.out.println();
        }

        // int x=7/3;
        // System.out.println(x);

        
        sc.close();


    }
}
