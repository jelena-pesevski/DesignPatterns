package behavioral.templatemethod;

public class TemplateMethodMain {

  public static void main(String[] args) {
    System.out.println("Generating text report...");
    Report report = new TextReport();
    report.generateReport();

    System.out.println("Generating HTML report...");
    report = new HTMLReport();
    report.generateReport();
  }
}
