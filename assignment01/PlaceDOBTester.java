package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
	DateAndPlaceOfBirth datePOB1 = new DateAndPlaceOfBirth(2000, 10, 27, "New York City", "New York", "USA");
	DateAndPlaceOfBirth datePOB2 = new DateAndPlaceOfBirth(2000, 10, 27, "Chicago", "Illinois", "USA");
	DateAndPlaceOfBirth datePOB3 = new DateAndPlaceOfBirth(2010, 10, 27, "Los Angeles", "California", "USA");
	DateAndPlaceOfBirth datePOB4 = new DateAndPlaceOfBirth(1900, 1, 2, "Paris", "France");
	DateAndPlaceOfBirth datePOB5 = new DateAndPlaceOfBirth(1965, 12, 19, "London", "England");
	output.println(datePOB1);
	output.println(datePOB2);
	output.println(datePOB3);
	output.println(datePOB4);
	output.println(datePOB5);
	output.println(datePOB1.hasSameBirthDateAs(datePOB2));// True
	output.println(datePOB1.hasSameBirthDateAs(datePOB3));//False
	output.println(datePOB1.hasSameBirthDateAs(datePOB4));//False
	output.println(datePOB1.hasSameBirthDateAs(datePOB5));//False
	output.println(datePOB2.hasSameBirthDateAs(datePOB3));// False
	output.println(datePOB2.hasSameBirthDateAs(datePOB4));//False
	output.println(datePOB2.hasSameBirthDateAs(datePOB5));//False
	output.println(datePOB3.hasSameBirthDateAs(datePOB4));//False
	output.println(datePOB3.hasSameBirthDateAs(datePOB5));//False
	output.println(datePOB4.hasSameBirthDateAs(datePOB5));//False
	output.println(datePOB1.youngerThan(datePOB2)); //False
	output.println(datePOB1.youngerThan(datePOB3)); //False
	output.println(datePOB1.youngerThan(datePOB4)); //True
	output.println(datePOB1.youngerThan(datePOB5)); //True
	output.println(datePOB2.youngerThan(datePOB3)); //False
	output.println(datePOB2.youngerThan(datePOB4)); //True
	output.println(datePOB2.youngerThan(datePOB5)); //True
	output.println(datePOB3.youngerThan(datePOB4)); //True
	output.println(datePOB3.youngerThan(datePOB5)); //True
	output.println(datePOB4.youngerThan(datePOB5)); //False
	output.println(datePOB1.olderThan(datePOB2)); //False
	output.println(datePOB1.olderThan(datePOB3)); //True
	output.println(datePOB1.olderThan(datePOB4)); //Flase
	output.println(datePOB1.olderThan(datePOB5)); //True
	output.println(datePOB1.olderThan(datePOB2)); //True
	output.println(datePOB1.olderThan(datePOB3)); //True
	output.println(datePOB1.olderThan(datePOB4)); //False
	output.println(datePOB1.olderThan(datePOB5)); //False
	output.println(datePOB2.olderThan(datePOB3)); //True
	output.println(datePOB2.olderThan(datePOB4)); //False
	output.println(datePOB2.olderThan(datePOB5)); //False
	output.println(datePOB3.olderThan(datePOB4)); //False
	output.println(datePOB3.olderThan(datePOB5)); //False
	output.println(datePOB1.olderThan(datePOB2)); //True
	output.println(datePOB1.olderThan(datePOB3)); //True
	output.println(datePOB1.olderThan(datePOB4)); //False
	output.println(datePOB1.olderThan(datePOB5)); //True
	output.println(datePOB1.hasSameBirthDayAs(datePOB2)); //True
	output.println(datePOB1.hasSameBirthDayAs(datePOB3)); //True
	output.println(datePOB3.hasSameBirthDayAs(datePOB2)); //True
	output.println(datePOB1.hasSameBirthDayAs(datePOB4)); //False
	output.println(datePOB1.hasSameBirthDayAs(datePOB5)); //False
//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
