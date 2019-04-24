package app;

public class Pelicula extends Elemento {

	private double duracion;
	private String creador;
	
	public Pelicula() {
		super();
		setDuracion(60);
		setCreador(" ");
	}

	public Pelicula(String titulo, String creador) {
		super();
		setTitulo(titulo);
		setDuracion(60);
		setCreador(" ");
	}
	
	public Pelicula(String titulo, String genero, double duracion, String creador) {
		super();
		setTitulo(titulo);
		setGenero(genero);
		setDuracion(duracion);
		setCreador(creador);
	}
	
	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Pelicula [duracion=" + duracion + ", creador=" + creador + "]";
	}
	
	public boolean compararTiempo(double duracion) {
		if(duracion == getDuracion()) {
			return true;
		} else {
			return false;
		}
	}
}
