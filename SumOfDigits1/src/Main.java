import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tempNumber, digitValue, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i < 1000; i++)
        {
            tempNumber = i;
            while(tempNumber != 0)
            {
                digitValue = tempNumber % 10;
                sum += (digitValue * digitValue * digitValue);
                tempNumber = tempNumber / 10;
            }
            if(sum == i)
            {
                System.out.println(i+" ");
            }
            sum = 0;
        }


    }
}
