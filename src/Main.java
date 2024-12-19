import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int taille = 7;

        double [] temperature1 = new double[taille];

        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        BufferedWriter bw;

        Path fichierSource = Paths.get("monFichier.bin");
        bw = Files.newBufferedWriter(fichierSource, Charset.defaultCharset());
        DataOutputStream dos = new DataOutputStream(Files.newOutputStream(fichierSource));
        for (int i = 0; i < taille; i++) {
            temperature1[i] = rand.nextDouble(-100, 100);
            dos.writeDouble(temperature1[i]);
            System.out.println(temperature1[i]);
        }
    }
}


