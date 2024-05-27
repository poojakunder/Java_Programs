package coreJava;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,6,2,9,0};
		for(int k=0;k<a.length;k++) {
			for(int i=k+1;i<a.length;i++) {
				if(a[k]>a[i]) {
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
			
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+"\t");
		}

	}

}
