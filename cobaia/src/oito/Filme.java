package oito;

public class Filme {

	private String titulo;
	private String tituloOriginal;
	private int ano;
	private int duracao;
	private double avaliacao;
	private int avaliadores;

	
	
	public Filme(String titulo, String tituloOriginal, int ano,
			int duracao, double avaliacao, int avaliadores) {
		super();
		this.titulo = titulo;
		this.tituloOriginal = tituloOriginal;
		this.ano = ano;
		this.duracao = duracao;
		this.avaliacao = avaliacao;
		this.avaliadores = avaliadores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getAvaliadores() {
		return avaliadores;
	}

	public void setAvaliadores(int avaliadores) {
		this.avaliadores = avaliadores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((tituloOriginal == null) ? 0 : tituloOriginal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (tituloOriginal == null) {
			if (other.tituloOriginal != null)
				return false;
		} else if (!tituloOriginal.equals(other.tituloOriginal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", tituloOriginal=" + tituloOriginal
				+ ", ano=" + ano + ", duracao=" + duracao + ", avaliacao="
				+ avaliacao + ", avaliadores=" + avaliadores + "]";
	}

}
