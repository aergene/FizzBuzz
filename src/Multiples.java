public class Multiples {
    public static void main(String[] args) {
        int i = 1;

        while (i < 1000){

            boolean Multiple3 = i % 3 == 0;
            boolean Multiple5 = i % 5 == 0;


            if (Multiple3 || Multiple5) {

                System.out.println(i);

            }
            i++;
        }
    }
}
