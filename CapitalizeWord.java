import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter a String:");
           String input=sc.nextLine();

           String[] words=input.split("");
           String result="";

           for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()>0){
                result=result+word.substring(0,1).toUpperCase()+word.substring(1)+" ";

            }
           }
           System.out.println("After Captitalization");
           System.out.println(result.trim());
    }
}
