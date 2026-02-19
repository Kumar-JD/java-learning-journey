class ThreeArr{
	public static void main(String args[]){
		byte m,n,o;
		int a[][][] ={
			{{1, 2, 3},{4, 5, 6},{7, 8, 9}
			},
		          
		    {{85, 78, 90},{88, 76, 92},{70, 68,75}
			},
		    {{1,2,3,4,5,6,7},{11,12,13,14,15,16,17},{21,22,23,24,25,26,27}
			}
		};
		for(m=0;m<=a.length;m++)//this loop for no.of 2d arrays m<3
		{
			for(n=0;n<a[m].length;n++)// no.of rows n<3
			{
				for(o=0;o<a[m][n].length;o++)//no.of collmes o<7
				{
					System.out.print(a[m][n][o]);
					System.out.print("  ");
				}
				System.out.println(" ");
			}
		}
			
	}
}