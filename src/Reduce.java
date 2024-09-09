public class Reduce {
    public static void main(String[] args) {
        int j = 0;
        int n = 100;
        while(n > 0){
            boolean divisibleby2 = n % 2 == 0;
            if (divisibleby2){
                n = n/2;
            }
            else {
                n = n-1;
            }
            j = j +1;
        }
        System.out.println(j);
    }
}
