
public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	//	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
		
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Patrick = new SeaCreature("Patrick");
		Patrick.eat();
		Patrick.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		Squidward.eat();
		Squidward.laugh();
	}

}
