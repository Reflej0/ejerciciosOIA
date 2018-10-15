import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ConflictoReinas extends EjercicioOIA
{
	private Reina[] reinas;
	//Constructor para hacer las pruebas desde archivo.
	public ConflictoReinas(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		sc.useLocale(Locale.ENGLISH);
		//Las dimensiones del tablero no me interesan, al menos en esta solucion.
		sc.nextInt(); // Dimension del tablero.
		reinas = new Reina[sc.nextInt()];
		for(int i = 0; sc.hasNextInt(); i++)
			reinas[i] = new Reina(sc.nextInt(), sc.nextInt());
		sc.close();
	}
	
	//Constructor para recibir la entrada desde vectores ya cargados.
	//Y devolver la salida por archivo.
	public ConflictoReinas(Reina[] reinas, String salida)
	{
		super("", salida);
		this.reinas = reinas;
	}
	
	@Override
	public void resolver() throws IOException
	{
		PrintWriter salida = new PrintWriter(new FileWriter(this.salida));
		//Las dimensiones del tablero no me interesan, al menos en esta solucion.
		/*Reina tablero[] = new Reina[1];
		tablero[0] = reinas[0];*/
		//Recorro las reinas.
		for(int i = 1; i < reinas.length; i++)
		{
			//Recorro las reinas para comparar.
			for(int j = 1; j <reinas.length; j++)
			{
				//Pregunto que tipo de conflicto tienen las reinas evaluadas.
				if(reinas[i].conflicto0(reinas[j]))
					reinas[i].setConflicto0(reinas[j], j);
				else if(reinas[i].conflicto1(reinas[j]))
					reinas[i].setConflicto1(reinas[j], j);
				else if(reinas[i].conflicto2(reinas[j]))
					reinas[i].setConflicto2(reinas[j], j);
				else if(reinas[i].conflicto3(reinas[j]))
					reinas[i].setConflicto3(reinas[j], j);
				else if(reinas[i].conflicto4(reinas[j]))
					reinas[i].setConflicto4(reinas[j], j);
				else if(reinas[i].conflicto5(reinas[j]))
					reinas[i].setConflicto5(reinas[j], j);
				else if(reinas[i].conflicto6(reinas[j]))
					reinas[i].setConflicto6(reinas[j], j);
				else if(reinas[i].conflicto7(reinas[j]))
					reinas[i].setConflicto7(reinas[j], j);
			}
			//Despues de evaluar los conflictos totales de cada reina los imprimo en la salida.
			salida.print(reinas[i].getConflictosContador()+" ");
			for(int k = 0; k < 8; k++)
			{
				//Si el conflicto es distinto de null quiere decir valga la redundancia que hay un conflicto.
				if(reinas[i].getConflicto2(k)!= null)
					salida.print(reinas[i].getConflicto2(k)+" ");
			}
			salida.println("");
		}
		salida.close();
	}
}