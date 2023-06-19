package domain;

public class Alquiler {
	
	//Atributos
	private Cliente cliente;
	private Amarre amarre;
	private Barco barco;
	private Integer diaInicial;
	private Integer diaFinal;
	private Boolean estado;
	
	//Constructor
	public Alquiler(Cliente cliente, Amarre amarre, Barco barco) {
		this.cliente = cliente;
		this.amarre = amarre;
		this.barco = barco;
		this.diaInicial = 0;
		this.diaFinal = null;
		this.estado = null;
	}
	
	//Getters & Setters 
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Amarre getAmarre() {
		return amarre;
	}
	
	public void setAmarre(Amarre amarre) {
		this.amarre = amarre;
	}
	
	public Barco getBarco() {
		return barco;
	}
	
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	public Integer getDiaInicial() {
		return diaInicial;
	}
	
	public void setDiaInicial(Integer diaInicial) {
		this.diaInicial = diaInicial;
	}
	
	public Integer getDiaFinal() {
		return diaFinal;
	}
	
	public void setDiaFinal(Integer diaFinal) {
		this.diaFinal = diaFinal;
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	//Metodos
	public void iniciarAlquiler() {
		amarre.ocuparAmarre();
		setEstado(true);
	}
	
	public void finalizarAlquiler(Integer diaFinal) {
		amarre.desoucparAmarre();
		setDiaFinal(diaFinal);
		setEstado(false);
		System.out.println("Alquiler del amarre " + amarre.getIdAmarre() + " finalizado \n"
							+ "El cliente " + getCliente().getNombre() + " " + getCliente().getApellido() + " debe pagar: $" + calcularPrecio());
	}
	
	public Double calcularPrecio() {
		Double precio = 0.0;
		if(diaFinal != null) {
			precio = diaFinal * this.barco.getTarifa();
		}
		return precio;
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", amarre=" + amarre + ", barco=" + barco + ", diaInicial=" + diaInicial
				+ ", diaFinal=" + diaFinal + ", estado=" + estado + "]";
	}
	
	

}
