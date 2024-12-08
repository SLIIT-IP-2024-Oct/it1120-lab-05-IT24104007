import java.util.Scanner;
public class IT24104007Lab5Q1{
 public static void main (String[] args){
   Scanner value=new Scanner(System.in);
    
 System.out.print("Enter the first integer: ");
int numOne=value.nextInt();

 System.out.print("Enter the second integer: ");
int numTwo=value.nextInt();


 System.out.print("Enter the third integer: ");
int numThree=value.nextInt();


int smallest=numOne;
int largest=numOne;

if(numTwo<smallest){
   smallest=numTwo;
} if
     (numThree<smallest){
      smallest=numThree;
}if(numTwo>largest){
   largest=numTwo;
}if(numThree>largest){
   largest=numThree;
}

 System.out.println("User entered numbers are: "+numOne+" "+numTwo+" "+numThree);
 System.out.println("The Smallest number is: "+smallest);
 System.out.print("The Largest number is: "+largest);


    }
}