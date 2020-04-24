package Java_Pac;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10 ,  f1=0,f2=1;
		System.out.print(f1+"+"+f2+"+");
		for(int i=1;i<=n;i++)
		{
			
			int sum = f1+f2;
			System.out.print(sum+"+");
			f1=f2;
			f2=sum;
		}
		

	}

}

//Output : 0+1+1+2+3+5+8+13+21+34+55+89+
