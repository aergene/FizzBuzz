public class Multiples {
    public static int main(int n, int a, int b) {
        int i = 1;
        int count = 0;


        while (i < n){

            boolean MultipleA = i % a == 0;
            boolean MultipleB = i % b == 0;


            if (MultipleA || MultipleB) {

                count++;
            }
            i++;
        }

        return count;
    }
}
