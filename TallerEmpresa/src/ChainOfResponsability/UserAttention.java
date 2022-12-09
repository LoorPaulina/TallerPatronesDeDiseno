package ChainOfResponsability;

public class UserAttention extends Attention {
	public void doOperation(Producto producto) {
		if(producto.getGarantia()<=2022) { //verifica que este dentro de la garantia
			this.setNextApprover(nextApprover);
			this.nextApprover.doOperation(producto);
		}else{
			System.out.println("El producto se encuentra fuera del periodo de garantia");
		}

}}


