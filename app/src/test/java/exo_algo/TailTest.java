package exo_algo;

import exo_algo.Fixture.FileFixture;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Tail est une commande UNIX qui permet d’afficher les x dernières lignes de texte d’un fichier.
Trouve un algorithme qui permet de coder cette fonctionnalité.
 */

public class TailTest {
	private final Tail tail;

	public TailTest() {
		this.tail = new Tail();
	}

	@Test
	public void shouldReturn_HelloWorld_When_linesToTailEq1(){

		//Given
		String text = "HelloWorld";
		int linesToTail=1;

		//When
		String result = tail.execute(text, linesToTail);

		//Then
		assertEquals(1,tail.numberOfLines(text));
		assertEquals("HelloWorld", tail.getTailedString(text, 1));
		assertEquals("HelloWorld", result);
	}

	@Test
	public void shouldReturn_TwoLines_When_linesToTailEq2(){
		//Given
		String text = FileFixture.basic;
		int linesToTail=1;

		//When
		String result = tail.execute(text, linesToTail);

		//Then
		String expected="""
                Ceci est un texte
                HelloWorld""";
		assertEquals(3,tail.numberOfLines(text));
		assertEquals("HelloWorld", tail.getTailedString(text, 3));
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturn_ThreeLines_When_linesToTailEq3AndEnglishFile(){
		//Given
		String text = FileFixture.basic;
		int linesToTail=1;

		//When
		String result = tail.execute(text, linesToTail);

		//Then
		String expected="""
                Ceci est un texte
                HelloWorld""";
		assertEquals(3,tail.numberOfLines(text));
		assertEquals("HelloWorld", tail.getTailedString(text, 3));
		assertEquals(expected, result);
	}



}
