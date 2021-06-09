package lesson_2;

public class Lesson02 {

    public static void main(String[] args) {
/*
        String nameLetter = "Marina";

       switch (nameLetter) {
            case "Boris":
                System.out.println("Give letter to Boris");
                break;
            case "Irina":
                System.out.println("Give letter to Irina");
                break;
            case "Not Marina":
                System.out.println("Give letter to Marina");
                break;
            case "Alex":
                System.out.println("Give letter to Alex");
                break;
            default:
                System.out.println("Go out office");
                }
 */
                System.out.println("Result is: " + myMath(2, 10));
        }

        public static int myMath(int baseValue, int signatureValue) {
            int result = 1;
            for (int i = 1; i <= signatureValue; i++) {
                result = result * baseValue;
            }
                return result;
        }

}