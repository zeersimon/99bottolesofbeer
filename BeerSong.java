
package ninety_nine_bottles_of_beer;

public class Ninety_Nine_Bottles_of_Beer {

    public static void main(String[] args) {
        int counter = 99;
        String Ninety_Nine_Bottles_of_Beer = "Bottles";

        while (counter > 1) {

            if (counter == 1) {
                Ninety_Nine_Bottles_of_Beer = "Bottles";
            }

            System.out.println(counter + " " + Ninety_Nine_Bottles_of_Beer + " of beer on the wall, " + counter + " " + Ninety_Nine_Bottles_of_Beer + " of beer");
            counter = counter - 1;

            if (counter == 1) {
                Ninety_Nine_Bottles_of_Beer = "Bottle";

            }
            if (counter > 1) {
                System.out.println("Take one down, pass it round " + counter + " " + Ninety_Nine_Bottles_of_Beer + " of beer");
            }
        }
    }
}
