class Cement extends Item{
	private double qtyInCubes;
		
	public Cement(double qtyInCubes){
		this.qtyInCubes=qtyInCubes;
		
	}
	public String displayItem(){
		return "Cement";
	}
	public double getCost(){
		return 1000.0;
	}
	public double getQuantity(){
		return qtyInCubes;
	}

	
	
}