/**
 * Created by Viktor on 15.03.2018.
 */
public class Primes {
    public static void main(String[] args){
        int a,b;

        for (a=1; a<100; a++) {
            b = 0;

            for(int i=1; i<=a; i++)
                if (a%i==0)
                    b++;

            if (b<=2) {
                System.out.println(a+" ");
            }
        }
    }
}
