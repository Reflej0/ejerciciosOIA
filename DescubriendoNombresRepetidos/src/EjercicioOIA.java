public abstract class EjercicioOIA 
{
	protected String entrada;
	protected String salida;

	public EjercicioOIA(String entrada, String salida) 
	{
		this.entrada = entrada;
		this.salida = salida;
	}
	
	public abstract void resolver();
}