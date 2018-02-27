public class IntString{
	private String nombre;
	private int entier; 
	
	public IntString(int nb){
		entier = nb;
		switch (nb) {
				case 0:
					nombre = "zéro";
					break;
				case 1:
					nombre = "un";
					break;
				case 2:
					nombre = "deux";
					break;
				case 3:
					nombre = "trois";
					break;
				case 4:
					nombre = "quatre";
					break;
				case 5:
					nombre = "cinq";
					break;
				case 6:
					nombre = "six";
					break;
				case 7:
					nombre = "sept";
					break;
				case 8:
					nombre = "huit";
					break;
				case 9:
					nombre = "neuf";
					break;
				default : 
					nombre = "erreur";
		}
	}
	
	public String getUnite(){
		return nombre;
	}
	
	public String getDizaine(){
		switch (entier) {
				case 1:
					return "dix";
				case 2:
					return "vingt";
				case 3:
					return "trente";
				case 4:
					return "quarante";
				case 5:
					return "cinquant";
				case 6:
					return "soixante";
				case 7:
					return "soixante-dix";
				case 8:
					return "quatre-vingt";
				case 9:
					return "quatre-vingt-dix";
				default : 
					return "erreur";
		}
	}
}
