import java.util.*;
class Shipping_Cost{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter the weight of Ship: ");
	float weight = ob.nextFloat();
	if(weight>=1 && weight<=20)
	System.out.println("Cost of ship is "+cost(weight));
	else
	System.out.println("the package cannot be shipped");		
	}
	static double cost(float w){
		if(w>0 && w<=1)
			return 3.5;
		else if(w>1 && w<=5)
			return 5.0;
		else if(w>5 && w<=10)
			return 7.0;
		else if(w>10 && w<=20)
			return 10.5;
		else 
			return 0;
	}
}