

package javaVincent;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	private String libelle;
	public List<Etudiant> etudiants;

	public Classe(String libelle) {
		this.libelle = libelle;
		this.etudiants = new ArrayList<Etudiant>();
	}

	public int getEtudiant(int index) {
		return index;
	}
	
	public void ajouterEtudiant(Etudiant etudiant) {
	
		etudiants.add(etudiant);
	}
	
	public void removeEtudiant(int index) {
		etudiants.remove(index);
	}

	public void presenterClasse() {
		System.out.println("Bonjour, bienvenue en  " + libelle);
		for (int i = 0; i < etudiants.size(); i++ ) {
			etudiants.get(i).sePresenter();
		}

	}
}