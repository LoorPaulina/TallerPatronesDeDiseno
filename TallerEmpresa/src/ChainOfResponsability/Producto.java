package ChainOfResponsability;
import java.util.*;

public class Producto {
	private String cod;
	private float costo;
	private int garantia;
	private ArrayList<String> cubreGarantia;
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public ArrayList<String> getCubreGarantia() {
		return cubreGarantia;
	}
	public void setCubreGarantia(ArrayList<String> cubreGarantia) {
		this.cubreGarantia = cubreGarantia;
	}
}

