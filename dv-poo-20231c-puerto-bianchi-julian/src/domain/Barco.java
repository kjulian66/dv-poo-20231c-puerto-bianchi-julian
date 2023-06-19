package domain;

public abstract class Barco {
	
	//Atributos
	private String tipo;
	private String matricula;
	private Double eslora;
	private Integer anioFabricacion;
	private Double tarifa;
	
	//Constructor
	public Barco(String matricula, Double eslora, Integer anioFabricacion) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
	}
	
	//Getters & Setters
	public abstract String getTipo();
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getEslora() {
		return eslora;
	}
	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}
	public Integer getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(Integer anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
	public abstract Double getTarifa();
	
	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	
}
