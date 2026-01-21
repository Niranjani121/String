import java.util.Scanner;

public class WhiteSpcRemove{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String:");
        String input=sc.nextLine();

        String result=input.replaceAll("\\s","");

        System.out.println("String after removing spaces:");
        System.out.println(result);
    }
}