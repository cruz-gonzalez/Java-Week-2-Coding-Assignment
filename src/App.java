
public class App {

	public static void main(String[] args) {
	
		//Step 2
		//Creating Boolean variables and choosing values
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		System.out.println("It is hot outside = " + isHotOutside);
		System.out.println("It is a weekday = " + isWeekday);
		System.out.println("I have money in my pocket = " + hasMoneyInPocket);
		
		//Step 3
		//Creating non-boolean variables and choosing data value
		double costOfMilk = 2.55;
		double moneyInWallet = 3.55;
		int thirstLevel = 3;
		
		System.out.println("The cost of milk is $" + costOfMilk);
		System.out.println("In my wallet I have $" + moneyInWallet);
		System.out.println("On a scale of 1-10 my current thirst level is a " + thirstLevel);
		
		//Step 4
		//Using the above variables and boolean operators, create scenarios
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2 * costOfMilk) );
		
		System.out.println(shouldBuyIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
	}

}
