package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate3 {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>(Arrays.asList(2,4,5,7,88,66,55,22,34,51,69,90));
	Predicate<Integer> p1=n->n%3==0;
	for(int x: l1) {
		if (p1.test(x)) {
			System.out.println(x);
		}
	}
}
}
