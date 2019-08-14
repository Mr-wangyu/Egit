package com.rock;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	 private SpellChecker spellChecker;
	
	   // a setter method to inject the dependency.
		
	  
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
