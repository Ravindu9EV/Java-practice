class Sand extends Item{
	double qtyInCubes;
	Sand(double qtyInCubes){
		this.qtyInCubes=qtyInCubes;}
	public String displayItem(){
		return "Sand";
	}
	public double getCost(){
		return 850.0;
	}
	public double getQuantity(){
		return qtyInCubes;
	}
}