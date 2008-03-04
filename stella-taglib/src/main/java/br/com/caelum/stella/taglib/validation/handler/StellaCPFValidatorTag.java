package br.com.caelum.stella.taglib.validation.handler;

import javax.faces.validator.Validator;
import javax.faces.webapp.ValidatorELTag;
import javax.servlet.jsp.JspException;

import br.com.caelum.stella.faces.validation.StellaCPFValidator;

/**
 * 
 * This class associates a TLD with validator on StellaCPFValidator class.
 * 
 * @author Caires V.
 * 
 */
public class StellaCPFValidatorTag extends ValidatorELTag {

	@Override
	/**
	 * Creates a new validator, after that return validate method on
	 * StellaCPFValidator.
	 */
	protected Validator createValidator() throws JspException {
		return new StellaCPFValidator();
	}

}
