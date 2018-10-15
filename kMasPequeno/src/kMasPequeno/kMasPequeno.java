package kMasPequeno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class kMasPequeno extends EjercicioOIA
{
	//Complejidad log(n)
	//https://stackoverflow.com/questions/3390449/computational-complexity-of-treeset-operations-in-java
	private TreeSet<Integer> menores = new TreeSet<Integer>();
	private int cuantosMenores = 0;
	
	public kMasPequeno(String entrada, String salida) throws IOException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		sc.useLocale(Locale.ENGLISH);
		int hasta = sc.nextInt();
		cuantosMenores = sc.nextInt();
		for(int i = 0; i < hasta; i++)
			menores.add(sc.nextInt());
		sc.close();
		mostrarSalida();
	}

	private void mostrarSalida() throws IOException
	{
		PrintWriter salida = new PrintWriter(new FileWriter(this.salida));
		salida.println(cuantosMenores);
		for(int i = 0; i < cuantosMenores; i++)
			salida.println(menores.pollFirst());
		salida.close();
	}
	
	@Override
	public void resolver() 
	{
		//Lo resuelvo a medida que lo voy leyendo, asi que no necesito este metodo, sino anadiria mas complejidad.
	}

}
