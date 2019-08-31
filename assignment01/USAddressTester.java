package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
    public static void main(String[] args){
        StreetUSAddress USAddress1 = new StreetUSAddress("3009 Bond Drive","", "Queens", "New York", "11566");
        StreetUSAddress USAddress2 = new StreetUSAddress("3009 Bond Drive", "2014 Forest Hills Drive", "Merrick", "New York", "11566");
        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
            output.println(USAddress1);
            output.println(USAddress2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }

// and replace every System.out.print or System.out.println
// by output.print or output.println
}
