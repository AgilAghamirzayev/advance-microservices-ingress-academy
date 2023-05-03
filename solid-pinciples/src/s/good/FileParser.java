package s.good;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileParser {

  public void parseTheFile(File file) throws IOException {
    Scanner input = new Scanner(file);
    while (input.hasNext()) {
      String nextToken = input.next();
      String nextLine = input.nextLine();
    }
    input.close();
  }
}
