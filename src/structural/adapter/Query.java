package structural.adapter;

import java.sql.ResultSet;

/*Helper interface used by Old API*/
public interface Query {

  ResultSet execute();
}
