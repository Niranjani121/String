import java.util.Scanner;

public class Wordcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        int count=0;
        String[] words=str.trim().split("");

        for(int i=0 ; i<words.length; i++){
            if(!words[i].equals("")){
                count++;
            }
        } System.out.println("Number of words:"+count);
        sc.close();

    }
}