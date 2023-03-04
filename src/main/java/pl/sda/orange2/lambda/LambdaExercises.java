package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {

        // tworzenie obiektu,
        BoysDontCry boy = new ChlopakiNiePlacza();
        boy.silnoreki();
        // nie zadziala bo mozna wolac metody tylko w interfejsie w klasie bazowej
        // boy.sing();
        ChlopakiNiePlacza boy2 = new ChlopakiNiePlacza();
        boy2.sing();


        // klasa anonimowa
        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy Silnoreki");
            }
        };
        anonymousClassReference.silnoreki();

        // string nie implementuje boys
        //  BoysDontCry stupid = new String( "");

        //STWORZENIE LAMBDY
        // metoda nic nie przyjmuje i nic nie zwraca
        BoysDontCry firstLambda = () -> {
        }; // - def metody silnoreki (jest w tym interface tylko jedna metoda ktora nic nie przyjmujke i nic nie zwraca

        //lambda nic nie przyjmuje alew cos zwraca
        BoysDontCry secondLambda = () -> System.out.println("Lambda");
        // lambda jest definicja obiektu,
        // nie ma cialu wiec trzeba zaimplementowac cialo
        secondLambda.silnoreki();

        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };

//        // () parenthesis - arguments list
//        // -> arguments, body separator
//        // {} parenthesis - method body
//        //BoysDontCry firstLambda = () -> {
//        //};
//        BoysDontCry secondLambda = () -> System.out.println("Lambda:)");
//        secondLambda.silnoreki();
//        BoysDontCry thirdLambda = () -> {
//            System.out.println("one");
//            System.out.println("second");
//        };
        System.out.println("----------------------");
        System.out.println("Coffee time");


        CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffee"; // jesli mamy string nie potrzeba return

        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) ->
        {
            System.out.println("Coffee brewing..");

            return "my coffee";
        };

        //        String myCoffee = myCoffeeMaker3.prepare(5, "Small");
//        System.out.println("My coffee is ready " + myCoffee);
//        // jezeli nadpisujemy jedna jedyna metode ona wie skad ma brac wartosci wiec nie trzeba typow podawac
//        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
//        shortVersion.prepare(5, "Large Java Coffee");
        String myCoffee = myCoffeeMaker3.prepare(5, "Small");
        System.out.println("my coffee is ready: " + myCoffee);

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
        shortVersion.prepare(5, "Large Java coffee");
    }
}
