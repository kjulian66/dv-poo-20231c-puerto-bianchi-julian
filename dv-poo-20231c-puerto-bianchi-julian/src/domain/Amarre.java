package domain;

import java.util.Objects;

public class Amarre {
	
	//Atributos
	private Integer idAmarre;
	private Integer posicion;
	private Boolean estado;
	
	//Constructor 
	public Amarre(Integer idAmarre, Integer posicion) {
		this.idAmarre = idAmarre;
		this.posicion = posicion;
		this.estado = null;
	}
	
	// Getters & Setters
	public Integer getIdAmarre() {
		return idAmarre;
	}

	public void setIdAmarre(Integer idAmarre) {
		this.idAmarre = idAmarre;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	//Metodos
	public void ocuparAmarre() {
		setEstado(true);
	}
	
	public void desoucparAmarre() {
		setEstado(false);
	}

	@Override
	public String toString() {
		return "Amarre [idAmarre=" + idAmarre + ", posicion=" + posicion + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAmarre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return Objects.equals(idAmarre, other.idAmarre);
	}
	
	

}
