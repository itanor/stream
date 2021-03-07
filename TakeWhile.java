import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class TakeWhile {

  public static void main(String... args) {
    Stream.iterate(1, i -> i + 1)
		  .takeWhile(n -> n <= 10)
			.map(n -> n * n)
			.forEach(System.out::println);

		Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
		  .dropWhile(x -> x <= 5)
			.forEach(System.out::println);
	}
}

