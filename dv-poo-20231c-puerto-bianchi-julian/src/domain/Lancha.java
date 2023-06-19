package domain;

public class Lancha extends Barco {

	//Atributos
	private String tipo;
	private Double tarifa;
	
	//Constructor
	public Lancha(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tarifa = 50.00;
		this.tipo = "Lancha";
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
