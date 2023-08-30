public class AsteriskLogger implements Logger {
    @Override
    public void log(String word) {
        String asterisks = "***";
        String newString = asterisks + " " + word + " " + asterisks;
        System.out.println(newString);
    }

    @Override
    public void error(String word) {
        String asterisks = "***";
        String error = "Error: ";
        String newString = asterisks + " " + error + word + " " + asterisks;
        asteriskPrinter(newString.length());
        System.out.println(newString);
        asteriskPrinter(newString.length());
    }

    @Override
    public void asteriskPrinter(int timesToPrint) {
        for (int i = 0; i < timesToPrint; i++) {
            System.out.print("*");
        }
        System.out.println(); // Add a newline after printing asterisks
    }
}