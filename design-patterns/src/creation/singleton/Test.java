package creation.singleton;

public class Test {

  public static void main(String[] args) {
    var singletonEager1 = SingletonEager.getInstance();
    var singletonEager2 = SingletonEager.getInstance();
    System.out.println(singletonEager1);
    System.out.println(singletonEager2);

    var singletonLazy1 = SingletonLazy.getInstance();
    var singletonLazy2 = SingletonLazy.getInstance();
    System.out.println(singletonLazy1);
    System.out.println(singletonLazy2);

    var singletonThreadSafe1 = SingletonThreadSafe.getInstance();
    var singletonThreadSafe2 = SingletonThreadSafe.getInstance();
    System.out.println(singletonThreadSafe1);
    System.out.println(singletonThreadSafe2);

    var billPughSingleton1 = BillPughSingleton.getInstance();
    var billPughSingleton2 = BillPughSingleton.getInstance();
    System.out.println(billPughSingleton1);
    System.out.println(billPughSingleton2);

    var singletonEnum  = SingletonEnum.INSTANCE;
    singletonEnum.addQuery("First query");
    singletonEnum.addQuery("Second query");
    singletonEnum.showQueries();


    var dbConnection = DbConnection.getDbConnection();
    dbConnection.addQuery("First query");
    dbConnection.addQuery("Second query");
    dbConnection.showQueries();
  }
}
