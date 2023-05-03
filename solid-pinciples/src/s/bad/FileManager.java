package s.bad;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import s.Employee;

public class FileManager {

  public void downloadFile(String location) throws IOException {
    URL url = new URL("https://google.com");
    ReadableByteChannel rbc = Channels.newChannel(url.openStream());
    FileOutputStream fos = new FileOutputStream("google.html");
    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
  }

  public void parseTheFile(File file) throws IOException {
    Scanner input = new Scanner(file);
    while (input.hasNext()) {
      String nextToken = input.next();
      String nextLine = input.nextLine();
    }
    input.close();
  }

  public void persistTheData(List<String> data) {
    Employee ali = new Employee(100, "Ali");
    ali.random = 1111;
    Objects json;
  }

}
