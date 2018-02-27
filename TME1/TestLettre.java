public class TestLettre{
	public static void main(String[] args){
		for (char i = 'a'; i<='z'; i++){
			Lettre l = new Lettre(i);
			System.out.println("Code ascii de " + i + " : " + l.getCodeAscii());
		}
		for (char i = 'a'; i<='z'; i++){
			Lettre l = new Lettre(i);
			if (('a'-l.getCarac())%5 == 0){
				System.out.print("\n");
			}
			System.out.print(l.getCarac()+ " ");
		}
		System.out.print("\n");

	}
}
