public class Counters{
	public String Campeones;
	public String FuerteContra;
	public String DebilContra;

	public Counters(){}
	public Counters(String campeones, String fuerteContra, String debilContra){
		this.campeones = campeones;
		this.fuerteContra = fuerteContra;
		this.debilContra = debilContra;
	}

	@Override
	public String toString(){
		return "Campeones: "+campeones+", Fuerte Contra: "+fuerteContra+", Debil contra: "+debilContra;
	}

	public void vercampeonesfuertes(){}
	public void vercampeonesdebiles(){}
}