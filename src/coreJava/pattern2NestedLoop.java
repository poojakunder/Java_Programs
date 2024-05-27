package coreJava;

public class pattern2NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k+"\t");
				k++;				
			}
			System.out.println();
		}
		System.out.println("************");
		for(int i=0;i<4;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+"\t");				
			}
			System.out.println();
		}
		System.out.println("************");
		int l=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(l*3+"\t");
				l++;				
			}
			System.out.println();
		}
		

	}

}
