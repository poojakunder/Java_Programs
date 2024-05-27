package coreJava;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//arrays which stores same type of multiple values
		int b[]=new int[5];
		b[0]=10;
		b[1]=10;
		b[2]=10;
		System.out.println(b);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		//array literal for initialization of array
		int a[]= {1,4,3};
		//multidimentional array/matrices
		//it has rows and columns (x axis and y axis)
		/*
		 * 2 4 5
		 * 3 5 8
		 * 1 0 9
		 */
		int c[][]=new int[2][3];
		c[0][0]=2;
		c[0][1]=4;
		System.out.println("matrices");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.println(c[i][j]);
			}
		}
		//initialize mutltidementional array as litera
		int d[][]= {{2,3,4},{1,9,0},{4,5,7}};		
	}
}
