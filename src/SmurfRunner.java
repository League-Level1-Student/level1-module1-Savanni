
public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smurf handy = new Smurf("Handy");
handy.eat();
System.out.println(handy.getName());
Smurf papa = new Smurf("Papa");
System.out.println(papa.getName());
System.out.println(papa.getHatColor());
System.out.println(papa.isGirlOrBoy());
Smurf Smurfette = new Smurf("Smurfette");
System.out.println(Smurfette.getName());
System.out.println(Smurfette.getHatColor());
System.out.println(Smurfette.isGirlOrBoy());
	}

}
