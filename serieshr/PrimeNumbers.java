package serieshr;

public class PrimeNumbers
{
    int n;

    public PrimeNumbers(int no)
    {
        n=no;
    }

    public boolean isPrime(int n1)
    {
        for(int i=2;i<n;i++)
        {
            if(n1%i==0)
            return false;
        }

        return true;
    } 

    public void createPrime()
    {
 
        System.out.println("Prime numbers are");

        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {System.out.println(i);
            }
        }
    }
}
