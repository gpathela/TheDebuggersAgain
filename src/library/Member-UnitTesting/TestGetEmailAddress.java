/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of class TestGetEmailAddress */
public class TestGetEmailAddress {
	public static void main(String[] args) {	//Start of main method
		Member m0 = new Member("Ramanpreet", "Kaur", "1111111", "rpreet72@gmail.com", 1111);
		Member m1 = new Member("Jino", "Rousseau", "2222222","jinorousseau@hotmail.com", 2222);
		System.out.println("\nTesting the getEmailAddress() method from the Member class");
		System.out.println("******************************************************");
		System.out.println("");
		
		/** Display the results */
		System.out.println("The email address of the  Member 1 is: "+ m0.getEmailAddress());	
		System.out.println("The email address of the Member 2 is: "+ m1.getEmailAddress());
		
	}	//End of main method
}	//End of class TestGetEmailAddress