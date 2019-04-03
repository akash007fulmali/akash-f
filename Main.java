package akash;
import java.util.Scanner;
public class Main {

	static int check(String array, String array2){
			int temp =0;
		for(int i=0; i<array.length() ; i++)
		{
			for(int j=0; j<array2.length(); j++){
				
				if(array.charAt(i)==array2.charAt(j)){
				temp++;
				break;
				}
			}
			
		}
		if(temp == array.length()){
			return 1;
		}
		else return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=0;
		System.out.println("Enter no of test cases");
		Scanner in = new Scanner(System.in);
		T= in.nextInt();
		String array[][]= new String[T][2];
		int ans[] =new int[T];
		for (int i=0; i<T ; i++){
			for(int j=0 ; j<2 ; j++){
				array[i][j]=in.next();
			}
			
		}
		
		for(int i=0; i< T;i++){
			ans[i]=check(array[i][0],array[i][1]);
		}
		
		for(int i=0; i< T;i++){
			if(ans[i]==1){
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
				
			}
		}
		
	}

}
