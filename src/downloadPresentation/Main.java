package downloadPresentation;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://bumper-stickers.ru/32140-large_default/kot-saymona-vid-szadi.jpg";
        String file = "image.jpg";

        downloadImage1(url, file);
    }

    private static void downloadImage1(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        InputStream input = new BufferedInputStream(url.openStream());
        OutputStream output = new FileOutputStream(file);

        byte[] buffer = new byte[2048];
        int length;
        while ((length = input.read(buffer)) != -1) {
            output.write(buffer, 0, length);
        }
        input.close();
        output.close();
    }
}
