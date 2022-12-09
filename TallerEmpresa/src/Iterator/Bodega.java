package Iterator;

import java.util.List;

//Hace referencia al almacenamiento de los productos 
public class Bodega implements Iterator{
	
	protected List<Producto> productos;
	
	public Bodega() {
		
	}
	
	public Bodega(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public IteradorProducto crearIterador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
