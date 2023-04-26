package creation.singleton;

public enum SingletonEnum {
  INSTANCE;

  private static String queryHistory = "Query history:\n";

  public void addQuery(String query) {
    queryHistory += query + "\n";
  }

  public void showQueries() {
    System.out.println(queryHistory);
  }
}
