class TwoArr{
	public static void main(String args[]){
		byte n , m ;
		
		int a[][]={{1,2,3,4,5,6,7},{11,12,13,14,15,16,17},{21,22,23,24,25,26,27}};
		for(n=0;n<3;n++){
			for (m=0;m<7;m++)//dont use m<=7 once they reach 7 its ture and it was stoped 
			{
				System.out.print(a[n][m]);
				System.out.print("  ");
				
			}
			System.out.println("");
		}
	}
}