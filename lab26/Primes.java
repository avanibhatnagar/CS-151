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
