import java.util.*;
class Day3{
	public static void main(String args[]){
		int nums[] ={0,1,0,3,12};
	
		int a =0;
		//store the values 
		ArrayList<Integer> list = new ArrayList<>();
		//Find the array lenght
		int l = nums.length;
		//add numbers frist
		for (int i=0;i<l;i++){
			if(nums[i]>a){
				list.add(nums[i]);
			}		
	}
	
	int l2 = l-list.size();
	//add zero on ending
	for(int i=0 ; i< l2;i++){
			list.add(0);
		}
		System.out.println(list);
	}
}