package downloadPresentation;

import java.io.*;
import java.net.URL;

public class Main3 {
    public static void main(String[] args) {
        String url = "https://images-na.ssl-images-amazon.com/images/I/51Ff6A7KfFL._SL1000_.jpg";
        String file = "image.jpg";

        try {
            downloadImage(url, file);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void downloadImage(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        byte[] buffer = new byte[2048];
        int length;
        try (InputStream input = new BufferedInputStream(url.openStream());
             OutputStream output = new FileOutputStream(file)) {
            while ((length = input.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
