package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.CaesarsCipher;

class CaesarsCipherUnitTest {

	@Test
	void testEncodeMessage() {
		assertEquals("h`n fgevat dhnydhre", CaesarsCipher.caesarsCipher("uma string qualquer"));
	}
	
	@Test
	void testDecodeMessage() {
		assertEquals("uma string qualquer", CaesarsCipher.caesarsCipher("h`n fgevat dhnydhre"));
	}

}
