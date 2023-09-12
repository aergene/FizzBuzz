public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n != 0) {

            if (n % 2 == 0) {

                System.out.println(n / 2);
                n = n/2;

            }
            else if (n % 2 == 1) {
                System.out.println(n - 1);
                n = n -1;

            }
            count++;

        }
        System.out.println("Steps: " + count);
    }
}
