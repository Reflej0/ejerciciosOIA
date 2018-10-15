package aCorrer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class aCorrer extends EjercicioOIA
{
	private int cantidadCorredores;
	private int cantidadCatFem;
	private int cantidadCatMas;
	private int cantLlegaron;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Corredor> corredores = new ArrayList<Corredor>();
	private ArrayList<Integer> llegaron = new ArrayList<Integer>();
	private ArrayList<ArrayList<Integer>> ganadores;
	
	public aCorrer(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		sc.useLocale(Locale.ENGLISH);
		//Leo los 4 primeros numeros de la primera linea.;
		this.cantidadCorredores = sc.nextInt();
		this.cantidadCatFem = sc.nextInt();
		this.cantidadCatMas = sc.nextInt();
		this.cantLlegaron = sc.nextInt();
		//Leo las categorias
		for(int i = 0; i < cantidadCatFem+cantidadCatMas; i++)
			categorias.add(new Categoria(sc.nextInt(), sc.nextInt()));
		//Leo los corredores.
		for(int i = 0; i < cantidadCorredores; i++)
			corredores.add(new Corredor(sc.nextInt(), sc.next().charAt(0)));
		//Leo los que llegaron.
		for(int i = 0; i < cantLlegaron; i++)
			llegaron.add(sc.nextInt());
		//Inicializo el arrayList de ganadores con la cantidad de categorias totales.
		ganadores = new ArrayList<ArrayList<Integer>>(cantidadCatFem+cantidadCatMas);
		for(int i = 0; i < cantidadCatFem+cantidadCatMas; i++)
			ganadores.add(new ArrayList<Integer>());
		sc.close();
	}

	@Override
	public void resolver() 
	{
		for(int i = 0; i < cantLlegaron; i++)
		{
			//Obtengo la edad y el sexo del corredor.
			Corredor aux = corredores.get(llegaron.get(i)-1);
			if(aux.sexo == 'F')
			{
				for(int j = 0; j < cantidadCatFem; j++)
				{
					if(categorias.get(j).piso <= aux.edad && categorias.get(j).techo >= aux.edad)
					{
						ganadores.get(j).add(llegaron.get(i));
						break; // Mas optimo.
					}
						
				}
			}
			else
			{
				for(int j = cantidadCatFem; j < cantidadCatFem+cantidadCatMas; j++)
				{
					if(categorias.get(j).piso <= aux.edad && categorias.get(j).techo >= aux.edad)
					{
						ganadores.get(j).add(llegaron.get(i));
						break; // Mas optimo.
					}
				}
			}
		}
		this.imprimirSalida();
	}
	
	private void imprimirSalida()
	{

		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(this.salida));
			for(int i = 0; i < cantidadCatFem+cantidadCatMas; i++)
			{
				if(i < cantidadCatFem)
					salida.print(i+1);
				else
					salida.print(i+1-cantidadCatFem);
				for(int j = 0; j < 3; j++)
				{
					if(j+1 > ganadores.get(i).size())
						salida.print(" " + 0 + " ");
					else
						salida.print(" " + ganadores.get(i).get(j) + " ");
				}
				salida.println();
			}
			salida.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Ha ocurrido un error con el archivo de salida");
			System.exit(1);
		}
	}

}
