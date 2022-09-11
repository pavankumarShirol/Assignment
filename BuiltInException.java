import java.util.Scanner;

//Write a Java program to generate and handle any three built-in exceptions and display appropriate
//error messages.

class BuiltInException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Handling the Arithmetic Exception
        int num1,num2,ans;
        System.out.println("Enter a two numbars for division \n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        try{
            ans = num1/num2;
            System.out.println("Answer : "+ ans);
        }  // If the number is divisible by the zero then handle it 
        catch(ArithmeticException e){
            System.out.println("Cannot be divisible by Zero \n");
        }

        //Handling the ArrayIndexOutOfBounds Exception 
        int arr[] = new int[5];
        System.out.println("Enter the index of the the array which you want to extact (Maximum Array size id 5)");
        int index = sc.nextInt();
        if(index > 4){
            try{
                arr[7]=10;    // accessing the element that is index out of bound
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index  out of bounds \n");
            }
        }
        else{
            System.out.println("element is : "+ arr[index]);
        }

        // Handling the StringIndexOutOfBounds Exception
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}