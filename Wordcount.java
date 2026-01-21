import java.util.Scanner;

public class Wordcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        int count=0;
        boolean word=false;

        for(int i=0 ; i<str.length(); i++){
            if(str.charAt(i)!=''&&!word ){
                count++;
                word=true;
            }
            else if(str.charAt(i)==''){
                word=false;
            }
        } System.out.println("Number of words:"+count);
        
    }
}