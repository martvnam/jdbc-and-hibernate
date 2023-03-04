package pl.sda.orange2.lambda;

@FunctionalInterface // ochrona
public interface BoysDontCry {
    void silnoreki();// - metoda abstrakcyjna
    // jak b ysmy mieli wiecej niz jedna metode w inteerfejsie lambda moglaby nie dac rady
    // void  cry();
    // chyba ze
    default void  cry(){};
    // -default mowi ze to metoda jest nie abstrakcyjna czyli ze MA CIAŁO



}
