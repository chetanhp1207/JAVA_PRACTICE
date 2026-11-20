package Ploymorphism;
class Films{
	void watch() {
		System.out.println("watching movie");
	}
}
class Comedy extends Films{
	void watch() {
		System.out.println("Comedy movie");
	}
}
class Romantic extends Films{
	void watch() {
		System.out.println("Romantic movie");
	}
}
class Action extends Films{
	void watch() {
		System.out.println("Action movie");
	}
}
class Stimulator5{
	static void select(Films f) {
		f.watch();
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Comedy c=new Comedy();
		Romantic r=new Romantic();
		Action a=new Action();
		Stimulator5.select(a);
		Stimulator5.select(r);
		Stimulator5.select(c);
	}

}
