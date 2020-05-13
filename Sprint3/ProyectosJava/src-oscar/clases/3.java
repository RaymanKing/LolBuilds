public class Debiles{
	public String nombreDelCampeon;
	public String listaDeDebilesContra;

	public Debiles(){}
	public Debiles(String nombreDelCampeon, String listaDeDebilesContra){
		this.nombreDelCampeon = nombreDelCampeon;
		this.listaDeDebilesContra = listaDeDebilesContra;
	}

	@Override
	public String toString(){
		return "Campeon: "+nombreDelCampeon+", Fuerte Contra: "+listaDeDebilesContra+;
	}

	public void volveracounters(){}
	public void verporcentajedevictoria(){}
}