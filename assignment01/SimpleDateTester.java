package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class SimpleDateTester{
    public static void main(String[] args){
        SimpleDate simpdate = SimpleDate.of(2012, 2, 2);
        SimpleDate simpdate2 = SimpleDate.of(2012, 2, 3);
    try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR SimpleDateTester.java:");
            output.println(simpdate.before(simpdate2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
}
}
