package programs;

public class LargestSmallest {
public static void main(String[]args)
{
	int numbers[]= {-11,22,-80,83,123};
	int largest=numbers[0];
	int smallest=numbers[0];
	for(int i=1;i<numbers.length;i++)
	{
		if(numbers[i]>largest)
		{
			largest=numbers[i];
		}
		else if(numbers[i]<smallest)
		{
			smallest=numbers[i];
			
		}
	}
	System.out.println("largest number is:"+largest);
	System.out.println("smallest number is:"+smallest);
	
}
}
