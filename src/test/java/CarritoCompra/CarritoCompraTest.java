package CarritoCompra;

import junit.framework.Test;

import com.Productos.Producto;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CarritoCompraTest extends TestCase {
	
	private CarritoCompra carrito1;
	private Producto prod1;
	
	public static Test suite() {
		 TestSuite suite = new TestSuite(CarritoCompraTest.class);
		 return (Test) suite;
	}

	@Override
	public void setUp() throws Exception {
		carrito1 = new CarritoCompra();

		prod1 = new Producto("P001", "Notebook Lenovo L340 15,6'", 
					"Notebook Gamer Lenovo L340 15,6' Core i5 + 9300H 8GB 1TB + 256NVMe GTX 1050 #GB Win 10", 92.416);
		 
		 carrito1.addItem(prod1);
	}

	@Override
	public void tearDown() throws Exception {
		carrito1 = null;
		prod1 = null; 
	}

	public void testGetBalance() {
		double expResult = 92.416;
		double result = carrito1.getBalance();
		assertEquals(expResult, result);
	 }
	
	 public void testGetItemCount() {
	 int expResult = 1;
	 int result = carrito1.getItemCount();
	 assertEquals(expResult, result);
	 }

	 public void testRemoverItem() {
	 carrito1.removeItem(prod1);
	 assertEquals(0, carrito1.getItemCount());
	 }

}
