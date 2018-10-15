import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Tests 
{
	@Test
	public void TestEjemplo() 
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(4, 5));
		mesas.add(new Mesa(9, 3));
		mesas.add(new Mesa(2, 2));
		mesas.add(new Mesa(1, 2));
		mesas.add(new Mesa(1, 12));
		mesas.add(new Mesa(2, 7));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(3, pilasmesadas);
	}
	
	@Test
	public void TestMio1()
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(1, 1));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(1, pilasmesadas);
	}
	
	@Test
	public void TestMio2()
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(9, 9));
		mesas.add(new Mesa(7, 1));
		mesas.add(new Mesa(8, 7));
		mesas.add(new Mesa(13, 2));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(2, 8));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(2, pilasmesadas);
	}
	
	@Test
	public void TestMio3()
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(1, 2));
		mesas.add(new Mesa(2, 2));
		mesas.add(new Mesa(9, 9));
		mesas.add(new Mesa(1, 1));
		mesas.add(new Mesa(7 ,7));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(1, pilasmesadas);
	}
	
	@Test
	public void TestProfe()
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(10, 6));
		mesas.add(new Mesa(10, 8));
		mesas.add(new Mesa(11, 9));
		mesas.add(new Mesa(12, 8));
		mesas.add(new Mesa(14, 9));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(2, pilasmesadas);
	}
	
	@Test
	public void TestProfe2()
	{
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(2, 1));
		mesas.add(new Mesa(3, 1));
		mesas.add(new Mesa(2, 2));
		mesas.add(new Mesa(12, 1));
		mesas.add(new Mesa(7, 2));
		mesas.add(new Mesa(5, 4));
		mesas.add(new Mesa(9, 3));
		int pilasmesadas = MesasGranito.doEjercicio(mesas);
		Assert.assertEquals(3, pilasmesadas);
	}
}
