
public class This21 {

	int a;
	String  b;
	String c;
	
	This21(int a , String b , String c)
	{
		//a= a     //{local variable and instance variable are same for that we use This keyword, here this keyword is used to  know the difference in mathod }
		b= b;   //{difference in local and instance varibale ,...here this keyword is used to know the current class using refernce ofinstance  varaible} 
		c=c;
		System.out.println(a+" ,"+b+","+c );
	}
	
	
	void This2(int a , String b , String c)
	{
		this.a= a  ;
		this.b= b;   //{difference in local and instance varibale ,...here this keyword is used to know the current class using refernce ofinstance  varaible} 
		c=this.c;
		System.out.println(a+" ,"+b+","+c );
	}
	
	public static void main(String[] args)
	{
		This21 a = new This21(9, "num", "mui");
		
	
	}
}
