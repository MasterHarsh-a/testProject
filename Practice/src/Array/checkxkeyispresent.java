package Array;

public class checkxkeyispresent {
	static boolean exists(int[] check, int x, int N,int k) {
	
		boolean b =false;
		int i;
		for( i=0; i<N;i=i+k)
		{
			for(int j = 0; j<i+k;j++)
			{
				if(i+j < N && check[i+j] == x)
					break;
				if (j == k)
	                return false;
	            if (i + j >= N)
	                return false;
			}
	
	
		}
		 if (i >= N)
	            return true;
		 else
		return b;
	}

	public static void main(String[] args) {
		
		int check[]= {2,3,4,5,6,3,5,4,3};
		int x =3; int k =3;
		int n = check.length;
		if(exists(check, x, n,k)) 
			System.out.println("YES");
		else
			System.out.println("NO");
		
			
		}
	
		
		// TODO Auto-generated method stub



}
