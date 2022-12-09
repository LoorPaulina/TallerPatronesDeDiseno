package ChainOfResponsability;

public class Client {
	public void solicitarCambio(Producto producto) {
		Attention atencion1=new UserAttention();
		Attention atencion2=new TechnicalDepartment();
		Attention atencion3=new InventoryDepartment();
		Attention atencion4=new Management();
		
		atencion1.doOperation(producto);
	}
}

