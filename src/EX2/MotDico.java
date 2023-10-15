package EX2;

public class MotDico {
	private static int num;
	private String mot;
	private String definition;
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		MotDico.num = num;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String s) {
		this.mot = s;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String s) {
		this.definition = s;
	}
	boolean synonyme(MotDico m)
	{
		if(this.getDefinition()==m.getDefinition())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override 
	public String toString()
	{
		return "nom: "+this.mot+"definition: "+this.definition;
	}
	
}
