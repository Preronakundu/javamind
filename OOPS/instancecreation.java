//just instance creation in java with main file 

class Main
{
    String name;
    int marks;
	public static void main(String[] args) {
		Main m1 = new Main();
		Main m2 = new Main();
		m1.name="prerona";
		m1.marks=44;
		System.out.println(m1.name+" got:"+m1.marks);
	}
}
