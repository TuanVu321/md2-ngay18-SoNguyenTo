public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            if(check(i)){
                System.out.println("lz "+i);
            }
        }
    }

    private boolean check(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
