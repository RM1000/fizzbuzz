import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    private IntFunction<String> self = String::valueOf;
    private Predicate<Integer> isFizz = number -> number%3==0;
    private Predicate<Integer> isBuzz = number -> number%5==0;

    private Predicate<Integer> isFizzUsingNumber = number -> String.valueOf(number).contains("3");
    private Predicate<Integer> isBuzzUsingNumber = number -> String.valueOf(number).contains("5");

    IntFunction<String> buzzUsingNumber = (number) -> {
        if(isBuzzUsingNumber.test(number))
            return "Buzz";
        return self.apply(number);
    };

    IntFunction<String> buzzFunction = (number) -> {
        if(isBuzz.test(number))
            return "Buzz";
        return buzzUsingNumber.apply(number);
    };

    IntFunction<String> fizzUsingNumber = (number) -> {
        if(isFizzUsingNumber.test(number))
            return "Fizz";
        return buzzFunction.apply(number);
    };

    IntFunction<String> fizzFunction = (number) -> {
        if(isFizz.test(number))
            return "Fizz";
        return fizzUsingNumber.apply(number);
    };

    IntFunction<String> fizzBuzzFunction = (number) ->{
        if( (isFizz.test(number)|| isFizzUsingNumber.test(number)) &&
                (isBuzz.test(number)|| isBuzzUsingNumber.test(number)))
            return "FizzBuzz";
        return fizzFunction.apply(number);
    };

    public static void main (String [] args){
        String data= IntStream.rangeClosed(1,100).boxed().
                map(t->new FizzBuzz().fizzBuzzFunction.apply(t)).collect(Collectors.joining("\n"));
        System.out.println(data);
    }
}
