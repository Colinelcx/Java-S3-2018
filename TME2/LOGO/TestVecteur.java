public class TestVecteur{
	public static void main (String[] args){
		Vecteur v1 = new Vecteur(1, 1);
		Vecteur v2 = new Vecteur(0, 1);
		Vecteur v3 = null, v4=null, v5 = null ;

		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		v3 = v1.addGen(v2);
		System.out.println("v3 = " + v3);
		v4 = v2.rotation(Math.PI/2);
		System.out.println("v4 = " + v4);
		v5 = v1.rotation(Math.PI/2);
		System.out.println("v5 = " + v5);
	}
}