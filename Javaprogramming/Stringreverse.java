import java.util.*;
   class Stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=" ";
        for(int i=0;i<a.length();i++){
            char s=a.charAt(i);
            b=s+b;
        }
        System.out.print(b);
    }
       
}
	
