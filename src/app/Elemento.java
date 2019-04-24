package app;

public class Elemento {

	private String titulo;
	private boolean entregado;
	private String genero;
	
	public Elemento() {
		setTitulo(" ");
		this.entregado = false;
		setGenero(" ");
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean isEntregado() {
		if(entregado) {
			return true;
		} else {
			return false;
		}
	}
	
	public void entregar() {
		if(!isEntregado()) {
			this.entregado = true;
		} 
	}
	
	public void devolver() {
		if(isEntregado()) {
			this.entregado = false;
		}
	}
	
	public boolean compararTitulo(String titulo) {
		if(titulo.equals(getTitulo())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Elemento [titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + "]";
	}

}
