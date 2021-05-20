package com.pluralsight.abstractfactory.ex2.validator;

import com.pluralsight.abstractfactory.ex2.card.CreditCard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
