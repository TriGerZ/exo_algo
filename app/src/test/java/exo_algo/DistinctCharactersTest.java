package exo_algo;

/*
Exemple 4 : Caractères distincts

Dans une chaîne, détecter la plus longue chaîne de caractères composée de caractères distincts.

Par exemple : “abcdemo” est la plus longue chaîne de caractères distincts de “abcdemoderneancien”
* */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistinctCharactersTest {

	private final DistinctCharacters distinctCharacters;

	public DistinctCharactersTest() {
		this.distinctCharacters = new DistinctCharacters();
	}

	@Test
	public void shouldReturn_True(){
		assertTrue(true);
	}

	@Test
	public void shouldReturn_abc_WhenGiven_abc(){
		//Given
		String input = "abc";

		//When
		String result = distinctCharacters.execute(input);

		//Then
		//assertEquals(3,distinctCharacters.getSize());
		assertEquals("abc", result);

	}

	@Test
	public void shouldReturn_abcdefg_WhenGiven_abcdefg(){
		//Given
		String input = "abcdefg";

		//When
		String result = distinctCharacters.execute(input);

		//Then
		assertEquals("abcdefg", result);

	}

	@Test
	public void shouldReturn_abcd_WhenGiven_abcdabcd(){
		//Given
		String input = "abcdabcd";

		//When
		String result = distinctCharacters.execute(input);

		//Then

		assertEquals("abcd", result);

	}

	@Test
	public void shouldReturn_abcd_WhenGiven_eaabcdabcd(){
		//Given
		String input = "eaabcdabcd";

		//When
		String result = distinctCharacters.execute(input);

		//Then

		assertEquals("abcd", result);

	}

	@Test
	public void shouldReturn_abcde_WhenGiven_abcdabcdea(){
		//Given
		String input = "abcdabcdea";

		//When
		String result = distinctCharacters.execute(input);

		//Then
		assertEquals("abcde", result);

	}

	@Test
	public void shouldReturn_abcdemo_WhenGiven_abcdemoderneancien(){
		//Given
		String input = "abcdemoderneancien";

		//When
		String result = distinctCharacters.execute(input);

		//Then
		assertEquals("abcdemo", result);
	}

	@Test
	public void shouldReturn_abcdemo_WhenGiven_ncienabcdemoderneancien(){
		//Given
		String input = "ncienabcdemoderneancien";

		//When
		String result = distinctCharacters.execute(input);

		//Then
		assertEquals("nabcdemo", result);
	}

}
