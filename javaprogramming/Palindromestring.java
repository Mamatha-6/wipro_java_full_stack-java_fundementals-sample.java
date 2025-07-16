	import java.util.*;
   class Palindromestring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        String reversestring="";
        for(int i=0;i<original.length();i++){
            char ch=original.charAt(i);
           reversestring=ch+reversestring ;
        }
        if(original.equals(reversestring)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println(" Not Palindrome String");
        }
    }
   }
       
