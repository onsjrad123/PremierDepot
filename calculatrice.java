import java.util.Scanner;
class calcularatrise{
    float x;
    float y;
    calcularatrise(int x,int y){
        this.x=x;
        this.y=y;
    }
    int addition(int x, int y){
        return x+y;
    }
    int soustraction(int x, int y){
        return x-y;
    }
    int multiplication(int x, int y){
        return x*y;
    }
    float division(int x, int y){
        if (y!=0){
            return x/y;

        }
        else{
            return 0;
        }
        
        
    }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int a;
        int b;
        String opp;
        System.out.println("donner a:");
        a=sc.nextInt();
        System.out.println("donner b:");
        b=sc.nextInt();
        calcularatrise c=new calcularatrise(a,b);
        sc.nextLine();
    
        System.out.println("donner opp:");
        opp=sc.nextLine();
        if (opp.equals("+")){
            System.out.println("addition:"+c.addition(a,b));
        }
       else if (opp.equals("-")){
            System.out.println("addition:"+c.addition(a,b));

       }
       else if (opp.equals("*")){
            System.out.println("multiplication:"+c.multiplication(a,b));



       }
       else if (opp.equals("/")){
           System.out.println("division:"+c.division(a,b));

       }
        
        
        
    }
}