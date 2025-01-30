import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int a = sc.nextInt();
        System.out.print("Enter b number =");
        int b = sc.nextInt();
        System.out.println("Arithmetic Operators.");
        int sum =a+b;
        int Difference=a-b;
        int product=a*b;
        int quotient = a/b;
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + Difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);
        System.out.println("Relational operators.");
        boolean Greaterthan = (a>b);
        boolean lessthan =(a<b);
        boolean equalto = (a==b);
        boolean NotEqualto = (a!=b);
        boolean GreaterthanORequalto= (a>=b);
        boolean lessthanorequalto = (a<=b);
        System.out.println("GreatestNumber = " + Greaterthan);
        System.out.println("Lessthan = " + lessthan);
        System.out.println("Equalto = " + equalto);
        System.out.println("notequalto = " + NotEqualto);
        System.out.println("GreaterthanorEqualto = " + GreaterthanORequalto);
        System.out.println("lessthanorequato = " + lessthanorequalto);
        System.out.println("Logicaloperators.");
        boolean cond1 = (a>0);
        boolean  cond2 = (a<0);
        boolean and=(cond1&&cond2);
        boolean or =(cond1||cond2);
        boolean not =(!cond2);
        System.out.println("ANDResult = " + and);
        System.out.println("ORResult = " + or);
        System.out.println("NOTRESULT = " + not);
        sc.close();



        
    }
    
}
