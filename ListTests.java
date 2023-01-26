import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

class CheckerString implements StringChecker {

    public boolean checkString (String string){
        return string.length()>3;
    }
}

public class ListTests {
    @Test 
	public void testFilter() {
        StringChecker var = new CheckerString();
        List<String> input = new ArrayList<String>(Arrays.asList("Geeks", "for", "Geeks", "Eeker"));
        ListExamples.filter(input, var);
        assertEquals(new ArrayList<String>(Arrays.asList("Geeks", "Geeks", "Eeker")), 
        ListExamples.filter(input, var));
	}
}
