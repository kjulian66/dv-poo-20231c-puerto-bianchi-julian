package domain;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
	
	//Atributos
	private List <Amarre> Amarres;
	private List <Alquiler> Alquileres;
	
	//Constructor
	public Puerto() {
		Amarres = new ArrayList<>();
		Alquileres = new ArrayList<>();
	}
	
	//Metodos
	public void addAmarre (Amarre amarre) {
		Amarres.add(amarre);
	}
	
	public void addAlquiler (Alquiler alquiler) {
		Alquileres.add(alquiler);
	}
	
	public Integer cantidadAmarres() {
		Integer contador = 0;
		for (Amarre amarres : Amarres) {
			contador += 1;
		}
		return contador;
	}
	
	public Integer cantidadAmarresDisponibles() {
		Integer contador = 0;
		for (Amarre amarres : Amarres) {
			if (amarres.getEstado()) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public Integer cantidadAmarresOcupados() {
		Integer contador = 0;
		for (Amarre amarres : Amarres) {
			if (amarres.getEstado() != null && amarres.getEstado() != true) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public void listarAmarres() {
		for (Amarre amarres : Amarres) {
			if (amarres.getEstado()) {
				System.out.println("Amarre: " + amarres.getPosicion() + "\n" + 
									"Estado: Ocupado \n"
									);
			} else {
				System.out.println("Amarre: " + amarres.getPosicion() + "\n" + 
						"Estado: Disponible \n"
						);
			}
		}
	}
	
	public Integer cantidadAlquileresRealizados() {
		Integer contador = 0;
		for (Alquiler alquileres : Alquileres) {
			contador += 1;
		}
		return contador;
	}
	
	public Integer cantidadAlquileresEnCurso() {
		Integer contador = 0;
		for (Alquiler alquileres : Alquileres) {
			if (alquileres.getEstado() == true) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public void listarAlquileresEnCurso() {
		for (Alquiler alquileres : Alquileres) {
			if (alquileres.getEstado() == true) {
				if (alquileres.getBarco() instanceof Anfibio) {
					Anfibio anfibio = (Anfibio) alquileres.getBarco();
					System.out.println("Amarre: " + alquileres.getAmarre().getPosicion() + "\n" + 
					"Tipo Barco: " + anfibio.getTipo() + "\n" +
					"Eslora: " + anfibio.getEslora() + "\n" +
					"Fabricacion: " + anfibio.getAnioFabricacion() + "\n" +
					"Matricula: " + anfibio.getMatricula() + "\n" + 
					"Anfibio: SI" + "\n" + 
					"Cantidad de Ruedas: " + anfibio.getCantidadRuedas() + "\n" + 
					"Velocidad en Tierra: " + anfibio.getVelocidadTierra() + "\n" + 
					"------------------------------------------------------------------------------"
					);
				} else {
					System.out.println("Amarre: " + alquileres.getAmarre().getPosicion() + "\n" + 
					"Tipo Barco: " + alquileres.getBarco().getTipo() + "\n" +
					"Eslora: " + alquileres.getBarco().getEslora() + "\n" +
					"Fabricacion: " + alquileres.getBarco().getAnioFabricacion() + "\n" +
					"Matricula: " + alquileres.getBarco().getMatricula() + "\n" + 
					"Anfibio: NO" + "\n" + 
					"------------------------------------------------------------------------------"
					);
				}

			};
		}
	}
	
	@Override
	public String toString() {
		return "Puerto [Amarres=" + Amarres + ", Alquileres=" + Alquileres + "]";
	}
	
}
