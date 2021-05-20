package com.pluralsight.abstractfactory.ex2.factory;

import com.pluralsight.abstractfactory.ex2.card.CardType;
import com.pluralsight.abstractfactory.ex2.card.CreditCard;
import com.pluralsight.abstractfactory.ex2.card.VisaBlackCreditCard;
import com.pluralsight.abstractfactory.ex2.card.VisaGoldCreditCard;
import com.pluralsight.abstractfactory.ex2.validator.Validator;
import com.pluralsight.abstractfactory.ex2.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
