package HW2;

public class German extends Languages{

    // Fields
    private String mainGermanArticles;
    private int languageProficiencyLevel;

    // Constructors
    public German(String alphabet, int numberOfLetters) {
        super(alphabet, numberOfLetters);
    }

    public German(String alphabet, int numberOfLetters, String mainGermanArticles, int languageProficiencyLevel) {
        super(alphabet, numberOfLetters);
        this.mainGermanArticles = mainGermanArticles;
        this.languageProficiencyLevel = languageProficiencyLevel;
    }

    // Methods
    @Override
    void chooseLanguage() {
        super.chooseLanguage();
    }

    @Override
    void printLanguage() {
        super.printLanguage();
    }
}
