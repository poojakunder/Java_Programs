package coreJava;

public class smallestNumberInMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{11,3,4},{8,9,6},{7,5,2}};
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
