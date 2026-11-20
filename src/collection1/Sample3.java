package collection1;


public class Sample3 {
	static Object[] a=new Object[10];
	static int index=0;
public static void main(String[] args) {
	add(10);
	add(34.7);
	add('d');
	add("err");
	printing();
}
static void add(Object obj) {
	a[index++]=obj;
}
static void printing() {
	for(int i=0;i<a.length;i++) {
		if(a[i]!=null)
			System.out.println(a[i]);
	}
}
}
