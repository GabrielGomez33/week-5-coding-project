
public class App {
    public static void main(String[] args) {
        AsteriskLogger aLogger = new AsteriskLogger();
        SpacedLogger sLogger = new SpacedLogger();

        aLogger.log("Hello");
        aLogger.error("Hello");
        System.out.println(); // Add a newline

        sLogger.log("Hay un error amigo");
        sLogger.error("Hay un error amigo");
    }
}