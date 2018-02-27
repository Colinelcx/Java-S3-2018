public class TestTracteur {

	public static void main (String[] args){
		Roue gr1= new Roue (120);
		Roue gr2= new Roue (120);
		Roue pr1= new Roue();
		Roue pr2= new Roue();
        String str = "Rouge";

		System.out.println (gr1 +"\n"+gr2+"\n"+pr1+"\n"+pr2);

		Cabine c = new Cabine(1000,str);
		System.out.println(c);
		c.setCouleur("Bleu");
		System.out.println(c);

		Tracteur t1 = new Tracteur(c, gr1, gr2, pr1, pr2);
		System.out.println(t1);
		Tracteur t2 = new Tracteur(t1);
		t2.peindre("Vert");
		System.out.println(t1);
        System.out.println("str :" + str);



	}
}
