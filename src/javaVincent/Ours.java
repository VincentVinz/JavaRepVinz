package javaVincent;

import java.util.ArrayList;

public class Ours {
	
	private int taille;
	private int age;
	private String nom;
	private String couleur;
	private String deplacement;
	private String alimentation;
	
	public Ours(int taille, int age, String nom, String couleur, String deplacement, String alimentation ) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.couleur = couleur;
		this.deplacement = deplacement;
		this.alimentation = alimentation;
	}

	public void sePresenter() {
		System.out.println(taille + " " + age + " " + nom + " " + couleur);
		
	}
	public void truc() {
		System.out.println("je " + deplacement + " et je " + alimentation);
	}
}
