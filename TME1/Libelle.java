public class Libelle{
	public static void main(String[] args){
		int nombre = Integer.parseInt(args[0]);
		int i = 0;
		String libelle = "";
		IntString iS = null;
		
		if (nombre >= 1000){
			System.out.println("Erreur : " + nombre + " est trop grand");
		}
		
		else {
			
			//Affichage des unités
			i = nombre %10;
			iS = new IntString(i);
			switch (iS.getUnite()){
				case "zéro":
					if (nombre !=0){
						break;
					}
				default :
					libelle = iS.getUnite();
			}
			
			//Afichage des dizaines
			if (nombre >= 10){
				i = nombre%100;
				i = i/10;
				iS = new IntString(i);

				switch (libelle) {
					case "":
						libelle = iS.getDizaine();
						if (iS.getDizaine() == "vingt" || iS.getDizaine()=="quatre-vingt"){
							libelle +="s";
						}
						break;
					case "un":
						if (i>1 && i<8){
							libelle = iS.getDizaine() + " et " + libelle;
							break;
						}
                        if (i==1 || i==9){
                            libelle = "onze";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
                    case "deux":
                        if(i==1 || i==9){
                            libelle="douze";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
                    case "trois":
                        if(i==1 || i==9){
                            libelle="treize";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
                    case "quatre":
                        if(i==1 || i==9){
                            libelle="quatorze";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
                    case "cinq":
                        if(i==1 || i==9){
                            libelle="quinze";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
                    case "six":
                        if(i==1 || i==9){
                            libelle="seize";
                            if (i==9){
                                libelle = "quatre-vingt " + libelle;
                            }
                            break;
                        }
					default :
                            libelle = iS.getDizaine() + "-" + libelle;
				}
			}
            
			//Affichage des centaines
			if (nombre >= 100){
				i= nombre%1000;
				i = i/100;
				iS = new IntString(i);
				if(iS.getUnite() == "un"){
					libelle = "cent " + libelle;
				}
				else {
					if (libelle == ""){
						libelle = iS.getUnite() + " cents";
					}
					else {
						libelle = iS.getUnite() + " cent " + libelle ;
					}
				}
			}	
			
		System.out.println(libelle);
			
				
		}

	}
}
