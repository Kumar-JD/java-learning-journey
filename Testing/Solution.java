class Solution {
    public static void main(String args[]){
	
        int candies[]={2,3,5,7,9};
		int  max = candies[0];
		for (int i =0 ;i<=candies.length;i++){
			if(candies[i]>max){
				max=candies[i];
				
			}
		}
		
		System.out.println("Max"+max);
            }

}