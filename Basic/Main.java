import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("hello");
        System.out.println("I own" + "  " + number + "  " + puralaize("cat", number) );
        flipNHeads(4);
    }

    public static String puralaize(String word, int num) {
        if (num == 0 || num >= 1) {
            word = word + "s";
        }

        return word;
    }

    public static void flipNHeads(int n) {
        int count = 0;
        int rand;
       int headNumber = 0;
        Random random = new Random();
        while (n != headNumber) {
            rand = (int) Math.round(random.nextFloat());
            if (rand >= 0.5) {
                System.out.println("Head");
                headNumber++;

            } else {
                System.out.println("Tail");

                count++;
            }
            n--;
        }
        System.out.println("It tooks"+" "+count+"Flips to Flip"+" "+headNumber+" "+"Head in a row");
    }
}


