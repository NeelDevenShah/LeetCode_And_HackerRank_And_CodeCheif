public class FrogJump {
	public static void main(String [] args)
	{
		int arr[]=new int[] {1,2,4,7,9};
		System.out.println(canCross(arr));
	}
	
	public static boolean canCross(int[] stones) {
		int diff=stones[1]-stones[0];
		for(int i=2;i<stones.length;i++) {
			int tempDiff=stones[i]-stones[i-1];
			if(tempDiff==diff) {
				continue;
			}
			else if(tempDiff==diff-1) {
				diff-=1;
			}
			else if(tempDiff==diff+1) {
				diff+=1;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
}
