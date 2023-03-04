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
        // BoysDontCry stupid = new String( "");

        //STWORZENIE LAMBDY
        // metoda nic nie przyjmuje i nic nie zwraca
//        BoysDontCry firstLambda = () -> {
//        }; // - def metody silnoreki (jest w tym interface tylko jedna metoda ktora nic nie przyjmujke i nic nie zwraca
//
//        //lambda nic nie przyjmuje alew cos zwraca
//        BoysDontCry secondLambda = () -> System.out.println("Lambda");
//        // lambda jest definicja obiektu,
//        // nie ma cialu wiec trzeba zaimplementowac cialo
//        secondLambda.silnoreki();
//
//        BoysDontCry thirdLambda = () -> {
//            System.out.println("one");
//            System.out.println("second");
//        };
//    }
        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body
        BoysDontCry firstLambda = () -> {};
        BoysDontCry secondLambda = () -> System.out.println("Lambda:)");
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };
    }
}
