import java.util.Arrays;
//Done By Self, But Some Problems Are There In It, In Some Testcases The Answer Is Not Perfect, Prefer The 1st Solution with the same file name only the 1 will be not there after name
public class TrappingRainWater1 {
	public static void main(String [] args) {
		int arr[]=new int[] {6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
		System.out.println(trap(arr));
	}
	
	public static int trap(int[] height)
	{
		//Here The Clone Method Is Used For Copying An Array In Another Array, If We Directly make it Equal Ton The Existing Array, Than It Only Gives The Reference Of Existing One, Does Not Make New
		int sortedTemp[]=height.clone();
		Arrays.sort(sortedTemp);
		char graphArea[][]=new char[height.length][sortedTemp[sortedTemp.length-1]];
		
		for(int i=0;i<height.length;i++)
		{
			for(int j=0;j<height[i];j++)
			{
				graphArea[i][j]='h';
			}
		}
		
//		for(int k=0;k<height.length-2;k++)
//		{
//			int nextOne=k+2;
//			int upTill=0;
//			
//			if(height[k]<height[nextOne])
//			{
//				upTill=height[k];
//			}
//			else
//			{
//				upTill=height[nextOne];
//			}
//			
//			for(int j=0;j<sortedTemp[sortedTemp.length-1];j++)
//			{
//				if(graphArea[k+1][j]!='h' && j<upTill)
//				{
//					graphArea[k+1][j]='w';
//				}
//			}	
//		}
		
		for(int k=0;k<(height.length/2);k++)
		{
//			System.out.println("*");
			int a=height[k];
			int p=0;
			while((height.length-1-p)>k)
			{
//				System.out.println("#");
				if(height[height.length-1-p]>=a && k<(height.length-1-p))
				{
					int b=height[height.length-1-p];
					int min=0;
					if(a<b)
					{
						min=height[k];
					}
					else{
						min=height[height.length-1-p];
					}
					
					for(int i=k;i<(height.length-1-p);i++)
					{
						for(int j=0;j<sortedTemp[sortedTemp.length-1];j++)
						{
							if(graphArea[i][j]!='h' && graphArea[i][j]!='w' && j<min)
							{
								graphArea[i][j]='w';
							}
						}
					}
				}
				
				
				p++;
			}
		}
		
		int waterCount=0;
		for(int i=0;i<height.length;i++)
		{
			for(int j=0;j<sortedTemp[sortedTemp.length-1];j++)
			{
				if(graphArea[i][j]=='w')
				{
					waterCount++;
				}
				System.out.print(graphArea[i][j]);
			}
			System.out.println("");
		}
		
		return waterCount;
	}
}
