package diabet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	private Individu ind1;
	private Donnees donnee1;
	private boolean sexeValide;

	public static void main(String[] args) throws ParseException {
		System.out.println("Creer un nouvel individu. \nSon nom :");
		Scanner sc = new Scanner(System.in);
		/*
		 * String nom = sc.nextLine(); System.out.println("Son prénom :"); String prenom
		 * = sc.nextLine();
		 * 
		 * 
		 * System.out.println("Son sexe : \n1.Homme 2.Femme"); String sexe = sc.next();
		 * 
		 * boolean sexeValide = false;
		 * 
		 * if(sexe.equals("1")) { sexeValide = true; }
		 * 
		 * System.out.println("Numéro de sécurité social :"); int numSecu =
		 * sc.nextInt();
		 */

		System.out.println("Date de naissance :");
		String dateNaissance = sc.nextLine();

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissanceValide = formatter1.parse(dateNaissance);

		Individu ind1 = new Individu(0, "a", "a", dateNaissanceValide, true, 14);

		System.out.println(ind1.toString());

		/* ------------------------------------ */

		Donnees don1 = new Donnees(0, 0, 1.20, 150.0, 21, 50.0, true, true, true, true, 2);

		int age;
		try {
			age = don1.calculAge(ind1.getDateNaissance());
			System.out.println(age);
			int resu = don1.calculResultat(don1.getTaille(), don1.getPoids(), age, don1.getTourDeTaille(),
					ind1.getSexe(), don1.isActPhysique(), don1.getLegumeVert(), don1.isAtcdAntiHTA(),
					don1.isAtcdFamille(), don1.isAtcdGlycemie());
			System.out.println(don1.toString(resu));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
