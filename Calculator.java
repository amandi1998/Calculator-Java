import java.util.Scanner;
public class Calculator{
  public static void main(String args []){
      
  // variables declaring  and initialization
	double number1;
	double number2;
	double answer;
        char  operator = " ";   
     
/*Calculator.java:9: error: incompatible types: String cannot be converted to char
 char operator =""; ^1 error*/

  // Creating Scanner variable
     Scanner scanner = new Scanner(System.in);

  // getting user inputs
     System.out.println("Enter First Number :");
        number1 = scanner.nextDouble();

     System.out.println("Enter Second Number :");
        number2 = scanner.nextDouble();

     System.out.println("Enter an Operator (+,-,*,/) :");
 	operator = scanner.next().charAt(0);     

    /*The charAt() method returns the character at the specified index in a string. 
      The index of the first character is 0,
      the second character is 1, and so on*/      

     // Switch expression
         switch(operator){

            case '+' : answer = number1 + number2;
	      break;

	    case '-' : answer = number1 - number2;
	      break;
	    
            case '*' : answer = number1 + number2;
	      break;

	    case '/' : answer = number1 - number2;
	      break;

              
             default : System.out.println("Error! Enter correct operator.");            
              
                //
                }
	
       System.out.println(number1 + " " + operator + " " + number2 + " = " + answer);
           
  }
 }
