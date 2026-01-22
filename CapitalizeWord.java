import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter a String:");
           String str=sc.nextLine();

           String[] words=str.split("");
           String result="";

           for(int i=0;i<words.length;i++){
            String word=words[i];
            
            if(word.length()>0){
                String FirstLetter=word.substring(0).toUpperCase();
                String remaining=word.substring(1).toLowerCase();
                result=result+FirstLetter+remaining+"";

            }
           }
           System.out.println("After Captitalization");
           System.out.println(result.trim());
           sc.close();
    }
}
