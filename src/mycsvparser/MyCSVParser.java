/*
 * 
 */
package mycsvparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
/**
 *
 * @author derwin
 */
public class MyCSVParser {
    private static String filename;
    /**
     * @param args the command line arguments
     */
    
    public MyCSVParser() {
    this.filename = "";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyCSVParser myparser = new MyCSVParser();
        CSVParser parser = myparser.openFile("data.csv");
        ArrayList<Person> people = myparser.readCsvLines(parser);
        for(Person guy : people) {
            System.out.println(guy.toString());
        }
    }
    
    public static CSVParser openFile(String fn) {
        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        FileReader fr;
        CSVParser parser;
        
        try {
            fr = new FileReader(fn);
            MyCSVParser.filename = fn;
        } catch (FileNotFoundException e) {
            MyCSVParser.filename = null;
            return null;
        }
        
        try {
        parser = new CSVParser(fr, format);
        } catch (IOException e) {
            return null;
        }
        return parser;
    }
    
    public static String getFilename() {
    return filename;
    }
    
    public static ArrayList<Person> readCsvLines(CSVParser parser) {
        ArrayList<Person> output = new ArrayList<>();
        
        for(CSVRecord record : parser) {
            output.add(new Person(record.get("name"), record.get("email")));
        }
        
        return output;
    }
    
}
