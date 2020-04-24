package Java_Pac;

public class Encap_Inheri_Constru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation enp = new Encapsulation();
		enp.setEmpName("Srilekha Menakuru");
		enp.setEmpAge(20);
		enp.setEmpId(2987);
        System.out.println("Employee Name: " + enp.getEmpName());
        System.out.println("Employee ID: " + enp.getEmpId());
        System.out.println("Employee Age: " + enp.getEmpAge());
        Dog d=new Dog();  
        d.bark();  
        d.eat();  

	}

}
class Encapsulation
{
	private int EmpId;
    private String empName;
    public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	private int empAge;
}
class Animal{ 
	
void eat()
{
	System.out.println("eating...");}  
}  
class Dog extends Animal{  
	public Dog()
	{
		System.out.println("*******invoking default constructor*******");
	}
void bark(){
	System.out.println("barking...");
	}  
}  

/*Output :
	Employee Name: Srilekha Menakuru
	Employee ID: 2987
	Employee Age: 20
	*******invoking default constructor*******
	barking...
	eating...*/
