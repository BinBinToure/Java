package loopexample;

public class loopExample2 {

    public static void main(String[] args) {

        int dan;
        int time;

        for (dan=3; dan<=7; dan++) {
            for (time=1; time<=9; time++) {
                System.out.println(dan + "X" + time + " = " + dan*time);
            }
            System.out.println();
        }
    }
}
