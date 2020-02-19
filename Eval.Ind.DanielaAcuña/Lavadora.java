package ev_POO;

public class Lavadora extends Electrodomestico {
	
	private float carga=5.0f;

	
	public Lavadora(){
		
		
	}
	
	public Lavadora(int precio_base, float peso) {
		
	}



	public Lavadora(int precio_base, String color, char consumo_en, float peso, float carga) {
		super(precio_base, color, consumo_en, peso);
		this.carga = carga;
		
	}
	
	
	
	

	public float getCarga() {
		return carga;
	}
	

	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	
	
	public void precioFinal(){
		
		if (getCarga()>30) {
			
			setPrecio_base(getPrecio_base()+40000);
			
		}
		
		else {
			setPrecio_base(getPrecio_base());
					
		}
		
		
		
	}
	

	
	
	
	

	
	
	
	
	
	
	

}
