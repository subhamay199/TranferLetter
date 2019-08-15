package clothing.pants;

import static clothing.Shirt.getColor;

public class Jeans  {
	public void matchShirt() {
		String color=getColor();
		if(color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeans trouser=new Jeans();
		trouser.matchShirt();
	}

}
