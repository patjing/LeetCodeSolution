package ZZZZZZZZZZZZZZZZLeetcode;

import java.util.ArrayList;
import java.util.List;

public class NQueen 
{
    public List<List<String>> solveNQueens(int n) 
    {
    	List<List<String>> result = new ArrayList<List<String>>();
    	
    	if(n == 1)
    	{
    		ArrayList<String> list = new ArrayList<String>();
    		list.add("Q");
    		result.add(list);
    		return result;
    	}
    	
    	if(n < 4)
    	{
    		return result;
    	}
    	
        int[] array = new int[n];
        
        putLocation(result,array,0);
        return result;
    }
    
    public boolean isMatch(int[] list,int column)
    {
    	for(int i=0;i<column;i++)
    	{
    		//the row number is same
    		if(list[i] == list[column])
    		{
    			return false;
    		}
    		//on the same oblique line
    		if(Math.abs(list[column] - list[i]) == Math.abs(column - i))
    		{
    			return false;
    		}
    	}
    	return true;
    }
    
    public List<String> putLocation(List<List<String>> lists,int[] array,int columns)
    {
    	//for the columns that over the N-Queen's N 
    	//the result handling
    	if(array.length == columns)
    	{
    		List<String> list = new ArrayList<String>();
    		list = formatResult(array);
    		lists.add(list);
    		return list;
    	}
    	//put the Queen on each row
    	for(int i = 0;i<array.length;i++)
    	{
    		array[columns] = i;
        	//if the Current Queen is not conflict with previous one
	    	if(isMatch(array,columns))
	    	{
	    		putLocation(lists, array,columns + 1);
	    		if(columns+1==array.length)
	    		{
	    			break;
	    		}
	    	}
    	}
    	return null;
    }
    
    public List<String> formatResult(int[] array)
    {
    	List<String> list = new ArrayList<String>();
    	//for each row
    	for(int row = 0;row < array.length; row++)
    	{
    		String string = "";
    		for(int column = 0; column < array.length; column++)
    		{
    			if(array[row] == column)
    			{
    				string += "Q";
    			}
    			else
    			{
    				string += ".";
    			}
    		}
    		System.out.println(string);
    		list.add(string);
    	}
    	System.out.println();
    	return list;
    }
}
