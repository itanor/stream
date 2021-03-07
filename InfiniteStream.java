import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class InfiniteStream {

  public static void main(String... args) {
    Stream.generate(Math::random)
		  .limit(15)
			.forEach(System.out::println);

	  Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);
		evenNumStream
			.limit(15)
			.collect(toList())
			.forEach(System.out::println);
	}
}

