import java.util.Scanner;
public class analysis {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int passes=0;
		int failure =0;
		int studentcounter = 1;
		
		while (studentcounter <= 10)
		{
			System.out.printf("enter result (1 passes) (2 fails): ");
			int result = input.nextInt();
			if (result == 1)
			{
				passes = passes +1;
			    studentcounter = studentcounter +1;
			}

			else if (result == 2)
			{
				failure = failure +1;
			    studentcounter = studentcounter +1;

			}
			else
			{
				failure = failure + 0;
				passes = passes +0;
			    studentcounter = studentcounter +0;
			}
			

		}
		System.out.printf("passed %d%n failed: %d%n", passes,failure);
		if (passes> 8)
			System.out.println("bonus!");
	}
}
