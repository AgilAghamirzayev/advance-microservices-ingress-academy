package s.good;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileDownloader {

  public void downloadFile(String location) throws IOException {
    URL url = new URL("https://google.com");
    ReadableByteChannel rbc = Channels.newChannel(url.openStream());
    FileOutputStream fos = new FileOutputStream("google.html");
    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
  }

}
