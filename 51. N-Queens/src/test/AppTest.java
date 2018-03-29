package ZZZZZZZZZZZZZZZZLeetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testApp()
    {
    	NQueen queen = new NQueen();
    	
    	List<List<String>> list = new ArrayList<List<String>>();
    	
    	List<String> array = new ArrayList<String>();
    	array.add(".Q..");
    	array.add("...Q");
    	array.add("Q...");
    	array.add("..Q.");
    	list.add(array);
    	
    	array = new ArrayList<String>();
    	array.add("..Q.");
    	array.add("Q...");
    	array.add("...Q");
    	array.add(".Q..");
    	list.add(array);
    	
    	assertEquals(list,queen.solveNQueens(4));
    }
}
