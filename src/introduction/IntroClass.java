package introduction;


class square{
	int a=40;
	int b=50;
	void area() {
		System.out.println("The area of the square is:" +(a*b));
	}
	
}
class circle extends square{
	void display() {
		System.out.println("This is square");
	}
}

class rectangle extends square{
	void rect() {
		System.out.println("rect");
	}
}

public class IntroClass {
	public static void main(String[] args) {
		circle ic=new circle();
		ic.display();
		ic.area();
		
		
	}

}
