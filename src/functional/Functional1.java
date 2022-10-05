package functional;

import java.util.List;

public class Functional1 {
    //print list of numbers using list of numbers using functional programming
    public static void main(String[] args){
        /*printAllNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));*/
        printAllEvenNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));
    }

    private static boolean isEven(int integer){
        return integer%2 ==0 ;
    }

    private static void printAllEvenNumbersInList(List<Integer> integers) {
        integers.stream().
                filter(Functional1::isEven).   //checking whether the element is even
                forEach(System.out::println); //method reference

    }


    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInList(List<Integer> integers) {
        //convert list to streams ; a sequence of numbers
        integers.stream().forEach
                (Functional1::print); //method reference

        System.out.println();

        integers.stream().forEach
                (System.out::println); //method reference

    }



}
