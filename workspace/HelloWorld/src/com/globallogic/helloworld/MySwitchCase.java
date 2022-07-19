package com.globallogic.helloworld;


//if --it evaluate the true and false
      //it has only true block

//if -else --it also evalaute the true and false
          //it has the true and flase block

//if else ladder --it has multiple true block
                 
//nested if else --when we have the if inside if then it is called the nested

//switch //it work on the case
            //when case is matched than means that block will execute
            //you will see break if there is no break it will execute until it got the break
           //if no case is match it will execute the default block

//Write a program to vote system if age is > 18 allow to cast a vote
//write a program to give the color code and print the color name  //switch and if else ladders
//Write a program to give the month num and print the month name   //switch and if elase ladders


public class MySwitchCase {

	public static void main(String[] args) {

		// Switch is also decision making tools which help to match the case
		// if() //true or false
		int a = 1; //(T)
		char ch='A'; //(T)
		String str="A";//(T)
		//
		switch (str) // case matching
					// switch will take the expression and it will execute the matching case
		// block of switch case
		{
		case "A": // case expression
			System.out.println("Sun ");
   //			break; // break it is the end point of case

			//if there is not break in any of case 
			//then it will execute the next case until if got the break
			/*
			 * case "2": System.out.println("Mon"); break; case "3":
			 * System.out.println("Tue"); break; case "4": System.out.println("Wed"); break;
			 * case "5": System.out.println("Thu"); break; case "6":
			 * System.out.println("Fri"); break; case 7: System.out.println("Sat"); break;
			 */
		default:
			System.out.println("Somthing is wrong");
            break;
		}
	}
}