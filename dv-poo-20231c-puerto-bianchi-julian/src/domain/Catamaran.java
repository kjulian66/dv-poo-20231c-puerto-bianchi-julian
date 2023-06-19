package domain;

public class Catamaran extends Barco {

	//Atributos
	private String tipo;
	private Double tarifa;
	
	//Constructor
	public Catamaran(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tarifa = 150.00;
		this.tipo = "Catamaran";
	}

	//Metodos
	@Override
	public Double getTarifa() {
		return this.tarifa;
	}
	
	@Override
	public String getTipo() {
		return this.tipo;
	}
}
