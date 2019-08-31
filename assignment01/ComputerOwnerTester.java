package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth comp1b = new DateAndPlaceOfBirth(2000, 10, 27, "Queens", "New York", "USA");
		DateAndPlaceOfBirth comp2b = new DateAndPlaceOfBirth(1994, 06, 14, "San Jose", "California", "USA");
		StreetUSAddress comp1c = new StreetUSAddress("3009 Bond Drive", "Apartment 13G", "Merrick", "NY", "11566");
		StreetUSAddress comp2c = new StreetUSAddress("161 Street", "Yankees Statdium", "Bronx", "NY", "10457");
		Person comp1a = new Person("Lebron", "James", "432-34-1234", comp1b, comp1c);
		Computer comp122 = new Computer("Mac", "large", 90, 1100, true, 100.00);
		Computer comp222 = new Computer("Dell", "medium", 80, 900, true, 90.00);
		Computer comp322 = new Computer("HP", "average", 100, 1200, false, 102.50);
		Computer comp422 = new Computer("Microsoft", "small", 76, 920, false, 80.50);
		ComputerOwner ownerComp1 = new ComputerOwner(comp1a);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
			//output.println(comp1a);
			ownerComp1.addComputer(comp122);
			ownerComp1.addComputer(comp222);
			ownerComp1.addComputer(comp322);
			ownerComp1.addComputer(comp422);
			output.println(ownerComp1);
			ownerComp1.removeComputer(1);
			ownerComp1.removeComputer(2);
			output.println(ownerComp1);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
