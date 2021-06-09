public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();

        System.out.println("^^^^^^^^^^^");
        if (checkSumSign( 10,15 )) {
            System.out.println("Sum is positive");
        } else{
            System.out.println("Sum is negative");
        }

        printColor();
        compareNumbers();
        myRange();

    }

    public static void printThreeWords () {
        //можно было сделать проще, но в рамках обучения решил добавить переменные, чтоб можно было потом менять значение
        String fruit1 = "Orange"; //объявляю переменную 1
        String fruit2 = "Banana"; //объяваляю переменную 2
        String fruit3 = "Apple"; // объявляю переменную 3

        System.out.println(fruit1); //вызываю метод println для того чтоб значение следующаей переменной выводилась с новой строки
        System.out.println(fruit2);
        System.out.println(fruit3);
    }

    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
    }

    public static void printColor() {
        int value = 0;

        if (value <= 0){
            System.out.println("Красный");
        }else if(value >100) {
            System.out.println("Зеленый");
        }else if(value <=100) {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = 29;
        int b = 30;

        if(a >= b){
            System.out.println(" a>= b");
        }else{
            System.out.println("a < b");
        }
    }

    public static boolean myRange () {
        int a = 15;
        boolean b = false;
        if(a >= 10 & a <= 20){
            b = true;
        }else{
            b = false;
        }
        System.out.println(b);
        return b;


    }

}
