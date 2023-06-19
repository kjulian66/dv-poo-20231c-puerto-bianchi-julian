package domain;

public class Yate extends Barco {

	//Atributos
	private String tipo;
	private Double tarifa;
	
	//Constructor
	public Yate(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tarifa = 200.00;
		this.tipo = "Yate";
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
