public class VarArgsTutorial {
    
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }

        
       /* We don't need have var args syntax in C++ or C */

        // pack all the arguments into an array
        static int sum(int ...arr){

            int res=0;
            for(int num:arr){
                res+=num;
            }
            return res;

        }
        static int sum2(int x,int ...arr){

            int sum=x;
            for(int num:arr){
                sum+=num;
            }
            return sum;

        }

    int csum(int a,int b){
        return a+b;
    }
    public static void main(String []args)
    {
        System.out.println("hello");
        System.out.println(sum()); // works
        // System.out.println(sum2()); // won't work , one argument compulsory
        System.out.println(sum2(5));

        System.out.println(sum(4,5));
        VarArgsTutorial obj=new VarArgsTutorial();
        System.out.println(obj.csum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,1));

    }
}
