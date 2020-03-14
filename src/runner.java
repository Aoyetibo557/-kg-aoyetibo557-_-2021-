import java.util.Arrays;
import java.util.HashMap;

public class runner {

	static int size = 500;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aac";
		String b="bbs";
		
		System.out.println(one_to_one(a,b));

	}
	
	public static boolean one_to_one(String s1,String s2) {
		
		int s1Length=s1.length();
		int s2Length=s2.length();
		
		if(s1Length != s2Length)
			return false;
					
		Boolean[] isMarked = new Boolean[size];
		Arrays.fill(isMarked, Boolean.FALSE);	//default false
		
		//need a map
		int[] map =new int[size];
		Arrays.fill(map, -1);
		
		for(int i=0;i<s1Length;i++) {
			if(map[s1.charAt(i)] == -1) {
				if(isMarked[s2.charAt(i)] == true)
					return false;
				
					//mark as seen/parsed
					isMarked[s2.charAt(i)] =true;
					
					map[s1.charAt(i)] =s2.charAt(i);	//to store the mapping of the current value 
				}
				else if(map[s1.charAt(i)] != s2.charAt(i)) {
					return false;
				}
		}
		return true;
	}
}
