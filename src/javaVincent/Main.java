package javaVincent;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int maVar = 8;
		int maVar2 = 12;
		
		Etudiant Vincent = new Etudiant ("liermann", "Vincent", "18", "BTS SIO1");
		Etudiant moi = new Etudiant ("moi", "toitoi", "32", "BTS SIO1");
		Chien un = new Chien(500, 4, "RonanLechien", "PadRace");
		Chien deux = new Chien(500, 5, "moimoilechien", "Fox terrier");
		Classe BTS = new Classe("BTS SIO");
		Ours test = new Ours(500, 99, "test", "bleu", "deplacement", "alimentation");
		
		
		List<Chien> chenil = new ArrayList<Chien>();
		chenil.add(un);
		chenil.add(deux);
		Vincent.ajouterChien(un);
		Vincent.ajouterChien(deux);
		moi.ajouterOurs(test);
		BTS.ajouterEtudiant(Vincent);
		BTS.ajouterEtudiant(moi);
		BTS.presenterClasse();
		
		
		
		}
	}

