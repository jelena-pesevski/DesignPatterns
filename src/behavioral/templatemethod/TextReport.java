package behavioral.templatemethod;

public class TextReport extends Report{

  @Override
  protected void readData() {
    System.out.println("Reading Text data");
  }

  @Override
  protected void formatHeader() {
    System.out.println("Formating Text header");
  }

  @Override
  protected void printOutput() {
    System.out.println("Printing Text output");
  }
}
