package co.gc.space.user;

public enum CreditCard {

	MASTERCARD("^([5]{1})([1-5]{1})[0-9]{14}", "^([0-9]{3})"), VISA("^([4]{1})([0-9]{13})", "^([0-9]{3})"),
	DISCOVER("^([6011]{4})([0-9]{12})", "^([0-9]{3})"), AMEX("^([3]{1})([47]{1})([0-9]{13})", "^([0-9]{4})");

	private final String cardRegex;
	private final String cvvRegex;

	private CreditCard(String cardRegex, String cvvRegex) {
		this.cardRegex = cardRegex;
		this.cvvRegex = cvvRegex;
		
	}

	public static String getMatchingCreditCard(String creditcard, String cvv) {
		String cardCompany = null;

		
		if (creditcard.matches(MASTERCARD.cardRegex) && cvv.matches(MASTERCARD.cvvRegex)) {
			cardCompany = "MasterCard";
		} else if (creditcard.matches(VISA.cardRegex) && cvv.matches(VISA.cvvRegex)) {
			cardCompany = "Visa";
		} else if (creditcard.matches(DISCOVER.cardRegex) && cvv.matches(DISCOVER.cvvRegex)) {
			cardCompany = "Discover";
		} else if (creditcard.matches(AMEX.cardRegex) && cvv.matches(AMEX.cvvRegex)) {
			cardCompany = "American Express";
		}
		return cardCompany;
	}
}