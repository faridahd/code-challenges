/*
 * This classic problem dates back to Roman times. There are 41 soldiers arranged in a circle. 
 * Every third soldier is to be killed by their captors, continuing around the circle until 
 * only one soldier remains. He is to be freed. Assuming you would like to stay alive, at what position in the circle would you stand?
 */
public class Josephus {
    public static void main(String[] args) {
        System.out.println("josephus(41, 3) -> " + josephus(41, 3));
        System.out.println("josephus(35, 11) -> " + josephus(35, 11));
        System.out.println("josephus(11, 1) -> " + josephus(11, 1));
        System.out.println("josephus(2, 2) -> " + josephus(2, 2));
    }

    public static int josephus(int n, int i) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, i) + i - 1) % n + 1;
        }
    }

}
