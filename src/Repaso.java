// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Repaso {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Paint the tree!\n");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        int cont = 0;
        for (int i = 1; i <= 7; i++) {
            int numAsteriscos = i+cont;
            int numEspacios = (int) ((7-numAsteriscos)/2);
            if (i<=4)
                pinta(numEspacios,numAsteriscos);
            else
                pinta(2,3);
            cont++;
        }
    }
    private static void pinta(int numEspacios,int numAsteriscos) {
        pinta(' ', numEspacios);
        pinta('*',numAsteriscos);
        pinta(' ', numEspacios);
        System.out.println("");
    }
    private static void pinta(char caracter, int tama) {
        for (int i = 1; i <= tama;i ++)
            System.out.printf("%c",caracter);
    }
}