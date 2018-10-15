
public class ClaveValor 
{
	public String clave;
	public int valor;
	public ClaveValor(String s, int i) 
	{
		this.clave = s;
		this.valor = i;
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaveValor other = (ClaveValor) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}
	
	public String toString()
	{
		return this.clave + " " + this.valor;
	}
}
