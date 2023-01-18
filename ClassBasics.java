/*
 *  Problem statement 1 : Create a class Employee with following properties and methods :
 *  Salary(property) int
 *  getSalary(method) returning int
 *  name (property) string
 *  getName (method) returning string 
 *  setName (method) changing name 
 * 
 *  Problem statement 2 : Create a class Square with following properties and methods :
 *  setSide to initialise its side
 *  getArea (method) returning area of square
 *  getPerimeter (property) returning perimeter of square
 */


class Employee{
    int salary;
    String name;
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


class Square{

    double side;
    public void setSide(double side_){
        side=side_;
    } 
    public double getArea(){
        double res=side*side;
        return res;
    }
    public double getPerimeter(){
        return 4*side;
    }

}

public class ClassBasics {
    public static void main(String args[]){

        Employee h=new Employee();
        h.setName("Harry");
        String s$=h.getName();
        System.out.println(s$);

        Square s=new Square();
        s.setSide(5);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        
    }
}
