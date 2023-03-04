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
    }
}
