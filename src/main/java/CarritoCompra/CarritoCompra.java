package CarritoCompra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Productos.Producto;

public class CarritoCompra {
	
	private List<Producto> items = new ArrayList() ;

	public CarritoCompra(List<Producto>items) {
		super();
		this.items = items;
	}
	
	public CarritoCompra() {
		super();
	}


	public double getBalance() {
		 double balance = 0;
		 for (Iterator i = items.iterator(); i.hasNext();) {
		 Producto item = (Producto)i.next();
		 balance += item.getPrecio();
		 }
		 return balance;
	}
	
	public void addItem(Producto item) {
		 items.add(item);
	 }

	 public void removeItem(Producto item) {
		 items.remove(item);
	 }

	 public int getItemCount() {
		 return items.size();
	 }

	 public void empty() {
		 items.clear();
	 }
}
