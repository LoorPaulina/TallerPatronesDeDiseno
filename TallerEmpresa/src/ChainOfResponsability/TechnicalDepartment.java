package ChainOfResponsability;

public class TechnicalDepartment extends Attention {
	public void doOperation(Producto producto) {
		String fallo;
		if((producto.getCubreGarantia().contains(fallo))){ //verifica que el fallo este dentro de la garantia
			this.setNextApprover(nextApprover);
			this.nextApprover.doOperation(producto);
		}else{
			System.out.println("El fallo del producto se encuentra fuera de la garantia");
		}}
}




