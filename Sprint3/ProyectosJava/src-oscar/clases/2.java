public class Fuerte{
	public String nombreDelCampeon;
	public String listaDeFuertesContra;

	public Fuerte(){}
	public Fuerte(String nombreDelCampeon, String listaDeFuertesContra){
		this.nombreDelCampeon = nombreDelCampeon;
		this.listaDeFuertesContra = listaDeFuertesContra;
	}

	@Override
	public String toString(){
		return "Campeon: "+nombreDelCampeon+", Fuerte Contra: "+listaDeFuertesContra+;
	}

	public void volveracounters(){}
	public void verporcentajedevictoria(){}
}