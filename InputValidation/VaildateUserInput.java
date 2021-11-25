import java.util.*;

public class VaildateUserInput {
	
	public static boolean IsNan(String value)
	{
		boolean isNan = false;
		try
		{
			int num = Integer.parseInt(value);
			
			if(num > 10 || num < 1)
			{
				isNan = true;
			}
		}
		catch(NumberFormatException x)
		{
			return true;
		}
		
	return isNan;
		
	}
	public static void main(String[] args)
	{
		String input = "";
		
		Scanner scanner =  new Scanner(System.in);
		
		try
		{
			do
			{
				System.out.println("Enter a number from 1 to 10: ");
				input = scanner.nextLine();
				
			}
			while(IsNan(input));
		}
		catch(Exception x)
		{
			x.getMessage();
			
		}
		
		switch(input)
		{
		case "1":
			System.out.println("Happy Thanksgiving");
			break;
		case "2":
			System.out.println("Meery Christmas");
			break;
		case "3":
			System.out.println("Happy Holidays");
			break;
		case "4":
			System.out.println("Happy Veterans Day");
			break;
		case "5":
			System.out.println("Happy New Years");
			break;
		case "6":
			System.out.println("2022 is Coming");
			break;
		case "7":
			System.out.println("Happy Birthday to me");
			break;
		case "8":
			System.out.println("Practicing my Java Skills");
			break;
		case "9":
			System.out.println("I love Programming");
			break;
		case "10":
			System.out.println("I ran out on words");
			break;
		}
		scanner.close();
	}

}
