import java.io.*;

public class UserInputviaBufferedReader {

    public static void main(String args[]) throws IOException {

        System.out.println("Taking input from user via BufferedReader");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);

        System.out.println("Enter a string");

        /*
         * NOTE : Using this input method we don't need to care about clearing input
         * buffer (we encountered it in taking input from Scanner)
         */

        String s = br.readLine();
        System.out.println(s);

    }

}