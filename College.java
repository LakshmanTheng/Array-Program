package abstractin;

public class College {

	
	
	College(){
		System.out.println("Cunstroctor");
	}
	static {
		System.out.println("Hello Static");
	}
	static void disp() {
		System.out.println("Hello static method");
	}
	public void disp1() {
		System.out.println("Normal Method");
	}
		
	
	public static void main(String[] args) {
		College obj=new College();
		obj.disp();
		obj.disp1();
		

	}

}
