import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class PaisesLimitrofes extends EjercicioOIA
{;
	private int limitrofes[][];
	private ArrayList<String> paises = new ArrayList<String>();
	private int cantPaises;
	
	public PaisesLimitrofes(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(this.entrada));
		sc.useLocale(Locale.ENGLISH);
		//Salteo el numero.
		sc.nextInt();
		//Primero detecto todos los paises del archivo y los almaceno en un ArrayList.
		while(sc.hasNext())
		{
			String aux = sc.next();
			if(!paises.contains(aux))
				paises.add(aux);
		}
		sc.close();
		//Inicializo la matriz.
		this.cantPaises = paises.size();
		this.limitrofes = new int[this.cantPaises][this.cantPaises];
		//Vuelvo a abrir el archivo, para anadir los limitrofes esta vez.
		sc = new Scanner(new File(this.entrada));
		int lineas = sc.nextInt();
		//Voy asignando los limitrofes.
		for(int i = 0; i < lineas ; i++)
		{
			String pais1 = sc.next();
			String pais2 = sc.next();
			int indice1 = paises.indexOf(pais1);
			int indice2 = paises.indexOf(pais2);
			limitrofes[indice1][indice2]++;
			limitrofes[indice2][indice1]++;
		}
		sc.close();
	}

	@Override
	public void resolver() 
	{
		this.mostrarLimitrofes();
		this.mostrarTransLimitrofes();
	}
	
	private void mostrarLimitrofes()
	{
		//FIX, porque al hacer el Collections.Sort pierdo los indices del vector con respecto a los de la matriz.
		ArrayList<PaisSalida> paisesSalida = new ArrayList<PaisSalida>();
		
		for(int i = 0; i < this.cantPaises; i++)
		{
			int limitantes = 0;
				for(int j = 0; j <this.cantPaises; j++)
					limitantes+=limitrofes[i][j];
				paisesSalida.add(new PaisSalida(paises.get(i), limitantes));
		}
		
		Collections.sort(paisesSalida, new Comparator<Object>() {
		    @Override
		    public int compare(Object s1, Object s2) {
		        return ((PaisSalida)s1).nombre.compareToIgnoreCase(((PaisSalida)s2).nombre);
		    }
		});
		
		for(int i = 0; i <paisesSalida.size(); i++)
			System.out.println(paisesSalida.get(i).nombre+" "+paisesSalida.get(i).limitrofes);
	}
	
	/*El problema principal, es que tengo paises candidatos a Translimitrofes,
	* pero revisar cual de esos candidatos realmente es translimitrofes es costoso
	* al menos de esta manera.
	*/
	private void mostrarTransLimitrofes()
	{
		//Aca examino cuales paises son posibles translimitrofes.
		ArrayList<Posicion> paisesQuizaTranslimitrofes = new ArrayList<Posicion>();
		for(int i = 0; i < this.cantPaises; i++)
			for(int j = 0; j < this.cantPaises; j++)
				if(i!=j && limitrofes[i][j] == 0)
					paisesQuizaTranslimitrofes.add(new Posicion(i, j));
		//En este punto puedo evaluar si existen candidatos a Translimitrofes.
		if(paisesQuizaTranslimitrofes.size() == 0)
		{
			System.out.println("No hay paises translimitrofes");
			return;
		}
		//Saco los repetidos tipo Brasil Chile o Chile Brasil, dejando solo uno.
		for(int i = 0; i < paisesQuizaTranslimitrofes.size(); i++)
		{
			for(int j = 0; j < paisesQuizaTranslimitrofes.size(); j++)
			{
				if(paisesQuizaTranslimitrofes.get(i).equals(paisesQuizaTranslimitrofes.get(j)))
				{
					paisesQuizaTranslimitrofes.remove(j);
					break;
				}
			}
		}
		//Aca es donde compruebo cuales realmente son translimitrofes.
		int escapar = 0;
		for(int i = 0; i < paisesQuizaTranslimitrofes.size(); i++)
		{
			Posicion aux = paisesQuizaTranslimitrofes.get(i);
			escapar = 0;
			for(int j = 0; j < paises.size(); j++)
			{
				if(limitrofes[aux.x][j] != 0)
				{
					for(int k = 0; k < paises.size(); k++)
					{
						if(limitrofes[j][aux.y]!=0 && limitrofes[k][aux.y] != 0 && escapar == 0)
						{
							System.out.println(paises.get(aux.x) +" " + paises.get(aux.y));
							escapar++;
						}
					}
				}
			}
		}
	}
	
}
