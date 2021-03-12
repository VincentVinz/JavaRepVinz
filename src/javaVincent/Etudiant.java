package javaVincent;

import java.util.List;
import java.util.ArrayList;

public class Etudiant {

	
	
	private String nom;
	private String prenom;
	private String age;
	private String classe;
	private List<Chien> chiens;
	private List<Ours> ours;
	
	public Etudiant(String nom, String prenom, String age, String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.chiens = new ArrayList<>();
		this.ours = new ArrayList<>();
			
		}
	
	
	public void sePresenter() {
		System.out.println("Bonjour, je m'appelle " + nom + " " + prenom + " j'ai " + age + " et je suis en " + classe );
		for (int i = 0; i < chiens.size(); i++ ) {
			chiens.get(i).sePresenter();
		}
		for (int j = 0; j < ours.size(); j++) {
			ours.get(j).sePresenter();
		}
	}
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	
	public void retierChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	public void ajouterOurs(Ours p_ours) {
		ours.add(p_ours);
	}
	
	public void retirerOurs(int numeroOurs) {
		ours.remove(numeroOurs);
	}
}

