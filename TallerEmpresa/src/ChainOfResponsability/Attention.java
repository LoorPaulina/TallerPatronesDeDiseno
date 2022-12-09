package ChainOfResponsability;

public abstract class Attention {
	public Attention nextApprover;
	/**
	 * 
	 * @param producto
	 */
	public void doOperation(Producto producto) {
	}

	public void setNextApprover(Attention next) {
		this.nextApprover=next;
	}

	public Attention getNextApprover() {
		return this.nextApprover;
	}
}



