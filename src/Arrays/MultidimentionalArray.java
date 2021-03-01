package Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int maddy[][]= new int[2][2];
		maddy[0][0]= 500;
		maddy[0][1]= 600;
		
		
		maddy[1][0]= 700;
		maddy[1][1]= 800;
		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<maddy.length;j++)
			{
		System.out.println(maddy[i][j]);
			}
		
		}
	}

}
