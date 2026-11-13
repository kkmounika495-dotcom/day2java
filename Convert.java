import java.util.Scanner;
class Convert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        System.out.println(num);
        sc.nextLine();
        System.out.println("enter a string:");
        String s=sc.next();
        System.out.println(s);
    }
}