import java.util.Scanner;
class gestionEtudiant
{
	public static void main(String[] args) 
	{
		int n,nbr,menu;
		String matricule;
		String nom;
		String genre;
		int date;
		double moyenne;
		double bonus1;

		System.out.print("Combien d'Etudiant voulez vous ? : ");
		Scanner clavier = new Scanner(System.in);
		n=clavier.nextInt();
		clavier.nextLine();
		System.out.println(" ");

		Etudiant[] tab = new Etudiant[n];

		for(int i=0;i<n;i++)
		{

			System.out.println("Informations sur l'Etudiant "+(i+1));
			System.out.print("Matriule : ");
			matricule = clavier.nextLine();

			System.out.print("Nom : ");
			nom = clavier.nextLine();

			System.out.print("Genre : ");
			genre = clavier.nextLine();

			System.out.print("Date : ");
			date = clavier.nextInt();

			System.out.print("Moyenne : ");
			moyenne = clavier.nextDouble();
			clavier.nextLine();

			System.out.println(" ");
			
			

			Etudiant etudiant = new Etudiant(matricule,nom,genre,date,moyenne);

			tab[i] = etudiant; 
		}	
		System.out.println("Quelle operation voulez vous :");
		System.out.println("1: Afficher les Etudiants par ordre de merite");
		System.out.println("2: Afficher les informations sur le premier Etudiant");
		System.out.println("3: Afficher les informations du dernier Etudiant");
		System.out.println("4: Reinitialiser la liste de la classe");
		System.out.println("5: Sortir du programmme");
		menu=clavier.nextInt();
		

		switch (menu) 
		{
			case 2: tab[0].afficher();break;
			case 3: tab[n-1].afficher();break;
			case 4: Etudiant etudiant = null;
			case 5: System.out.println("Programme termine.");break;
			default: System.out.println("Programme termine.");break;
		}
	}
	/*public static void aff()
	{
		Etudiant sup = tab[0];
		for(int i=0;i<n;i++)
		{
			
		}
	}*/

}