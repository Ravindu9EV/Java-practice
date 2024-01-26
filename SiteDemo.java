public class SiteDemo{
	public static void main(String[] args){
		Item[] items = new Item[5];
		items[0] = new Cement(5.0);
		items[1] = new Stone(3.0);
		items[2] = new Sand(4.0);
		items[3] = new Cement(4.0);
		items[4] = new Sand(4.0);

		Site site = new Site(items);
		site.calculateCost();
	}

	
    
}