/* Program 7: Calculate profit or loss.
Write a program that takes the cost price and selling price (take it hardcoded) and
calculates its profit or loss
input1:
sellingPrice = 1200
costPrice = 1000
Output: profit of 200

input2:
sellingPrice = 300
costPrice = 500
Output: loss of 200

input3:
sellingPrice = 900
costPrice = 900
Output: ???      
*/

class ProfitLoss {

	public static void main(String[] args){

		double SellingPrice = 124.65;
		double CostPrice = 156.78;

		if(SellingPrice > CostPrice){
			System.out.println("Profit of " +(SellingPrice - CostPrice));
		}else if(CostPrice > SellingPrice){
			System.out.println("Loss of " +(CostPrice - SellingPrice));
		}else{
			System.out.println("No Loss or No Profit");
		}
	}
}
