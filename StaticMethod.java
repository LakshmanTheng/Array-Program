package abstractin;

public class StaticMethod {
	
	

	static void temp() {// static method  directly no calling 
		
		
		System.out.println("Static method");
		StaticMethod ob=new StaticMethod();
		 ob.disp();
		
		
	}
	public void disp() {
	System.out.println(" normal method");
	
	
	}

	public static void main(String[] args) {
		StaticMethod obj=new StaticMethod();
		obj.temp();
	
		
	
	}
}
