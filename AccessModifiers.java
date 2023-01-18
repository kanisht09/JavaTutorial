import java.util.Random;

class MyEmployee{

    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();

        // obj.id=4;   throws error as id is private
        // obj.name="Ram"; throws error as name is private

        obj.setName("Harry");
        obj.setId(5);
        System.out.println(obj.getName());
        System.out.println(obj.getId());                

        Random r=new Random();
        int x=r.nextInt(3);
        System.out.println(x);

    }
}
