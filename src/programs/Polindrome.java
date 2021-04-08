package programs;

public class Polindrome {
public static void ispoli(int num)
{
	int rev=0;
	int temp;
	temp=num;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	
	}
	if(temp==rev)
	{
		System.out.println("this is polindrome");
	}
	else
	{
		System.out.println("this is not polindrome");
	}
}
public static void main(String[]args)
{
Polindrome pl=new Polindrome();
pl.ispoli(15351);

}
{
	
}
}
