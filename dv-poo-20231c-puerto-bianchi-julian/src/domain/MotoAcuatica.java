package domain;

public class MotoAcuatica extends Barco {

	//Atributos
	private String tipo;
	private Double tarifa;
	
	//Constructor
	public MotoAcuatica(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tarifa = 25.00;
		this.tipo = "Moto Acuatica";
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
