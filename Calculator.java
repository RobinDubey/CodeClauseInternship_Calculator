import java.util.*;

public class Calculator
{
  public static void main (String [] args)
  {
	double number1, number2, total;
	String choice;
	do

	  {
		  Scanner sc = new Scanner (System.in);
		  System.out.println ("\n*****Calculator Menu*****\n");
		  System.out.println ("Press + for Addition:");
		  System.out.println ("Press - for Subtraction:");
		  System.out.println ("Press * for Multiplication:");
		  System.out.println ("Press / for Divivsion:");
		  System.out.println ("Press 1 for Exit");
		  System.out.print ("Enter your choice:");

		  choice = sc.nextLine ();

		switch (choice)
		  {

		  case "+":
			{
			  try
			  {
				System.out.println ("Enter the first Number:");
				number1 = sc.nextDouble ();
				System.out.println ("Enter the first Number:");
				number2 = sc.nextDouble ();

				total = number1 + number2;
				System.out.println ("The sum of" + number1 + "and " +
									number2 + " =" + total);
				break;
			  }

			  catch (Exception e)
			  {
				System.out.println ("Wrog Input....Try again....");
				break;
			  }
			}

		  case "-":
			{
			  try
			  {
				System.out.println ("Enter the first Number:");
				number1 = sc.nextDouble ();
				System.out.println ("Enter the first Number:");
				number2 = sc.nextDouble ();

				total = number1 - number2;
				System.out.println ("The subtraction of" + number1 + "and " +
									number2 + " =" + total);
				break;
			  }
			  catch (Exception e)
			  {
				System.out.println ("Wrog Input....Try again....");
				break;
			  }
			}

		  case "*":
			{
			  try
			  {
				System.out.println ("Enter the first Number:");
				number1 = sc.nextDouble ();
				System.out.println ("Enter the first Number:");
				number2 = sc.nextDouble ();

				total = number1 * number2;
				System.out.println ("The multiplication of" + number1 +
									"and " + number2 + " =" + total);
				break;
			  }
			  catch (Exception e)
			  {
				System.out.println ("Wrog Input....Try again....");
				break;
			  }
			}

		  case "/":
			{
			  try
			  {
				System.out.println ("Enter the first Number:");
				number1 = sc.nextDouble ();
				System.out.println ("Enter the first Number:");
				number2 = sc.nextDouble ();

				total = number1 / number2;
				System.out.println ("The division of" + number1 + "and " +
									number2 + " =" + total);
				break;
			  }
			  catch (Exception e)
			  {
				System.out.println ("Wrog Input....Try again....");
				break;
			  }
			}

		  case "1":
			{
			  System.exit (0);
			}

		  default:
			{
			  System.out.println ("Wrog Input....Try again....");
			}
		  }
	  }while (true);
  }
}
