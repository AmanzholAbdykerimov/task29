import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int t=60;
        int[] arr={1,2,3,4,5,6,7,8,9};
        Stream.of(arr);
        Arrays.stream(arr).filter(x->x%2==0).map(x->x*x).filter(x-> x>t).forEach(System.out::println);
    }}


    //Integer массивден жуп сандарды терип алыныздар жана алардын квадраттарынын эн чонун табыныз.
