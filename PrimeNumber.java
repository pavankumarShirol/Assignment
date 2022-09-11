import java.util.Scanner;
import java.lang.Math;

// Write a Java program to read an integer and check whether the number is prime or not. If negative
// number is entered, throw an exception NegativeNumberNotAllowedException and if entered
// number is not prime, then throw NumberNotPrimeException.

public class PrimeNumber {
    public static void main(String[] args) throws NumberNotPrimeException,NegativeNumberException {
        int num;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        num = sc.nextInt();

        if(num < 0){
            try{
                throw new NegativeNumberException(num);
            }catch(NegativeNumberException e1){
                System.out.println(e1.toString());
            }
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num % i == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Number id Prime Number");
            }else{
                try{
                    throw new NumberNotPrimeException(num) ;
                }catch(NumberNotPrimeException e){
                    System.out.println(e.toString());
                }
            }
        }
    }
}

class NumberNotPrimeException extends Exception{
    int a;
    NumberNotPrimeException(int a){
        this.a = a;
    }
    public String toString(){
        return a + "  not a Prime number";
    }
    
}

class NegativeNumberException extends Exception{
    int a; 
    NegativeNumberException(int a){
        this.a = a;
    }
    public String toString(){
        return a + " is a negative number";
    }
    
}