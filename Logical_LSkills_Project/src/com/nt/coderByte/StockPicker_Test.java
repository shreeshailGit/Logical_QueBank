package com.nt.coderByte;

public class StockPicker_Test {

	public static void main(String[] args) {
		int[] arr = {45, 24, 35, 31, 40, 38, 11};
        int n = arr.length;
		 
		int max_profit = -1;
		int buy_price = 0;
		int sell_price = 0;
		boolean change_buy_index = true;
		
		for(int i=0; i<n-1; i++) {
			
			sell_price = arr[i+1];
			
			if(change_buy_index) {  buy_price = arr[i]; }
          
			if(sell_price < buy_price) {
				change_buy_index = true;
				continue;
			}else {
				int temp_profit = sell_price - buy_price;
				if(temp_profit > max_profit) {
					max_profit = temp_profit;
				}
				
				change_buy_index = false;
			}
			
			
		}//for
		 
		System.out.println("Maximum Profit ="+max_profit);
		//https://coderbyte.com/editor/sharing:RTS-Gn32Ec5Ji
	}

}
