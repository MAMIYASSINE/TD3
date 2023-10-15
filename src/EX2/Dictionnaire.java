package EX2;

public class Dictionnaire {
	private int nbMots;
	private MotDico dico[];
	private String nom;
	Dictionnaire(int nbMots, String nom)
	{
		this.nbMots=nbMots;
		this.nom=nom;
		dico =new MotDico[this.nbMots];
	}
	void ajouterMot(MotDico m)
	{
		if(dico.length<nbMots)
		{
			dico[dico.length]=m;
			dico.length++;
			
		}
		else
		{
			System.out.println("Impossible d'ajouter un autre mot");
		}
	}
	void supprimerMot(String ch)
	{
		int i=0;
		while((i<this.dico.length)&&(dico[i].getMot() != ch))
				{
					i++;
				}
		if(i<this.dico.length)
		{
			for(int j=i;j<this.dico.length;j++)
			{
				this.dico[j]=this.dico[j+1];
			}
			this.dico.length--;
		}
		else
		{
			System.out.println("La mot n'est pas trouve");
		}
	}
	int chercherMot(String ch)
	{
		int i=0;
		while((i<dico.length)&&(dico[i].getMot() == ch))
				{
					i++;
				}
		if(i<dico.length)
		{
			return i;
		}
		else
		{
			return -1;
		}
	}
	void listerDico()
	{
		for(int i=0; i<dico.length;i++)
		{
			System.out.println(dico[i]);
		}
	}
	int nbSynonymes(MotDico m)
	{
		int S=0;
		for(int i=0; i<dico.length;i++)
		{
			if(dico[i].synonyme(m)==true)
			{
				S++;
			}
		}
		return S;
	}
	
}
