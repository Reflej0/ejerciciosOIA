import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DescubriendoNombresRepetidos extends EjercicioOIA
{
	private String[] nombres;
	private int cantNombres;
	private int n;
	public DescubriendoNombresRepetidos(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		cantNombres = sc.nextInt();
		n = sc.nextInt();
		nombres = new String[cantNombres];
		for(int i = 0; i < cantNombres; i++)
			nombres[i] = sc.next();
		sc.close();
	}

	//Esta solucion es muchisimo mas entendible que la comentada mas abajo.
	@Override
	public void resolver() 
	{
		PrintWriter sal = null;
		try 
		{
			sal = new PrintWriter(new File(salida));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Ha ocurrido un error con el archivo de salida");
			System.exit(1);
		}
		ArrayList<ClaveValor> ninos = new ArrayList<ClaveValor>();
		//Este for es el for del archivo cuando voy leyendo los nombres.
		for(String s : nombres)
		{
			ClaveValor aux = new ClaveValor(s,1);
			if(ninos.contains(aux))
				ninos.get(ninos.indexOf(aux)).valor++;
			else
				ninos.add(aux);
		}
		//Ordeno las nombres de los ninos por repeticion.
		Collections.sort(ninos, new Comparator<Object>() {
		    @Override
		    public int compare(Object a1, Object a2) 
		    {
		        return ((ClaveValor)a2).valor-((ClaveValor)a1).valor;
		    }
		});
		
		for(int i = 0; i<n && i < ninos.size(); i++)
			sal.println(ninos.get(i));
	sal.close();
	}
	
	/*Complejidad O(n) + O(n*log(n)) + O(n^2) no ?*/
	/*public static void oldEjercicio(String [] nombres, int n)
	{
		HashMap<String, Integer> repeticiones = new HashMap<String, Integer>();
		//Complejidad es O(n), ya que la complejidad interna es O(1).
		for(String s : nombres)
		{
			//Complejidad get es O(1) 
			//https://www.geeksforgeeks.org/hashmap-treemap-java/
			Integer k = repeticiones.get(s);
			repeticiones.put(s, k==null?1:(k+1));
		}
		//Complejidad de obtener los valores del Hashmap O(n)
		//https://stackoverflow.com/questions/4577998/time-complexity-of-hashmap-methods
		List<Integer> Valores = new ArrayList<Integer>(repeticiones.values());
		//Complejidad total del sort es O(n*log(n))
		Collections.sort(Valores, Collections.reverseOrder());
		//Complejidad es O(n^2) por el for interno.
		for(int i = 0; i < n; i++)
			//Iterar el Hashmap buscando la clave que tiene dicho valor supongo que es O(n).
	        for (Entry<String, Integer> key : repeticiones.entrySet()) //Itero el TreeMap.
	            if (key.getValue().equals(Valores.get(i))) 
	                System.out.println(key.getKey() + " " + Valores.get(i));
	}*/
}
