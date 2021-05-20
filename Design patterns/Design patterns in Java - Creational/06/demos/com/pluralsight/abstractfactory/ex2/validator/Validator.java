package com.pluralsight.abstractfactory.ex2.validator;

import com.pluralsight.abstractfactory.ex2.card.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
