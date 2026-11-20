package collection1;
// print elements in array
public class Sample1 {
public static void main(String[] args) {
	Object[] arr= new Object[10];
	arr[0]=10;
	arr[1]=30.45;
	arr[2]="abc";
	arr[3]='A';
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=null)
			System.out.println(arr[i]);
	}
}
}
