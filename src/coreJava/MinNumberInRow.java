package coreJava;

public class MinNumberInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{0,1,4},{3,9,6},{7,5,2}};
		int min=arr[0][0];
		int mincolumn=0;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
					mincolumn=j;
				}			
			}	
		}
		int max=arr[0][mincolumn];
		for(int k=0;k<arr.length;k++) {
			if(max<arr[k][mincolumn]) {
				max=arr[k][mincolumn];
			}
		}	
//		System.out.println(arr.length);
		System.out.println("minimum in row "+min);	
		System.out.println("max in row "+max);	
		
	}

}
