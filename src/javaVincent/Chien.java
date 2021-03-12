package javaVincent;

public class Chien {
	
	
	private int taille;
	private int age;
	private String nom;
	private String race;


	public Chien(int taille, int age, String nom, String race) {
		
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
		
	}

	public void sePresenter() {
		System.out.println(nom + " " + taille + " " + age + " " + race);
	}

	public String toString() {
		return nom + " " + race;
	}
}


