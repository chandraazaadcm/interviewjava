package trickyQuestions;

public class StaticInstance {
public static void add()
	{
		System.out.println("This is addition");
	}
public void sub()
{
	System.out.println("This is sub");
}
public static void mul()
{
	System.out.println("This is mul");
}
public static void main(String[] args) {
	add();
	StaticInstance.mul();
}
}
