
public class ThisKeyword {
  // This keyword used to current class instance variable
	int a;
	String  b;
	String c;
	
	ThisKeyword(int r , String n , String q)
	{
		a= r;//{local variable and instance variable as different }
		b= n;
		c=q;
		System.out.println(a+" ,"+b+","+c );
	}
	
	
	
	public static void main(String[] args)
	{
		ThisKeyword a = new ThisKeyword(9, "num", "mui");
		
	
	}
	
	
	
	
	
	
}
