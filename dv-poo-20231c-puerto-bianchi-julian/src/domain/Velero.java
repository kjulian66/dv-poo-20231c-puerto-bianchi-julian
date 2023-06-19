package domain;

public class Velero extends Barco {
	
	//Atributos
	private String tipo;
	private Double tarifa;
	
	//Constructor
	public Velero(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tarifa = 100.00;
		this.tipo = "Velero";
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
