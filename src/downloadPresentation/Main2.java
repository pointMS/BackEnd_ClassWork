package downloadPresentation;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String url = "https://images-na.ssl-images-amazon.com/images/I/51Ff6A7KfFL._SL1000_.jpg";
        String file = "image.jpg";

        downloadImage2(url, file);
    }

    private static void downloadImage2(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        InputStream input = new BufferedInputStream(url.openStream());
        Files.copy(input, Paths.get(file), StandardCopyOption.REPLACE_EXISTING);
    }
}
