public class Method {
    
    static int fun(int x,int y){   // note : x and y are new copies of the parameters passed.
        
        /*
         *  Why static is used ?
         *  This is because we are calling it from a static method i.e main 
         *  and without creating any object.
         */

        int res;
        if(x>y){
            res=x-y;
        }
        else{
            res=x*y;
        }

        x=2*x;  // checking whether x and y changes (when passing from main method) in main method as well or not
        y=2*y;

        return res;
    }
    int sum(int x,int y){   
        
        /* 
            here we didn't wrote static so we have to create an object of this
            class and then call the method using its object.
        */

        return x+y;
    }
    public static void main(String[] args) {
        

        /* 
            the word function and method are often used interchangeably. Methods are functions written within classes.  
        */

        int a=5;
        int b=6;
        System.out.printf("%d %d\n",a,b);  // 5 6
        int res=fun(a,b);   // we tried to change a and b in fun() method but we observe a and b didn't get change.
        System.out.printf("%d %d\n",a,b);  // 5 6 

        System.out.println(res);
        System.out.println(fun(6,5));



        Method obj=new Method();
        res=obj.sum(5,6);    // Method invocation using object creation
        System.out.println(res);



    }
}
