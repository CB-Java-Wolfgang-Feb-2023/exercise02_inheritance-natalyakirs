package HW2;

public class Russian extends Languages {

    // Fields
    private String padej; // Case in Russian language - we have 6 of them
    private int numberOfSilentLetters;

    // Constructors
    public Russian(String alphabet, int numberOfLetters) {
        super(alphabet, numberOfLetters);
    }

    public Russian(String alphabet, int numberOfLetters, String padej, int numberOfSilentLetters) {
        super(alphabet, numberOfLetters);
        this.padej = padej;
        this.numberOfSilentLetters = numberOfSilentLetters;
    }


    // Methods
    void nameConstructor() {
        System.out.println("You can see how your name would look in Russian language! On the left side - English alphabet");

        System.out.println("A -> А, B -> Б, V -> В, G -> Г,D -> Д," +
                "YE -> Е,YO -> Ё, ZH -> Ж, Z -> З, I -> И, J -> Й, K -> К, L -> Л,M -> М, N -> Н, O -> О, P -> П, R -> Р, S -> С, T -> Т, U -> У, F -> Ф, H -> Х, TS -> Ц, CH -> Ч, SH -> Ш, SHCH -> Щ, ' -> Ъ, Y -> Ы, ' -> Ь, YE -> Э, YU-> Ю, YA-> Я");
    }

    @Override
    void printLanguage() {
        super.printLanguage();
    }
}
