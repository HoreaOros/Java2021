package com.pluralsight.abstractfactory.ex2.factory;

import com.pluralsight.abstractfactory.ex2.card.AmexGoldCreditCard;
import com.pluralsight.abstractfactory.ex2.card.AmexPlatinumCreditCard;
import com.pluralsight.abstractfactory.ex2.card.CardType;
import com.pluralsight.abstractfactory.ex2.card.CreditCard;
import com.pluralsight.abstractfactory.ex2.validator.AmexGoldValidator;
import com.pluralsight.abstractfactory.ex2.validator.AmexPlatinumValidator;
import com.pluralsight.abstractfactory.ex2.validator.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();
				
			default:
				break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				
				return new AmexGoldValidator();
	
			case PLATINUM:
				
				return new AmexPlatinumValidator();
		
		}
		
		return null;
	}
}
