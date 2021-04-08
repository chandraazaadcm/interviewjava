package trickyQuestions;

public class Child extends Parent {
	int a=20;
	void show(int a)
	{
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.show(45);
		System.out.println(Double.MIN_VALUE);
	}
}
