import java.io.FileNotFoundException;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		DescubriendoNombresRepetidos loteEnunciado = new DescubriendoNombresRepetidos("./in/loteEnunciado.in", "./out/loteEnunciado.out");
		DescubriendoNombresRepetidos lotePropio1 = new DescubriendoNombresRepetidos("./in/lotePropio1.in", "./out/lotePropio1.out");
		DescubriendoNombresRepetidos lotePropio2 = new DescubriendoNombresRepetidos("./in/lotePropio2.in", "./out/lotePropio2.out");
		loteEnunciado.resolver();
		lotePropio1.resolver();
		lotePropio2.resolver();
	}
	
	//Lotes que se cargan por archivo, pero no se pueden adjuntar los archivos.
	public static String[] LoteEnunciado()
	{
		String[] nombres = new String[25];
		nombres[0] = "Ana"; 
		nombres[1] = "Ricardo";
		nombres[2] = "Juan";
		nombres[3] = "Ester";
		nombres[4] = "Juana";
		nombres[5] = "Pedro";
		nombres[6] = "Federico";
		nombres[7] = "Juan";
		nombres[8] = "Ismael";
		nombres[9] = "Juan";
		nombres[10] = "Ana";
		nombres[11] = "Pilar";
		nombres[12] = "Juan";
		nombres[13] = "Ana";
		nombres[14] = "Juana";
		nombres[15] = "Ana";
		nombres[16] = "Ricardo";
		nombres[17] = "Juan";
		nombres[18] = "Manuel";
		nombres[19] = "Juana";
		nombres[20] = "Pilar";
		nombres[21] = "Juana";
		nombres[22] = "Ana";
		nombres[23] = "Juan";
		nombres[24] = "Juan";
		return nombres;
	}
	
	/* Se busca probar que dado C(10) ninos con el mismo nombre, al buscar la
	 * cantidad N(5) de ninos con el mismo nombre, solo se devuelve una linea.
	 * 
	 */
	public static String[] LotePropio1()
	{
		String[] nombres = new String[10];
		nombres[0] = "Ana"; 
		nombres[1] = "Ana";
		nombres[2] = "Ana";
		nombres[3] = "Ana";
		nombres[4] = "Ana";
		nombres[5] = "Ana";
		nombres[6] = "Ana";
		nombres[7] = "Ana";
		nombres[8] = "Ana";
		nombres[9] = "Ana";
		return nombres;
	}
	
	/* Se busca probar que dado C(10) ninos todos con distintos nombre, al buscar la
	 * cantidad N(1) de ninos con el mismo nombre, la salida deberia ser aleatoria.
	 * 
	 */
	public static String[] LotePropio2()
	{
		String[] nombres = new String[10];
		nombres[0] = "Ana"; 
		nombres[1] = "Juan";
		nombres[2] = "Rodrigo";
		nombres[3] = "Matias";
		nombres[4] = "Lautaro";
		nombres[5] = "Carolina";
		nombres[6] = "Micaela";
		nombres[7] = "Leticia";
		nombres[8] = "Kevin";
		nombres[9] = "Eugenia";
		return nombres;
	}
}
