
public class JumpGame 
{
    public static boolean canJump(int[] nums) throws InterruptedException 
    {
        int index = 0;
        int length = nums.length - 1;

        // for just one element
        if(length == 0)
        {
        	return true;
        }
        
        while(index<length)
        {
        	if(nums[index]>=length)
        	{
        		return true;
        	}
        	//element is 0
        	if(nums[index]==0)
        	{
        		//element is 0, fall back to find
        		int changedindex = index;
        		
        		for(;changedindex>=0;changedindex--)
        		{
        			if(changedindex>0&&nums[changedindex]>0)
        			{
        				//for the element that it can over the left point in 0 position
        				if(nums[changedindex]+changedindex>index)
        				{
        					changedindex += nums[changedindex];
        					index = changedindex;
        					System.out.println("\t"+index);
        					Thread.sleep(1000);
        					break;
        				}
        			}
        		}
        		
        		if(index>=length)
        		{
        			return true;
        		}
        		
        		int loopindex = index-1;
        		
        		//for reverse loop , like 4,3,2,1,0
        		System.out.println("ready");
        		for(;loopindex>=0;loopindex--)
        		{
        			System.out.println("loopindex:"+loopindex);
        			//for reverse loop for index >0
        			if(loopindex>0&&nums[loopindex-1]==nums[loopindex]+1)
        			{
        				//System.out.println("loopindex:"+loopindex);
            			if(nums[loopindex]+loopindex==index&&loopindex==0)
            			{
            				return false;
            			}
        			}
        			//for reverse loop for index == 0
        			else if(loopindex==0&&nums[loopindex+1]==nums[loopindex]-1)
        			{
        				//System.out.println("loopindex:"+loopindex);
            			if(nums[loopindex]+loopindex==index&&loopindex==0)
            			{
            				return false;
            			}
        			}
        		}
        		
        	}
        	index += nums[index];
        	System.out.println(index);
        	Thread.sleep(1000);
        	
    		if(index>=length)
    		{
    			return true;
    		}
    		
        	if(nums[index]==0)
        	{
        		for(int i = 0 ;i <= index;i++)
            	{
            		if(i==index)
            		{
            			return false;
            		}
            		if(nums[i]+i>index)
            		{
            			break;
            		}
            	}	
        	}
        }
        if(index>=length)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}
