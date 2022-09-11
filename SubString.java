import java.util.Scanner;

// Write a Java program to perform the following operations:

// a) Read a line of text
// b) Search for a sub-string SDMCET (case insensitive search)
// c) If found, then print success message
// d) Otherwise throw an exception SubStringNotFoundException with appropriate message

public class SubString {
     public static void main(String[] args )  {
        Scanner sc = new Scanner(System.in);

        String patternStr1 = "SDMCET";
        String patternStr2 = "sdmcet";

        System.out.println("Enter a String");
        String str = sc.nextLine();

        int t = str.length();
        int m = patternStr1.length();
        int n = patternStr2.length();

        for(int i=0;i<=t - m;i++){
            int j = 0;

            while(j<m && (  patternStr1.charAt(j)==str.charAt(j+i) || patternStr2.charAt(j)==str.charAt(j+i))){
                j=j+1;
            }
            if(j==m){
                System.out.println("Sub-String Found At the Index " + i);
                System.exit(0);
            }
           
        }
        try{
            throw new SubStringNotFoundException();
        }catch(SubStringNotFoundException e2){
            System.out.println(e2.toString());
        }

     }
}
class SubStringNotFoundException extends Exception{
    public String toString(){
        return " Not found a Sub  String";
    }
}