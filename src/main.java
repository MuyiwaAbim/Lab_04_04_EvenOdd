public class main {
    static int number = 8;
    static boolean evenNumber = false;
    static int numberOdd = 8;
    public static void main (String [] args)
        {
            int numberOdd = number % 2;
            if (numberOdd != 0) {
                evenNumber = false;
                System.out.println(evenNumber + ", the number is not even");
            } else {
                evenNumber = true;
                System.out.println(evenNumber + ", the number is even");
            }
        }

    }