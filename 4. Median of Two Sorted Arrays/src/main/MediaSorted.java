public class MediaSorted 
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	int[] nums = new int[len1+len2];
    	for(int i=0,j=0,k=0;i<len1&&j<len2;)
    	{
    		if(nums1[i]<nums2[j])
    		{
    			nums[k] = nums1[i];
    			k++;
    			i++;
    		}
    		else if(nums1[i]>=nums2[j])
    		{
    			//System.out.println("A");
    			nums[k] = nums2[j];
    			k++;
    			j++;
    		}
    		if(i==len1)
    		{
    			while(j<len2)
    			{
    				nums[k] = nums2[j];
    				k++;
    				j++;
    			}
    			break;
    		}
    		else if(j==len2)
    		{
    			while(i<len1)
    			{
    				nums[k] = nums1[i];
    				k++;
    				i++;
    			}
    			break;
    		}
    	}
    	
    	for(int i = 0;i<nums.length;i++)
    	{
    		System.out.println(nums[i]);
    	}
    	
    	
    	if(len1 == 0)
    	{
    		nums = nums2;
    	}
    	else if(len2 == 0)
    	{
    		nums = nums1;
    	}
    	
    	
    	if(nums.length%2==0)
    	{
    		if((nums[nums.length/2] + nums[nums.length/2 - 1]) % 2 ==0)
    		{
    			return (nums[nums.length/2] + nums[nums.length/2 - 1]) /2 ;
    		}
    		else
    		{
    			return (nums[nums.length/2] + nums[nums.length/2 - 1]) /2 +0.5;
    		}
    		
    	}
    	else
    	{
    		return nums[nums.length/2];
    	}

    }
}
