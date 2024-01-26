class Site implements IConstruction{
	public Item[] items;

	public Site(Item[] items){
		this.items=items;
	}

	public void calculateCost(){
		double tot=0;
		for(Item item : items){
			
			double subT=item.getCost()*item.getQuantity();
			System.out.println(item.displayItem()+"=> "+item.getCost()+"*"+item.getQuantity()+" = "+subT);
			tot+=subT;	
	}
	System.out.println("The total cost is: "+tot);
		
		
	
		
	}

		
		
}