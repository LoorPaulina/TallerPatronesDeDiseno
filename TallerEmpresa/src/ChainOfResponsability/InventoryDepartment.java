package ChainOfResponsability;

public class InventoryDepartment extends Attention {
	
	public void doOperation(Producto producto) {
		if((Inventory.productos.contains(producto))&&(producto.getCosto()>1000)){ //verifica que tenga el producto y cueste mas de 1000
			this.setNextApprover(nextApprover);
			this.nextApprover.doOperation(producto);
		}else if((Inventory.productos.contains(producto))&&(producto.getCosto()<1000)){
			System.out.println("El cambio ha sido aprobado");
		}else {
			System.out.println("El cambio no ha sido aprobado");
		}	
	}}
