public static Runnable printPrimes(BigInteger start, long length)
{
   return () ->
      {
         BigInteger n = start;
         for (long i = 0; i < length; i++) 
         {
            if (n.isProbablePrime(100))
               System.out.println(n);
            n = n.add(BigInteger.ONE);
         }
      };
}

Runnable r1 = printPrimes(new BigInteger("1000000000000000"), 10000);
Runnable r2 = printPrimes(new BigInteger("2000000000000000"), 10000);

ExecutorService service = Executors.newFixedThreadPool(2);
service.shutdown();
