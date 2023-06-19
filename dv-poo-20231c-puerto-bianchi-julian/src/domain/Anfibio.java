package domain;

public class Anfibio extends Barco implements TipoAnfibio {
	
	//Atributos
	private String tipo;
	private Double tarifa;
	private Integer cantidadRuedas;
	private Integer velocidadTierra;
	
	//Constructores	
	public Anfibio(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion);
		this.tipo = "Anfibio";
		this.tarifa = 175.00;
		this.cantidadRuedas = 3;
		this.velocidadTierra = 140;
	}
	
	//Getters & Setters
	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public Integer getVelocidadTierra() {
		return velocidadTierra;
	}

	public void setVelocidadTierra(Integer velocidadTierra) {
		this.velocidadTierra = velocidadTierra;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public Integer velocidadTierra() {
		return this.velocidadTierra;
	}

	@Override
	public Double getTarifa() {
		return this.tarifa;
	}
	
	//Metodos
	
	@Override
	public Integer cantidadRuedas() {
		return this.cantidadRuedas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
