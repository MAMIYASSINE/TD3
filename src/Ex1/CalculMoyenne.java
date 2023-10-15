package Ex1;
import java.util.Scanner;

public class CalculMoyenne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nb;
		do
		{
			System.out.println("Donner le nombredes etudiants < "+Tab.getNVMax()+" : ");
			 nb=sc.nextInt();
			
		}
		while( nb >Tab.getNVMax());
		float noteCtrl[] =new float [nb];
		float noteExam[] =new float [nb];
		Tab.remplir(noteCtrl);
		Tab.remplir(noteExam);
		//Tab.lister(noteCtrl);
		//Tab.lister(noteExam);
		/*float t1[]=Tab.produit(2, noteExam);
		float t2[]=Tab.additionner(noteCtrl, t1);
		float moy[]=Tab.produit(1/3, t2);
		Tab.lister(moy);*/
		
	
		
		
		
	}

}
