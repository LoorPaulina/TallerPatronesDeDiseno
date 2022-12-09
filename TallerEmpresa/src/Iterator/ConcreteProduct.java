package Iterator;

//Esta clase hace referencia a un producto en especifico (tablet, celular, computador)
public class ConcreteProduct extends Producto {
	public int size;
	public boolean disponibleEnTienda;
	public boolean disponibleParaComprar;
	public boolean defectuoso;
	public boolean enReparacion;
	
	//Constructores
	public ConcreteProduct() {
		
	}
	
	public ConcreteProduct(int size, boolean disponibleEnTienda, boolean
			disponibleParaComprar, boolean defectuoso, boolean enReparacion) {
		super(descripcion,precio);
		this.size = size;
		this.disponibleEnTienda = disponibleEnTienda;
		this.disponibleParaComprar = disponibleParaComprar;
		this.defectuoso = defectuoso;
		this.enReparacion = enReparacion;
	}
	
	public ConcreteProduct(String descripcion, double precio) {
		super(descripcion, precio);
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean getDisponibleEnTienda() {
		return disponibleEnTienda;
	}
	
	public void setDisponibleEnTienda(boolean disponibleEnTienda) {
		this.disponibleEnTienda = disponibleEnTienda;
	}
	
	public boolean getDisponibleParaComprar() {
		return disponibleParaComprar;
	}
	
	public void setDisponibleParaComprar(boolean disponibleParaComprar) {
		this.disponibleParaComprar = disponibleParaComprar;
	}
	
	public boolean getDefectuoso() {
		return defectuoso;
	}
	
	public void setDefectuoso(boolean defectuoso) {
		this.defectuoso = defectuoso;
	}
	
	public boolean getEnReparacion() {
		return enReparacion;
	}
	
	public void setEnReparacion(boolean enReparacion) {
		this.enReparacion = enReparacion;
	}
}
