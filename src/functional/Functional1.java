package functional;

import java.util.List;

public class Functional1 {
    //print list of numbers using list of numbers using functional programming
    public static void main(String[] args){
        /*printAllNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));*/
        /*printAllEvenNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));*/
        /*printAllOddNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));*/
        /*printAllCoursesInList(List.of("Azure","GCP","AWS","SpringBoot","Spring Core"));*/
//        printAllCoursesInListContainingSpring(List.of("Azure","GCP","AWS","SpringBoot","Spring Core"));
        /* printAllCoursesInListAtleast4Chars(List.of("Azure","Docker","GCP","AWS","SpringBoot","Spring Core"));*/
//        printSquaresAllEvenNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));
//        printCubeAllOddNumbersInList(List.of(12,12,13,13,141,14,1214,12445,767));
        printCourseStringLength(List.of("Azure","Docker","GCP","AWS","SpringBoot","Spring Core"));


        String name = null;

       try{
           name.length();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    private static void printAllCoursesInListAtleast4Chars(List<String> courses) {
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);

    }

    private static void printAllCoursesInListContainingSpring(List<String> courses) {


        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

    }

    private static void printAllCoursesInList(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);

    }


    private static void printCourseStringLength(List<String> courses){
        courses.stream().map(x -> x + "  : " + x.length()).forEach(System.out::println);

    }



    private static void printAllOddNumbersInList(List<Integer> integers) {
        integers.stream()
                .filter(number -> number %2 !=0 )
                .forEach(System.out::println);
    }


    private static void printCubeAllOddNumbersInList(List<Integer> integers) {
        integers.stream()
                .filter(number -> number %2 !=0 )
                .map(x->x*x*x)
                .forEach(System.out::println);
    }
    private static boolean isEven(int integer){
        return integer%2 ==0 ;
    }

    private static void printAllEvenNumbersInList(List<Integer> integers) {
       /* integers.stream().
                filter(Functional1::isEven).   //checking whether the element is even using filter
                forEach(System.out::println); //method reference*/


        integers.stream()
                .filter(number -> number %2 ==0 )
                .forEach(System.out::println);


    }

    private static void printSquaresAllEvenNumbersInList(List<Integer> integers) {
       /* integers.stream().
                filter(Functional1::isEven).   //checking whether the element is even using filter
                forEach(System.out::println); //method reference*/


        integers.stream()
                .filter(number -> number %2 ==0 )
                .map(x -> x*x)
                .forEach(System.out::println);


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
