package br.com.codewars.exercises;

public class CaesarsCipher {
	
	public static String caesarsCipher(String code) {

		String decoded = "";
		int lastCharValue = 'z'; 	// 122
		int alphabetLength = 'z' - 'a' + 1; 	// 122 - 97 + 1 = 26
		int rotation = 13; 	// shift da Cifra de César

		// qualquer pontuação, exceto o espaço simples, também vai ser substituída por outro caracter, uma solução completa trataria esses outros casos
		for (char character: code.toCharArray()) {
			if(character != ' '){
				int charNoRotation = character + rotation;
				int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength; // tratamento caso extrapole o tamanho do alfabeto
				decoded += (char) charValue;
			} else {
				decoded += character;
			}
		}

		return decoded;
	}


}
