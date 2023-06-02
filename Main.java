package HW2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Languages l1 = new Languages();
        English e1 = new English("latin script",26 );
        Russian r1 = new Russian("Русская азбука",36,"Винительный",2);
        German g1 = new German("latin script + special letters",30);

        // Methods
        r1.nameConstructor();

        e1.printLanguage();

        l1.chooseLanguage();

    }
}
