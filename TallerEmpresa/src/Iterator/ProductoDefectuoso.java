package Iterator;

public class ProductoDefectuoso implements IteradorProducto {

	protected Bodega coleccion;
	protected Producto estadoIterador;
	
	public ProductoDefectuoso(Bodega coleccion) {
		this.coleccion = coleccion;
		this.estadoIterador = null;
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
