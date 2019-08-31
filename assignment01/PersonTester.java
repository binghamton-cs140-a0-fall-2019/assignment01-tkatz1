package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester{
    public static void main(String[] args){
    DateAndPlaceOfBirth patty = new DateAndPlaceOfBirth(2010, 04, 23, "Brooklyn", "New York", "USA");
    StreetUSAddress mahomes = new StreetUSAddress("1395 Beach Street", "Locker 219", "Atlantic Beach", "NY", "28512");
    Person person1 = new Person("Patrick", "Mahomes", "123-02-3123", patty, mahomes);
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");
            output.println(person1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

}
}
