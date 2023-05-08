package behavioral.templatemethod;

public class HTMLReport extends Report{

  @Override
  protected void readData() {
    System.out.println("Reading HTML data");
  }

  @Override
  protected void formatHeader() {
    System.out.println("Formating HTML header");
  }

  @Override
  protected void printOutput() {
    System.out.println("Printing HTML output");
  }
}
