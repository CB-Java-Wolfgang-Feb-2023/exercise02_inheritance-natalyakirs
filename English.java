package HW2;

public class English extends Languages{

    // Fields
    private int numberOfTenses;
    private float motherTongue; // the amount of native speakers worldwide

    // Constructors
    public English(String alphabet, int numberOfLetters) {
        super(alphabet, numberOfLetters);
    }

    public English(String alphabet, int numberOfLetters, int numberOfTenses, float motherTongue) {
        super(alphabet, numberOfLetters);
        this.numberOfTenses = numberOfTenses;
        this.motherTongue = motherTongue;
    }

    // Methods
    void allTheTenses() {
        System.out.println("Present: Present Simple, Present Perfect, Present Continuous, Present Perfect Continuous");
        System.out.println("Past: Past Simple, Past Perfect, Past Continuous, Past Perfect Continuous.");
        System.out.println("Future: Future Simple, Future Continuous, Future Perfect, Future Perfect Continuous.");
    }

    @Override
    void chooseLanguage() {
        super.chooseLanguage();
    }
}
