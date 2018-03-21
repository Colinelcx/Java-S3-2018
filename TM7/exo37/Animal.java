public abstract class Animal {
	private String nom;
	private int age;

	public Animal(String nom, int age){
		this.nom = nom;
		this.age = age;
	}

	public Animal(String nom){
		this(nom, 1);
	}

	public String toString(){
		return nom + ", " + age + " ans";
	}

	public void vieillir(){
		age ++;
	}

	public abstract void crier();
}