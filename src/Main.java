import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle circle[] = new ComparableCircle[3];
        circle[0] = new ComparableCircle(5);
        circle[1] = new ComparableCircle(9);
        circle[2] = new ComparableCircle(7);


        System.out.println("After Result");
        for (ComparableCircle o : circle) {
            System.out.println(o);
        }
        Arrays.sort(circle);
        System.out.println("Before Result");
        for (ComparableCircle o : circle) {
            System.out.println(o);
        }
    }
}