/*
Geometry Calculator

Write the program that displays the following menu: 

Geometry Calculator: 
1. Calculate the Area of a Circle 
2. Calculate the Area of a Rectangle 
3. Calculate the Area of a Triangle 
4. Quit 

Enter your choice (1 – 4): 

If the user enters 1, the program should ask for the radius of the circle and then display its area. Use the following formula: 
area = πr2 
Use Java constant Math.PI in your calculations. 

If user enters 2, the program should ask for the length and width of the rectangle and then display the rectangle’s area. Use the following formula: 
area = length * width 

If the user enters 3 the program should ask for the length of the triangle’s base and its height, and then display its area. Use the following formula: 
area = base * height * 0.5
If the user enters 4, the program should end. 
Use Java formatting to leave no more than 2 digits after decimal point when displaying the results of calculations. 

Input Validation: 

1. Display an error message if the user enters number outside the range of 1 through 4 when selecting an item from the menu. 
2. Do not accept negative values for the circle’s radius, the rectangle’s length or width, or triangle’s base or height. You can use either if/else statement or an input validation loop for that purpose. 

Name your solution project Geometry.java
-----------------------------------------------------------------------------------------------------------------------------------------
*/

package geometry;

import java.util.Scanner;
/**
 * @author Mark Ullberg
 */
public class Geometry {

    public static void main(String[] args) {
    
        System.out.print("Geometry Calculator:\n\n"
                + "\t1. Calculate the Area of a Circle\n"
                + "\t2. Calculate the Area of a Rectangle\n"
                + "\t3. Calculate the Area of a Triangle\n"
                + "\t4. Quit\n"
                + "\nEnter your choice (1 - 4):  "); // produce the menu offering four options
        
        Scanner keyboard = new Scanner(System.in);  // create scanner object to read input
        
        int choice = keyboard.nextInt();  // request input from user to store in choice integer variable
        
        if(choice<=4&&choice>=1)  // determine if choice is valid to execute one of the four cases in the switch
        {
            switch(choice)   // do the switch
            {
                case 1:
                    double pi = Math.PI;  // declare the variable pi which equals Math.
                    
                    System.out.println("Calculating the Area of a Circle\n");  // output subject title
                    System.out.print("Enter the Radius of the Circle: ");  // prompt the user to input the Radius value
                    double radius = keyboard.nextDouble();  // store radius input value as double
                    
                    if (radius > 0) {  // check if input greater than zero
                    double area = pi * radius * radius; // calculate area and store value as a double
                    System.out.printf("%s %.2f", "The Area of your Circle is: ", area);  // output the results to the user
                    System.out.println();
                        } else
                    System.out.println("Radius input is either zero or a negative number"); // if radius is negative - output error message
                    break;  // process execution complete
                
                case 2:
                    System.out.println("Calculating the Area of a Rectangle\n");  // output subject title
                    System.out.print("Enter the Length of the Rectangle: ");  // prompt the user to input the Length value
                    double length = keyboard.nextDouble();  // store length value as a double
                    
                    System.out.print("Enter the Width of the Rectangle: ");  // prompt the user to input the Width value
                    double width = keyboard.nextDouble();  // store the width value as a double
                    
                    if (length > 0 && width > 0) {  //check if it is not negative
                    double rectangleArea = length * width;  // calculate and store rectangleArea as a double value
                    System.out.printf("%s %.2f", "The Area of your Rectangle is: ", rectangleArea);  // output area to user with two decimal places
                    System.out.println();
                        } else
                    System.out.println("The Length or Width input is either zero or a negative value"); // if negative - output error message
                    System.out.println();
                    break;  // process execution complete
                    
                case 3:
                    System.out.println("Calculating the Area of a Triangle");  // output subject title
                    System.out.print("Enter the Length of the Base of the Triangle: "); // prompt the user to input the Length value
                    double base = keyboard.nextDouble();  // store length value as a double
                    
                    System.out.print("Enter the Height of the Triangle: ");  // prompt the user to input the Height value
                    double height = keyboard.nextDouble();  // store height value as a double
                    
                    if (base > 0 && height > 0) {  //check if it is not negative
                    double triangleArea = base * height * 0.5;  // calculate and store the triangleArea as a double value
                    System.out.printf("%s %.2f", "The Area of your Triangle is: ", triangleArea);  // output area to user with two decimal places
                    System.out.println();
                    } else
                    System.out.println("The base Length or Height input is either zero or a negative value"); // if negative - output error message
                    System.out.println();
                    break;  // process execution complete
                    
                case 4:
                    //does nothing!!
                    System.out.println("Quitting");
            }
        }
    else
        {
        System.out.println("No such choice in the menu!");
        System.out.println();
        }
    }    
}
