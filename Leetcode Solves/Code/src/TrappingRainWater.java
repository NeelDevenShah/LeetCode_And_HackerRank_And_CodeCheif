
public class TrappingRainWater {
	public static void main(String [] args)
	{
		int arr[]=new int[] {4,2,3};
		System.out.println(trap(arr));
	}
	
	public static int trap(int[] height)
	{
		int result=0;
        int start=0;
        int end=height.length-1;
        while(start<end) 
        {
            if(height[start]<=height[end])
            {
                int current=height[start];
                while(height[++start]<current)
                {
                    result+=current-height[start];
                }
            } 
            else {
                int current=height[end];
                while(height[--end]<current)
                {
                    result+=current-height[end];
                }
            }
        }
        return result;
	}
}
