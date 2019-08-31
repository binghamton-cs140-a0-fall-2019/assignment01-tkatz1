package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester{
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	Computer comp12 = new Computer("Mac", "large", 90, 1100, true, 100.00);
	Computer comp22 = new Computer("Dell", "medium", 80, 900, true, 90.00);
	Computer comp32 = new Computer("HP", "average", 100, 1200, false, 102.50);
	Computer comp42 = new Computer("Microsoft", "small", 76, 920, false, 80.50);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			  output.println(comp12);
  	        output.println(comp22);
  	       output.println(comp32);
  	       output.println(comp42);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
