package structural.adapter;

import java.sql.ResultSet;

/*Class which would do real communication with new db API*/
public class NewAPIQuery implements Query {

  private ResultSet resultSet;

  public NewAPIQuery(String query) {
    System.out.printf("Uses query:%s to get result set by communicating with new db API%n", query);
  }

  @Override
  public ResultSet execute() {
    System.out.println("Does method call to new db API, in this case returns null");
    return resultSet;
  }
}
