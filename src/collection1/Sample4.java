package collection1;

public class Sample4 {
	static Object[] a= {10,20,30,40};
public static void main(String[] args) {
	printing();
	remove(2);
	System.out.println("\n\n");
	printing();
	
}
static void remove(int index) {
	a[index]=null;
}
static void printing() {
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=null)
			System.out.println(a[i]);
	}
}
}
