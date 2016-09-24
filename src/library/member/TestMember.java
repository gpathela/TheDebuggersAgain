/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of the class TestMember */
public class TestMember {
	/** Start of the main method */
	public static void main(String[] args) {
		/** Create five member objects */
		Member m0 = new Member("Ramanpreet", "Kaur", "1111111", "rpreet72@gmail.com", 1111);
		Member m1 = new Member("Jino", "Rousseau", "2222222","jinorousseau@hotmail.com", 2222);
		Member m2 = new Member("Chiranjivi ", "Bashyal", "3333333", "chiranjivibashyal7@gmail.com",3333);
		Member m3 = new Member("Gourav", "Pathela", "4444444", "gpathela@yahoo.com",444);
		
		/** Testing the getFirstName() method from the class Member */
		
		System.out.println("\nTesting the getFirstName() method from the Member class.");
		System.out.println("******************************************************");
		System.out.println("");
		String firstName0 = m0.getFirstName(); 
		String firstName1 = m1.getFirstName(); 
		String firstName2 = m2.getFirstName(); 
		String firstName3 = m3.getFirstName(); 
		
		/** Display the results */
		System.out.println("The firstName of the created Member are:");
		System.out.println(firstName0 + ", " + firstName1 + ", " + firstName2 + ", " + firstName3 + ".");
		System.out.println("=======================================================================");
		System.out.println("");
		
		/** Testing the getLastName() method from the class Member */
		
		System.out.println("\nTesting the getLastName() method from the Member class.");
		System.out.println("******************************************************");
		System.out.println("");
		String lastName0 = m0.getLastName(); 
		String lastName1 = m1.getLastName(); 
		String lastName2 = m2.getLastName(); 
		String lastName3 = m3.getLastName(); 
		
		/** Display the results */
		System.out.println("The lastName of the created Member are:");
		System.out.println(lastName0 + ", " + lastName1 + ", " + lastName2 + ", " + lastName3 + ".");
		System.out.println("=======================================================================");
		System.out.println("");
		
		/** Testing the getContactPhone() method from the class Member */

		System.out.println("\nTesting the getContactPhone() method from the Member class.");
		System.out.println("******************************************************");
		System.out.println("");
		String contactPhone0 = m0.getContactPhone(); 
		String contactPhone1 = m1.getContactPhone(); 
		String contactPhone2 = m2.getContactPhone(); 
		String contactPhone3 = m3.getContactPhone(); 
		
		/** Display the results */
		System.out.println("The Contact numbers of the created Member are:");
		System.out.println(contactPhone0 + ", " + contactPhone1 + ", " + contactPhone2 + ", " + contactPhone3 + ".");
		System.out.println("=======================================================================");
		System.out.println("");
		
		/** Testing the getEmailAddress() method from the class Member */
		
		System.out.println("\nTesting the getEmailAddress() method from the Member class.");
		System.out.println("******************************************************");
		System.out.println("");
		String emailAddress0 = m0.getEmailAddress(); 
		String emailAddress1 = m1.getEmailAddress(); 
		String emailAddress2 = m2.getEmailAddress(); 
		String emailAddress3 = m3.getEmailAddress(); 
		
		/** Display the results */
		System.out.println("The emailAddress of the created Member are:");
		System.out.println(emailAddress0 + ", " + emailAddress1 + ", " + emailAddress2 + ", " + emailAddress3 + ".");
		System.out.println("=======================================================================");
		System.out.println("");
		
		/** Testing the getID() method from the class Member */
		
		System.out.println("\nTesting the getID() method from the Member class.");
		System.out.println("******************************************************");
		System.out.println("");
		int id0 = m0.getID(); 
		int id1 = m1.getID(); 
		int id2 = m2.getID(); 
		int id3 = m3.getID(); 
		
		/** Display the results */
		System.out.println("The id of the created Member are:");
		System.out.println(id0 + ", " + id1 + ", " + id2 + ", " + id3 + ".");
		System.out.println("=======================================================================");
		System.out.println("");
		
		/** Testing the toString() method from the class Member */
		
		System.out.println("\nTesting the toString() method from the Member class.");
		System.out.println("******************************************************");
		/** Display the results */
		System.out.println("The description of the created Member are:");
		System.out.println(m0.toString() + "\n"); 
		System.out.println(m1.toString() + "\n");
		System.out.println(m2.toString() + "\n");
		System.out.println(m3.toString() + "\n");
		System.out.println("=======================================================================");
		System.out.println("");
	} // End of the main method 
} // End of the class TestMember