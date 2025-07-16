import java.util.*;
class Box{
     static int  volume(int width,int height,int depth){
       return width*height*depth;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int width=sc.nextInt();
        int height=sc.nextInt();
        int depth=sc.nextInt();
        int result=volume(width,height,depth);
        System.out.println("volume"+result);
    }
}
