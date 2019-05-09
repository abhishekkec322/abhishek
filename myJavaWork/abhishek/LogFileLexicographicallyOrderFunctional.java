package abhishek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogFileLexicographicallyOrderFunctional{

public static void main(String[] args) {
	
    String[] logfileArr = {
            "a1 9 2 3 1",
            "g1 Act car",
            "zo4 4 7",
            "ab1 off KEY dog",
            "a8 act zoo"
    };
    
//    String[] logfileArr = {"a1 9 2 3 1","g2 Act car","zo4 4 7","ab1 off KEY dog","g1 act cas"};
    
    
    List <String > ls= reorderLines(5, Arrays.asList(logfileArr));
    
    System.out.println("I am done : "+ls);
}

public static List<String> reorderLines(int logFileSize, List<String> logfile) {
    List<String> numberLogLines = new ArrayList<>();
    List<String> textLogLines = new ArrayList<>();
    logfile.forEach(logLine -> {
    	//Split each line in words seperated by space
        String[] logWords = logLine.split(" ");
        //if any of the word is a valid number (Independent legal numeric value) 
        if (logWords[1].matches("\\d+")) {
            numberLogLines.add(logLine);
        } else {
            textLogLines.add(logLine);
        }
    });
    
    //Sort line with text in lexicographical order
    textLogLines.sort((a,b) -> {
        String a1 = a.substring(a.indexOf(" "));
        String b1 = b.substring(b.indexOf(" "));
        if (a1.compareToIgnoreCase(b1) == 0) {
            return a.substring(0,a.indexOf(" ")).compareToIgnoreCase(b.substring(0,b.indexOf(" ")));
        } else {
            return a1.compareToIgnoreCase(b1);
        }
    });
    List<String> sortedLogfile = new ArrayList<>();
    sortedLogfile.addAll(textLogLines);
    sortedLogfile.addAll(numberLogLines);
    return sortedLogfile;
}

}
