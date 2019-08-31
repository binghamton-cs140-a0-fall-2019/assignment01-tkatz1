package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class SimpleDate {

    int year;
    int month;
    int day;
    public static SimpleDate of(int yr, int m, int d){
        var returnValue = new SimpleDate();
        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;
        return returnValue;
        }

    public boolean before(SimpleDate other){
        boolean bool = false;
        if(this.year < other.year){
            bool = true;
        }
        else if(this.year == other.year){
            if(this.month < other.month){
                bool = true;
            }
            else if(this.month == other.month){
                if(this.day < other.day){
                    bool = true;
                }
            }
        }
        return bool;
    }

}
