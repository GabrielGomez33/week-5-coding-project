public class SpacedLogger implements Logger {
    @Override
    public void log(String word) {
        String newString = "";
        for (int i = 0; i < word.length(); i++) {
            newString += word.charAt(i);
            if (i != word.length() - 1) {
                newString += " ";
            }
        }
        System.out.println(newString);
    }

    @Override
    public void error(String word) {
        String newString = "";
        for (int i = 0; i < word.length(); i++) {
            newString += word.charAt(i);
            if (i != word.length() - 1) {
                newString += " ";
            }
        }
        System.out.print("ERROR: " + newString);
    }

    @Override
    public void asteriskPrinter(int timesToPrint) {
        for (int i = 0; i < timesToPrint; i++) {
            System.out.print("*");
        }
        System.out.println(); // Add a newline after printing asterisks
    }
}