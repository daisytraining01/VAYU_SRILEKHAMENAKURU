package Java_Pac;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a, b = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string  to check  palindrome or not:");
	        a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println(b +":Is palindrome.");
	        }
	        else
	        {
	            System.out.println(b+" :Is not palindrome.");
	        }
	    }

	}

/*Output:
	Enter the string  to check  palindrome or not:aba
	aba:Is palindrome.*/

