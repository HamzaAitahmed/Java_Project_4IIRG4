package pk2;

public class Livre
{
	private static final String Price = null;
	private String author;
	private String title;
	private double price;
	private double Nbr_page;
	
	public static int cpt_livre;
	
	public static int price_max;
	public static int price_min;


	@Override
	public String toString() {
		return "Livre [author=" + author + ", title=" + title + ", price=" + price + ", Nbr_page=" + Nbr_page + "]";
	}


	public Livre(String author, String title, int price, int nbr_page) {
		super();
		
		this.author = author;
		this.title = title;
		this.price = price;
		Nbr_page = nbr_page;
		
		cpt_livre++;
		
		if (cpt_livre == 1 ) {
			
			price_min=price_max=price;
			
		}
		
		else{
			if(price);
			
		}
		
		
	}
	
	
	 
		 
	 
	 
}


