
class Employee{

    int id;
    String name;
    int salary;
    public void printDetails()
    {
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My salary is : " + salary);
    
    }
    public int getSalary(){
        return salary;
    }
}
public class CustomClass {
    
    public static void main(String args[]){

        System.out.println("Hi");
        Employee obj=new Employee();

        // Setting the attributes
        obj.id=4;
        obj.name="Kanisht";
        obj.salary=10000;
        
        // Printing the values
        obj.printDetails();
        System.out.println(obj.getSalary());
        // System.out.printf("%d %s ",obj.id,obj.name);
    
    }
}
