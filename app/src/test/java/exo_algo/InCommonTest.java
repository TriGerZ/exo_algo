package exo_algo;

/*
Concevoir un algorithme pour trouver tous les caractères communs à deux listes triées.

Par exemple, pour les listes a, e, e, e et b, b, c, e, e, g, la sortie doit être de e, e.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InCommonTest {

	InCommon inCommon;
	List<Character> left;
	List<Character> right;
	List<Character> expected;

	@BeforeEach
	void beforeEach() {
		this.inCommon = new InCommon();
		left = new ArrayList<>();
		right = new ArrayList<>();
		expected = new ArrayList<>();
	}

	@Test
	void shouldReturn_True(){
		assertTrue(true);
	}

	@Test
	void shouldReturn_a_Given_a_And_a(){
		//Given
		left.add('a');
		right.add('a');
		expected.add('a');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected, commonChars);
	}

	@Test
	void shouldReturn_b_Given_b_And_b(){
		//Given
		left.add('b');
		right.add('b');
		expected.add('b');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_a_Given_ab_And_a(){
		//Given
		left.add('a');
		left.add('b');
		right.add('a');
		expected.add('a');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_b_Given_ab_And_b(){
		//Given
		left.add('a');
		left.add('b');
		right.add('b');
		expected.add('b');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_ee_Given_aeee_And_bbceeg(){
		//Given
		left.add('a');
		left.add('e');
		left.add('e');
		left.add('e');
		right.add('b');
		right.add('b');
		right.add('c');
		right.add('e');
		right.add('e');
		right.add('q');
		expected.add('e');
		expected.add('e');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_ee_Given_bbceeg_And_aeee(){
		//Given
		right.add('a');
		right.add('e');
		right.add('e');
		right.add('e');
		left.add('b');
		left.add('b');
		left.add('c');
		left.add('e');
		left.add('e');
		left.add('q');
		expected.add('e');
		expected.add('e');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_EmptyList_Given_bbceeg_And_Empty(){
		//Given
		left.add('b');
		left.add('b');
		left.add('c');
		left.add('e');
		left.add('e');
		left.add('q');

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

	@Test
	void shouldReturn_EmptyList_Given_Empty_And_Empty(){
		//Given

		//When
		List<Character> commonChars = inCommon.execute(left, right);
		//Then
		assertEquals(expected,commonChars);
	}

}
