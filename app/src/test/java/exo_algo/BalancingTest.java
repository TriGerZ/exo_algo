package exo_algo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/*
Exemple 7 : Équilibrage

		Diviser un tableau de nombre en deux de manière à ce que la différence entre les deux tableaux soit la plus petite possible.
*/
public class BalancingTest {

	Balancing balancing;

	ArrayList<Integer> integerList;
	ArrayList<Integer> expectedIntegerLeftList;
	ArrayList<Integer> expectedIntegerRightList;

	public BalancingTest() {
		this.balancing = new Balancing();
	}

	public static Stream<Arguments> balancingTestSource() {
		return Stream.of(
				Arguments.of(Arrays.asList(2,1,67,59,20), Arrays.asList(20,59),Arrays.asList(1,2,67)),
				Arguments.of(Arrays.asList(1,2,3,4,5,6), Arrays.asList(1, 2, 3, 5),Arrays.asList(4, 6)),
				Arguments.of(Arrays.asList(1,1), Arrays.asList(1),Arrays.asList(1)),
				Arguments.of(Arrays.asList(2,2), Arrays.asList(2),Arrays.asList(2)),
				Arguments.of(Arrays.asList(1,234,40,50), Arrays.asList(1,40,50),Arrays.asList(234)),
				Arguments.of(Arrays.asList(1,2,3,4,5,6,7,8,9,10), Arrays.asList(1, 2, 3, 4, 5, 6, 7),Arrays.asList(8,9,10)),
				Arguments.of(Arrays.asList(1,40,50,234,235), Arrays.asList(50, 234),Arrays.asList(1,40,235)),
				Arguments.of(Arrays.asList(1,40,50,234,235,4000,230), Arrays.asList(4000),Arrays.asList(1, 40, 50, 230, 234, 235)),
				Arguments.of(Arrays.asList(1,40,50,234,235,230), Arrays.asList(1, 40, 50, 235),Arrays.asList(230, 234)),
				Arguments.of(Arrays.asList(0,1,40,50,234,235,230), Arrays.asList(0, 1, 40, 50, 235),Arrays.asList(230, 234))
		);
	}

	@BeforeEach
	void beforeEach() {
		integerList = new ArrayList<>();
		expectedIntegerLeftList = new ArrayList<>();
		expectedIntegerRightList = new ArrayList<>();
	}

	@Test
	void shouldReturnTrue(){
		assertTrue(true);
	}

	@ParameterizedTest
	@MethodSource("balancingTestSource")
	void testBalancing(List<Integer> integerList, List<Integer> expectedIntegerLeftList, List<Integer> expectedIntegerRightList){
		//Given
		var expectedArrayList = new ArrayList<>(Arrays.asList(expectedIntegerLeftList, expectedIntegerRightList));

		//When
		var result = balancing.execute(integerList);

		//Then
		assertThat(result).hasSameElementsAs(expectedArrayList);
	}



}
