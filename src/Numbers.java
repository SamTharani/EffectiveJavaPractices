import java.util.Scanner;

/**
 * Created by samantha on 7/16/15.
 */
public abstract class Numbers {

    //static factory methods for an interface named type (NumberInterface) are put in non-instantiable class named types [NumberImp()]
    public static NumberInterface arithmeticOperations()
    {
        return new NumberImp();

    }

    private static class NumberImp implements NumberInterface
    {
        private int sum;double avg;
        Scanner num=new Scanner(System.in);
        public int findSum(int num1, int num2)
        {

            System.out.println("Enter the first number= ");
            num1=num.nextInt();
            System.out.println("Enter the second number= ");
            num2=num.nextInt();
            sum=num1+num2;
            return sum;
        }

        public double findAvg(int sum, int count)
        {
            this.sum=sum;
            System.out.println("Enter the count= ");
            count=num.nextInt();
            avg=sum/count;
            return avg;
        }
    }
}
