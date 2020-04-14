public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            if(check(i)){
                System.out.println("op "+i);
            }
        }
    }
    private boolean check(int i) {
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
