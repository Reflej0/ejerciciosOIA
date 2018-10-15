package CaosEnLaEnvasadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CaosEnLaEnvasadora extends EjercicioOIA
{
	
	private ArrayList<Integer> secuencias = new ArrayList<Integer>();
	private ArrayList<Integer> distancias = new ArrayList<Integer>();
	private int cantidadLatas = -1; // Descuento la F del final.
	private int mayorNumeroLatas = 0;
	private int segundoMayorNumeroLatas = 0;
	private int distanciaEntre = 0;
	
	public CaosEnLaEnvasadora(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		sc.useLocale(Locale.ENGLISH);
		int contador = 0;
		int distancia = 0;
		Character aux;
		while(sc.hasNext())
		{
			aux = sc.next().charAt(0);
			if(aux == 'G' && distancia==0)
				contador++;
			else if(aux == 'G' && distancia!=0)
			{
				contador++;
				distancias.add(distancia);
				distancia = 0;
			}
			else if(aux != 'G' && contador != 0)
			{
				secuencias.add(contador);
				contador = 0;
				distancia++;
			}
			else if(aux != 'G' && contador == 0)
				distancia++;
			cantidadLatas++;
		}
		sc.close();
	}

	@Override
	public void resolver() 
	{
		int posMayor = buscarMayor(-1);
		mayorNumeroLatas = secuencias.get(posMayor);
		int posSegundoMayor = buscarMayor(posMayor);
		segundoMayorNumeroLatas = secuencias.get(posSegundoMayor);
		int inicio, fin;
		if(posSegundoMayor < posMayor)
		{
			inicio = posSegundoMayor;
			fin = posMayor;
		}
		else
		{
			inicio = posMayor;
			fin = posSegundoMayor;
		}
		for(int i = inicio; i < fin; i++)
			distanciaEntre+=distancias.get(i);
		for(int i = inicio+1; i < fin; i++)
			distanciaEntre+=secuencias.get(i);
		this.imprimirSalida();
	}
	
	private void imprimirSalida()
	{
		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(this.salida));
			salida.println(cantidadLatas);
			salida.println(mayorNumeroLatas);
			salida.println(segundoMayorNumeroLatas);
			salida.println(distanciaEntre);
			salida.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Ha ocurrido un error con el archivo de salida");
			System.exit(1);
		}
	}
	
	/* La secuencia seria G 4996 letras distintas de G, despues G G F
	 * Seria un caso de fatiga y ademas controlar si funciona.
	*/
	public static void generarAleatorio(String salidaArch)
	{
		try 
		{
			int max = 3;
			int min = 1;
			PrintWriter salida = new PrintWriter(new FileWriter(salidaArch));
			salida.print("G" + " ");
			for(int i = 0; i < 4996; i++)
			{
				Random rn = new Random();
				int numero = rn.nextInt((max - min) + 1) + min;
				char c = 0;
				switch(numero)
				{
				case 1:
					c = 'A';
					break;
				case 2:
					c = 'C';
					break;
				case 3:
					c = 'T';
					break;
				}
				salida.print(c + " ");
			}
			salida.print("G" + " ");
			salida.print("G" + " ");
			salida.print("F");
			salida.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Ha ocurrido un error con el archivo de salida");
			System.exit(1);
		}
	}
	
	private int buscarMayor(int posExcluida)
	{
		int mayor = -1;
		int posmayor = -1;
		for(int i = 0; i < this.secuencias.size(); i++)
		{
			int aux = this.secuencias.get(i);
			if(aux>mayor && i!=posExcluida)
			{
				mayor = aux;
				posmayor = i;
			}
		}
		return posmayor;
	}

}
