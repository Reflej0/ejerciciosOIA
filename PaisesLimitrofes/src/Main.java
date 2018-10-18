import java.io.FileNotFoundException;

public class Main 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		PaisesLimitrofes loteEjercicio1 = new PaisesLimitrofes("./in/loteEnunciado1.in", "./out/loteEnunciado1.out");
		loteEjercicio1.resolver();
		System.out.println("");
		PaisesLimitrofes loteEjercicio2 = new PaisesLimitrofes("./in/loteEnunciado2.in", "./out/loteEnunciado2.out");
		loteEjercicio2.resolver();
		System.out.println("");
		PaisesLimitrofes lotePropio1 = new PaisesLimitrofes("./in/lotePropio1.in", "./out/lotePropio1.out");
		lotePropio1.resolver();
		System.out.println("");
	}

}
