class MainEmployee{
    int salary;
    String name;

    /* Constructor */

    public MainEmployee(){
        salary=0;
        name="Your name here";
    }

    /* Constructor with arguments */

    public MainEmployee(String s){
        name=s;
    }

    public int getSalary(){
        return salary;        
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }

}


public class Constructors {

    public static void main(String[] args) {

        MainEmployee ob=new MainEmployee("Hello");
        System.out.println(ob.getName());        
        ob.setName("Harry");
        System.out.println(ob.getName());   

        // Converting string to integer in java

        String x="5";
        int y=Integer.parseInt(x);
        System.out.println(y);     

        // Converting int to string in java

        y=6;
        x=Integer.toString(y);


    }
}
