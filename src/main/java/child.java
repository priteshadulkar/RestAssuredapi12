
public class child extends Parent {

	public void aff()
	{
		System.out.println("child");
		
	}
	
	public static void main(String[] args)
	{
		child c = new child();
		c.add();
		c.aff();
		
		Parent p = new child();
		p.add();// We can call only parent class mathod not child class
		
	}
}
