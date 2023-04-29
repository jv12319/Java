//https://www.dropbox.com/s/alf2lvlrtumi9h1/Calculator.mp4?dl=0 link to project video
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String mathOperator = "";
		boolean startOverYN = true; //checks if user wants to continue the program
		boolean isMathOperatorValid = false;// check to see if operator is valid
		double answer = 0.0;//holds answer based on calculations
		String userChoice = "";//start over string
		double userNum = 0.0;
		
		int i;
		
		do {
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		String mode = input.next();//user input
		
		
		//modes for calculator
		if(mode.equals("Standard")) {
			//prompt user for operation to use and math operator
			System.out.println("The calculator will operate in standard mode.");
			
			//have a loop to check to see if operator is correct for calculations
			do {
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			mathOperator = input.next();
			
			// how to handle operator
			if (mathOperator.equals("+")) {
				System.out.println("How many numbers do you want to add?");
				int numbers = input.nextInt();
				System.out.println("Enter " + numbers + " numbers");
				answer = 0.0;
				for(i = 0; i < numbers; ++i) {
			    userNum = input.nextDouble();
				answer = userNum + answer;
				}//end for

				// do addition
				isMathOperatorValid = true;
			} // end if
			else {
				if (mathOperator.equals("-")) {
					System.out.println("How many numbers do you want to subtract?");
					int numbers = input.nextInt();
					System.out.println("Enter " + numbers + " numbers");
					userNum = input.nextDouble();
					answer = userNum;
					for(i = 1; i < numbers; ++i) {	
						userNum = userNum - input.nextDouble();
						answer = userNum;
						
					}//end for

					// do division
					isMathOperatorValid = true;

				} // end if
				else {
					if (mathOperator.equals("*")) {
						System.out.println("How many numbers do you want to multiply?");
						int numbers = input.nextInt();
						System.out.println("Enter " + numbers + " numbers");
						answer = 1;
						for(i = 0; i < numbers; ++i) {
							userNum = input.nextDouble();
							answer = userNum * answer;
						}//end for

						// do multi
						isMathOperatorValid = true;

					} // end if
					else {
						if (mathOperator.equals("/")) {
							System.out.println("How many numbers do you want to divide?");
							int numbers = input.nextInt();
							System.out.println("Enter " + numbers + " numbers");
							userNum = input.nextDouble();
							answer = userNum;
							for(i = 0; i < numbers-1; ++i) {
								userNum = userNum / input.nextDouble();
								answer = userNum;
								
								
							}//end for

							// do subtraction
							isMathOperatorValid = true;

						} // end if
						else {

							// invalid operator
							System.out.println("Invalid operator " + mathOperator);
							isMathOperatorValid = false;

						} // end else

					} // end else

				} // end else
			} // end else
			}while(!isMathOperatorValid);//while
			

		}
		
		else {
			if(mode.equals("Scientific")) {
				//prompt user for operation to use and math operator
				System.out.println("The calculator will operate in scientific mode.");
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
				mathOperator = input.next();
				
				// how to handle operator
				if (mathOperator.equals("+")) {
					System.out.println("How many numbers do you want to add?");
					int numbers = input.nextInt();
					System.out.println("Enter " + numbers + " numbers");
					answer = 0.0;
					for(i = 0; i < numbers; ++i) {
				    userNum = input.nextDouble();
					answer = userNum + answer;
					}

					// do addition
					isMathOperatorValid = true;

				} // end if
				else {
					if (mathOperator.equals("/")) {
						System.out.println("How many numbers do you want to divide?");
						int numbers = input.nextInt();
						System.out.println("Enter " + numbers + " numbers");
						userNum = input.nextDouble();
						answer = userNum;
						for(i = 0; i < numbers-1; ++i) {
							userNum = userNum / input.nextDouble();
							answer = userNum;
							
							
							
						}//end for

						// do division
						isMathOperatorValid = true;

					} // end if
					else {
						if (mathOperator.equals("*")) {//multiplication
							System.out.println("How many numbers do you want to multiply?");
							int numbers = input.nextInt();
							System.out.println("Enter " + numbers + " numbers");
							answer = 1;
							for(i = 0; i < numbers; ++i) {
								userNum = input.nextDouble();
								answer = userNum * answer;
							}//end for

							// do multi
							isMathOperatorValid = true;

						} // end if
						else {
							if (mathOperator.equals("-")) {//subtraction
								System.out.println("How many numbers do you want to subtract?");
								int numbers = input.nextInt();
								System.out.println("Enter " + numbers + " numbers");
								userNum = input.nextDouble();
								answer = userNum;
								for(i = 1; i < numbers; ++i) {	
									userNum = userNum - input.nextDouble();
									answer = userNum;
									
								}//end for

								// do subtraction
								isMathOperatorValid = true;

							} // end if
							else {
								if (mathOperator.equals("sin")){//sine
								System.out.println("Enter a number in radians to find the sine");
								userNum = input.nextDouble();
								answer = (Math.sin(userNum));
								
								isMathOperatorValid = true;
								}//end if
								else {
									if(mathOperator.equals("cos")){//cosine
										System.out.println("Enter a number in radians to find the cosine");
										userNum = input.nextDouble();
										answer = (Math.cos(userNum));
										isMathOperatorValid = true;
										}//end if
									else {
										if(mathOperator.equals("tan")){//tangent
											System.out.println("Enter a number in radians to find the tangent");
											userNum = input.nextDouble();
											answer = (Math.tan(userNum));
											isMathOperatorValid = true;
											}//end if
							else{

								// invalid operator
								System.out.println("Invalid operator " + mathOperator);
								isMathOperatorValid = false;

							} // end else
									}//end else
									

						} // end else

					} // end else
						}//end else
				} // end else
				
				}//end else
				
			}//end if
		}//end else
		
		System.out.println("Result: " + answer);
		System.out.println("Do you want to start over? (Y/N)");
		userChoice = input.next();
		
		if(userChoice.equals("Y"))
		{
			startOverYN = true;
		}
			if(userChoice.equals("N"))
			{
				startOverYN = false;
				System.out.println("Goodbye");
			}	
		
		}while(startOverYN);
		
		
		
		input.close();
}
}

