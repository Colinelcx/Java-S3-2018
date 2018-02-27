public class SuiteNewton{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		int max = Integer.parseInt(args[1]);
		double u= x/2;
		int i = 0;
		while (i<=max){
			u = (u + x/u) /2.0;
			i++;
		}
		System.out.println("Racine de " + x + ", précision " + max + " : " + u);
	}
}
