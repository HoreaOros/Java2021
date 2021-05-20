package com.pluralsight.abstractfactory.ex2.factory;

import com.pluralsight.abstractfactory.ex2.card.CardType;
import com.pluralsight.abstractfactory.ex2.card.CreditCard;
import com.pluralsight.abstractfactory.ex2.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
