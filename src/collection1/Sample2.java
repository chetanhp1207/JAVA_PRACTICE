package collection1;
// add and print
public class Sample2 {
	static Object[] a=new Object[10];
public static void main(String[] args) {
	add();
	printing();
}
static void add() {
	a[0]=23;
	a[1]=35.8;
	a[2]="rgh";
	a[3]='c';
}
static void printing() {
	for(int i=0;i<a.length;i++) {
		if(a[i]!=null)
			System.out.println(a[i]);
			
	}
}
}
