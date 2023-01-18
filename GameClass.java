import java.util.Random;
import java.util.*;

class Game {

    private int num;
    private int score;
    private int choice;
    public Game(){
        Random r=new Random();
        score=0;
        num=r.nextInt(0, 100);
    }
    public void takeUserInput(){

        
            System.out.println("Enter the number : ");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            System.out.println(choice);
            // sc.close();
            score++;
    }
    public boolean check()
    {
        
        if(choice>num){

            System.out.println("Too high");

            return false;

        }
        else if(choice<num){
            System.out.println("Too low");
            return false;
        }
        else{
            System.out.println("Bingo!");

            return true;
        }
    }
    public int currentScore(){
        return score;
    }
}

public class GameClass {
    
    public static void main(String[] args) {
        
        Game obj=new Game();
        obj.takeUserInput();
        while(obj.check()==false) {
            obj.takeUserInput();
            
        }       
        System.out.println("Your final score is : "+obj.currentScore());
        System.out.println(Math.PI);
    }
}
