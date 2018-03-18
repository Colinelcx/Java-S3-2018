public class Case {
	private int nombre;
	private boolean modifiable;
	private Choix col, line, bloc;

	public Case(Choix col, Choix line, Choix bloc){
		this.col = col;
		this.line = line;
		this.bloc = bloc;
		this.modifiable = true;
		this.nombre = -1;
	}

	public int getNombre(){
		return nombre;
	}

	public boolean getModifiable(){
		return modifiable;
	}

	public boolean estVide(){
		return nombre==-1;
	}

	public String toString(){
		if(estVide())
			return " ";
		return String.format("%d", nombre+1);
	}

	public Choix getChoix(){
		return (col.intersection(line).intersection(line.intersection(bloc)));
	}

	public void supprime(){
		if (modifiable){
			this.nombre = -1;
			col.setLibre(nombre);
			line.setLibre(nombre);
			bloc.setLibre(nombre);
		}
	}

	public boolean setNombre(int nombre){
		if (modifiable && nombre >=0 && nombre< col.length) {
			if(getChoix().estLibre(nombre)){
				if (!estVide())
					supprime();
				this.nombre = nombre;
				col.setOccupe(nombre);
				line.setOccupe(nombre);
				bloc.setOccupe(nombre);
				return true;
			}
		}
		return false;
	}
}