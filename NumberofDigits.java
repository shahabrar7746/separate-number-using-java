import java.util.*;
public class NumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number");
				int ip = s.nextInt();//this variable will take our input 
			
				int reversed_no = 0;//this variable will be used to contain our input in reverse
				int remainder = 0;//this variable will use in containing remainder
				//this loop will calculate our input in reverse direction
				while(ip != 0) {
					remainder = ip%10;
					reversed_no = reversed_no*10 + remainder;
					ip = ip/10;
				
					
				}//this will print all the didgits in our input variable using reversed_no variable
				System.out.print("Digits in your number are ");
				while(reversed_no != 0) {
					ip = reversed_no%10;
					reversed_no = reversed_no/10;
					System.out.print(ip + " ");
				}

			}

		}
