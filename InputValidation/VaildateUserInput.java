import java.util.*;

public class VaildateUserInput {
	
	public boolean IsNan(value)
	{
		
		return true;
	}
	public static void main(String[] args)
	{
		int input = 0;
		
		Scanner scanner =  new Scanner(System.in);
		try
		{
			do
			{
				System.out.println("Enter a number from 1 to 10: ");
				input = scanner.nextInt();
				
			}
			while(input > 10 || input < 1);
		}
		catch(Exception x)
		{
			x.getMessage();
			throw new Exception("The value " + input + "is not a number");
		}
		
		switch(input)
		{
		case 1:
			System.out.println("Happy Thanksgiving");
			break;
		case 2:
			System.out.println("Meery Christmas");
			break;
		case 3:
			System.out.println("Happy Holidays");
			break;
		case 4:
			System.out.println("Happy Veterans Day");
			break;
		case 5:
			System.out.println("Happy New Years");
			break;
		case 6:
			System.out.println("2022 is Coming");
			break;
		case 7:
			System.out.println("Happy Birthday to me");
			break;
		case 8:
			System.out.println("Practicing my Java Skills");
			break;
		case 9:
			System.out.println("I love Programming");
			break;
		case 10:
			System.out.println("I ran out on words");
			break;
		}
		scanner.close();
	}

}
