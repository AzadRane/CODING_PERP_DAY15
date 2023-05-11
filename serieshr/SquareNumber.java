package serieshr;

public class SquareNumber {
    
    public int n;

    public SquareNumber(int n)
    {
        this.n=n;
    }

    public void SquareNo()
    {
        System.out.println("Squares unit no ares");
        for(int i=1;i<n;i++)
        {
            System.out.println(i*i);
        }
    }

}
