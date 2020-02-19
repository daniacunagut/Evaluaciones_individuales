package ev_POO;





public class Television extends Electrodomestico{
		
	private float resol;
	private boolean sint_TDT;
	
	protected final static float resol_def=20.0f;
	protected final static boolean sint_TDT_def=false;
	
	


	public Television(float resol, boolean sint_TDT,float precio_base, String color, char consumo_en, float peso) {
		super(precio_base, color, consumo_en, peso);
		this.resol = resol;
		this.sint_TDT = sint_TDT;
		
		
	}
	
	//CONSTRUCTOR VALORES POR DEFECTO
	
	
	public Television(float resol,boolean sint_TDT) {
		
		resol=resol_def;
		sint_TDT=sint_TDT_def;
		
		
		
	}
	
	
	
	
	
	
	//METODOS GET


	public float getResol() {
		return resol;
	}


	public void setResol(float resol) {
		this.resol = resol;
	}


	public boolean isSint_TDT() {
		return sint_TDT;
	}


	public void setSint_TDT(boolean sint_TDT) {
		this.sint_TDT = sint_TDT;
	}

	
	public void precioFinal() {
		
		if (resol>40) {
			setPrecio_base((float)(getPrecio_base()*1.30));
			
		}
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
