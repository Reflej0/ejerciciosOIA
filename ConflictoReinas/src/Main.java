import java.io.IOException;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		ConflictoReinas loteEnunciado1 = new ConflictoReinas(LoteEnunciado1(), "./out/loteEnunciado1.out");
		ConflictoReinas loteEnunciado2 = new ConflictoReinas(LoteEnunciado2(), "./out/loteEnunciado2.out");
		ConflictoReinas lotePropio1 = new ConflictoReinas(LotePropio1(), "./out/lotePropio1.out");
		ConflictoReinas lotePropio2 = new ConflictoReinas(LotePropio2(), "./out/lotePropio2.out");
		ConflictoReinas lotePropio3 = new ConflictoReinas(LotePropio3(), "./out/lotePropio3.out");
		loteEnunciado1.resolver();
		loteEnunciado2.resolver();
		lotePropio1.resolver();
		lotePropio2.resolver();
		lotePropio3.resolver();
	}
	
	public static Reina[] LoteEnunciado1()
	{
		Reina[] prueba = new Reina[9];
		prueba[0] = new Reina(8 ,8);
		prueba[1] = new Reina(4, 1);
		prueba[2] = new Reina(8, 2);
		prueba[3] = new Reina(1, 3);
		prueba[4] = new Reina(3, 4);
		prueba[5] = new Reina(6, 5);
		prueba[6] = new Reina(2, 6);
		prueba[7] = new Reina(7, 7);
		prueba[8] = new Reina(5, 8);
		return prueba;
	}
	
	public static Reina[] LoteEnunciado2()
	{
		Reina prueba[] = new Reina[11];
		prueba[0] = new Reina(8 ,10);
		prueba[1] = new Reina(2, 1);
		prueba[2] = new Reina(8, 2);
		prueba[3] = new Reina(1, 3);
		prueba[4] = new Reina(3, 4);
		prueba[5] = new Reina(6, 5);
		prueba[6] = new Reina(4, 6);
		prueba[7] = new Reina(7, 7);
		prueba[8] = new Reina(5, 8);
		prueba[9] = new Reina(3, 5);
		prueba[10] = new Reina(3, 6);
		return prueba;
	}
	
	/* Se intenta probar que tras llenar una fila o columna de reinas, cada una de estas
	 * posee 2 conflictos con sus reinas contiguas, excepto las reinas de los extremos
	 * que solo conflictuan con una reina.
	 */
	public static Reina[] LotePropio1()
	{
		Reina prueba[] = new Reina[9];
		prueba[0] = new Reina(8 ,8);
		prueba[1] = new Reina(4, 1);
		prueba[2] = new Reina(4, 2);
		prueba[3] = new Reina(4, 3);
		prueba[4] = new Reina(4, 4);
		prueba[5] = new Reina(4, 5);
		prueba[6] = new Reina(4, 6);
		prueba[7] = new Reina(4, 7);
		prueba[8] = new Reina(4, 8);
		return prueba;
	}
	
	/* Se intenta probar que teniendo un tablero de una dimension N, en este caso 5
	 * y el tablero cubierto en su totalidad por reinas, el patron de conflictos es:
	 * 2 conflictos para las reinas ubicadas en los extremos del tablero.
	 * 5 conflictos para las reinas ubicadas en la primer fila o columna, no extremo.
	 * 8 conflictos para las reinas ubicadas en otra posicion del tablero.
	 */
	public static Reina[] LotePropio2()
	{
		Reina prueba[] = new Reina[26];
		prueba[0] = new Reina(5 ,5);
		prueba[1] = new Reina(1, 1);
		prueba[2] = new Reina(1, 2);
		prueba[3] = new Reina(1, 3);
		prueba[4] = new Reina(1, 4);
		prueba[5] = new Reina(1, 5);
		prueba[6] = new Reina(2, 1);
		prueba[7] = new Reina(2, 2);
		prueba[8] = new Reina(2, 3);
		prueba[9] = new Reina(2, 4);
		prueba[10] = new Reina(2, 5);
		prueba[11] = new Reina(3, 1);
		prueba[12] = new Reina(3, 2);
		prueba[13] = new Reina(3, 3);
		prueba[14] = new Reina(3, 4);
		prueba[15] = new Reina(3, 5);
		prueba[16] = new Reina(4, 1);
		prueba[17] = new Reina(4, 2);
		prueba[18] = new Reina(4, 3);
		prueba[19] = new Reina(4, 4);
		prueba[20] = new Reina(4, 5);
		prueba[21] = new Reina(5, 1);
		prueba[22] = new Reina(5, 2);
		prueba[23] = new Reina(5, 3);
		prueba[24] = new Reina(5, 4);
		prueba[25] = new Reina(5, 5);
		return prueba;
	}
	
	/* Dado un tablero de dimension N(8) se ubican 7 reinas
	 * de tal manera que ninguna entre en conflicto.
	 */
	public static Reina[] LotePropio3()
	{
		Reina prueba[] = new Reina[8];
		prueba[0] = new Reina(8 ,8);
		prueba[1] = new Reina(4, 2);
		prueba[2] = new Reina(7, 1);
		prueba[3] = new Reina(8, 3);
		prueba[4] = new Reina(5, 4);
		prueba[5] = new Reina(2, 5);
		prueba[6] = new Reina(6, 6);
		prueba[7] = new Reina(3, 7);
		return prueba;
	}
}
