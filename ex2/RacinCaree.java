package ex2;
public class RacinCaree {
	private int a;
	private int b;
	double[] resultat;
	public RacinCaree(int a, int b) throws Exception{
		if(a>=b) {
			throw new IllegalArgumentException("A est plus grand ou egale B ??");
		}else {
			 int taille = b - a + 1;
			resultat= new double[taille];
			 for (int i = 0; i < taille; i++) {
		            int nombre = a + i;
		            resultat[i] = Math.sqrt(nombre);
		        }
		}
	}

}
