import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        int result=(int)Math.pow(base,exponent);
        System.out.print(result);
    }
}
