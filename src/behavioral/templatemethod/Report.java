package behavioral.templatemethod;

public abstract class Report {

  public final void generateReport(){
    readData();
    formatHeader();
    formatBody();
    formatFooter();
    printOutput();
  }

  protected abstract void readData();

  protected abstract void formatHeader();

  protected abstract void printOutput();

  protected void formatBody(){
    System.out.println("Common body formatting");
  }

  protected void formatFooter(){
    System.out.println("Common footer formatting");
  }
}
