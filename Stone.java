class Stone extends Item {
	double qtyInCubes;
	Stone(double qtyInCubes){
		this.qtyInCubes=qtyInCubes;
	}
	public String displayItem(){
		return "Stone";
	}
	public double getCost(){
		return 750.0;
	}
	public double getQuantity(){
		return qtyInCubes;
	}
}