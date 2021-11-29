
public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human("Nina", 5, "blonde");
		Human h4 = h1;
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		System.out.println(h1 == h2 ); //false
		System.out.println(h1.equals(h2)); // true
		h1.setName("Manuel");
		System.out.println(h1.equals(h2)); //false
		System.out.println(h1);
		
		
		System.out.println(h1 == h4 );//true point to same address
		
		h2.setAge(30);
		h2.setName("Pati");
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		Human [] humans = {h1, h2,  h3};
		System.out.println("All names:");
		for ( int i = 0 ; i < humans.length; i++) {
			System.out.println(humans[i].getName());
		}
		
		System.out.println("Using for each");
		for(Human h : humans) {
			System.out.println(h.getHairColor());
		}
		
	}
}
