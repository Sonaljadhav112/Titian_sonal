package Interview;

public class Childcasting extends Parentcasting {
	



	@Override
	public void method1() {
	System.out.println("hello brother");
	}

	public static void main(String[] args) {
		Parentcasting parent=new Childcasting();
		parent.method1();
		Childcasting ch=(Childcasting)parent;
		ch.method1();
		

	}

}
