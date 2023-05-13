package c2;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ServletApp extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    PrintWriter writer = resp.getWriter();
    Date date = new Date();

    writer.println("""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8">
          <title>My Web App</title>
        </head>
        <body>
        <h1>Today:
        """
        + date +
        """
        </h1>
        </body>
        </html>
        """);
  }
}
