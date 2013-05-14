
public class CoinSums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int combinationTotal = 0;
		
		for(int onePence = 200; onePence >= 0; onePence--) {
			for(int twoPence = 100; twoPence >= 0; twoPence--) {
				for(int fivePence = 40; fivePence >= 0; fivePence--) {
					for(int tenPence = 20; tenPence >= 0; tenPence--) {
						for(int twentyPence = 10; twentyPence >= 0; twentyPence--) {
							for(int fiftyPence = 4; fiftyPence >= 0; fiftyPence--) {
								for(int pound = 2; pound >= 0; pound--){
									for(int twoPound = 1; twoPound >= 0; twoPound--) {
										if(onePence + (twoPence * 2) + (fivePence * 5) + 
												(tenPence * 10) + (twentyPence * 20) + 
												(fiftyPence * 50) + (pound * 100) + 
												(twoPound * 200) == 200) {
											combinationTotal++;
										}
									} // end twoPound for
								} //end pound for
							} // end fifty pence for
						} // end twenty pence for
					} // end ten pence for
				} // end five pence for
			} // end two pence for
		} // end one pence for
		System.out.println("Two pounds can be created " + combinationTotal + " ways.");
	}

}
