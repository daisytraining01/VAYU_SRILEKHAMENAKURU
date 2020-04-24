package Java_Pac;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayOverloading obj = new DisplayOverloading();
	       obj.disp('a');
	       obj.disp('a',10);
	       obj.display();
	}

}
interface Interface
{
	void display();
}
class DisplayOverloading implements Interface
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface Example");
		
	}
}

/*Output :
	a
	a 10
	Interface Example*/
	
