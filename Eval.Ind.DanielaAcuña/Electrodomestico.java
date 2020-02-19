package ev_POO;
;

public class Electrodomestico {
	
	

	private float precio_base;
	private String color;
	private char consumo_en;
	private float peso;

	
	//por defecto
	
	protected final static int precio_def=100000;
	
	protected final static String COLOR_DEF="blanco";
	
	protected final static char consumo_def='F';
	
	protected final static  float peso_def=5.0f;
	
	
	
	
	

	
	
	
	public Electrodomestico(float precio_base, float peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
	}
	
	





	public Electrodomestico(float precio_base, String color, char consumo_en, float peso) {
		super();
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_en = consumo_en;
		this.peso = peso;
	}
	
	
// ***constructor por defecto***
	
	
	public Electrodomestico() {
		this(precio_def,COLOR_DEF,consumo_def,peso_def);
	}





	public float getPrecio_base() {
		return precio_base;
	}


	public void setPrecio_base(float precio_base) {
		this.precio_base = precio_base;
	}







	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public char getConsumo_en() {
		return consumo_en;
	}





	public void setConsumo_en(char consumo_en) {
		this.consumo_en = consumo_en;
	}





	public float getPeso() {
		return peso;
	}





	public void setPeso(float peso) {
		this.peso = peso;
	}





	public void comprobarConsumoEnergetico(char consumo) {
		
	
	if(consumo=='A') {
		
		setConsumo_en(consumo);	
	}
	if(consumo=='B') {
		
		setConsumo_en(consumo);	
	}
	
	if(consumo=='C') {
		
		setConsumo_en(consumo);		
	}
	
	if(consumo=='D') {
		
		setConsumo_en(consumo);	
	}
	
	if(consumo=='E') {
		
		setConsumo_en(consumo);
	}
	if(consumo=='F') {
		
		setConsumo_en(consumo);	
	}
	
	else {
		setConsumo_en(consumo_def);
	}
	
	}
	
	
	
	
	public void comprobarColor(String color_ent){
		
	if (color_ent== "blanco"){
		
		setColor(color_ent);
			
	}
		
	if (color_ent=="negro"  ){
		
		setColor(color_ent);
			
	}
		
	if (color_ent=="rojo"  ){
		
		setColor(color_ent);
			
	}
		
	if (color_ent=="azul"  ){
		
		setColor(color_ent);
			
	}
		
	if (color_ent=="gris" ){
		
		setColor(color_ent);
			
	}
	
	else {
		setColor(COLOR_DEF);
	}
	
		
	}
	
	
	
	
	
	public void precioFinal() {
		
		if(getPeso()>=0 && getPeso()<=19){
			
			setPrecio_base(precio_def+8500);
			
		}
		
		if(getPeso()>=20 && getPeso()<=49){
			setPrecio_base(precio_def+40000);
			
		}
		
		if(getPeso()>=50 && getPeso()<=79){
			
			setPrecio_base(precio_def+70000);
		}
		
		if(getPeso()>=80){
			
			setPrecio_base(precio_def+85000);
		}
		
		
		
		
		if(getConsumo_en()=='A') {
			
			setPrecio_base(getPrecio_base()+85000);	
		}
		
		if(getConsumo_en()=='B') {
			
			setPrecio_base(getPrecio_base()+70000);
		}
		if(getConsumo_en()=='C') {
			
			setPrecio_base(getPrecio_base()+50000);
				
		}
		if(getConsumo_en()=='D') {
			
			setPrecio_base(getPrecio_base()+40000);	
		}
		if(getConsumo_en()=='E') {
			
			setPrecio_base(getPrecio_base()+25000);
		}
		if(getConsumo_en()=='F') {
			
			setPrecio_base(getPrecio_base()+8500);
		}
			
	}
	

	
	
	
	
	
	
	
}
