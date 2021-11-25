public class Etudiant
{
	private String matricule;
	private String nom;
	private String genre;
	private int date;
	private double moyenne;

	public Etudiant(String matricule,String nom,String genre,int date,double moyenne)
	{
		this.matricule = matricule;
		this.nom = nom;
		this.genre = genre;
		this.date = date;
		this.moyenne = moyenne;
	}

	public void afficher()
	{
		System.out.println("Matricule : "+this.matricule);
		System.out.println("Nom : "+this.nom);
		System.out.println("Genre : "+this.genre);
		System.out.println("Date : "+this.date);
		System.out.println("Moyenne : "+this.moyenne);
	}

	public void calculerAge()
	{
			System.out.println("Votre Age est : "+(2021-this.date));
	}

	public void bonifier(double bonus)
	{
		System.out.println("Votre moyenne bonifiée est : "+(this.moyenne += bonus) );
	}


}