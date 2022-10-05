package functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PlayWithOptional {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","mango");

        Predicate <String> predicate =  fruit ->fruit.startsWith("x");
        Optional<String> first = fruits.stream().filter(predicate).findFirst();
        System.out.println(first);
        System.out.println(first.isEmpty());
        System.out.println(first.isPresent());
        try{System.out.println(first.get());}catch (Exception e) {
            System.out.println("Exception !!! "+e);
        }


        finally{
            Optional<String> fr = Optional.of("some fruit");

            System.out.println(fr);
            Optional<String> empty = Optional.empty();

            System.out.println(empty);

        }

    }
}
