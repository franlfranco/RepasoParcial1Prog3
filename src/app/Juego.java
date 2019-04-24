package app;

public class Juego extends Elemento{

	private double tiempoEstimado;
	private String compania;
	
	public Juego() {
		super();
		setTiempoEstimado(10);
		setCompania(" ");
	}
	
	public Juego(String titulo, double tiempoEstimado) {
		super();
		setTitulo(titulo);
		setTiempoEstimado(tiempoEstimado);
	}
	
	public Juego(String titulo, String genero, double tiempoEstimado, String compania) {
		super();
		setTitulo(titulo);
		setGenero(genero);
		setTiempoEstimado(tiempoEstimado);
		setCompania(compania);
	}
	
	public double getTiempoEstimado() {
		return tiempoEstimado;
	}
	
	public void setTiempoEstimado(double tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}
	
	public String getCompania() {
		return compania;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}

	public boolean compararTiempo(double tiempoEstimado) {
		if(tiempoEstimado == getTiempoEstimado()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Juego [tiempoEstimado=" + tiempoEstimado + ", compania=" + compania + "]";
	}
	
}
