import java.io.IOException;

public class Screen {

    public static void clear() {

        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // Código específico para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (os.contains("nux") || os.contains("nix") || os.contains("aix")) {
                // Código específico para Linux / Unix
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Outro sistema operacional: " + os);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
