public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread lz = new Thread(lazyPrimeFactorization);
        Thread op = new Thread(optimizedPrimeFactorization);

        lz.start();
        op.start();

    }
}
