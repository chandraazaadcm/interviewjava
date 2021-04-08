package programs;

public class AmstrongNumber {
public void isAmg(int num)
{
	int r;
	int t=num;
	int cube=0;
	while(num>0)
	{
		r=num%10;
		cube=cube+(r*r*r);
		num=num/10;
	}
	if(t==cube)
	{
		System.out.println("this is amstrongnumber");
	}
	else
	{
		System.out.println("this is not amstrong number");
	}
}
	public static void main(String[]args)
	{
		AmstrongNumber am=new AmstrongNumber();
		am.isAmg(153);
	
}
}
