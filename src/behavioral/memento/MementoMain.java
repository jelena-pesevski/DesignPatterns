package behavioral.memento;

public class MementoMain {

  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();
    textEditor.setState("Old state");

    System.out.println("State before changes");
    System.out.println(textEditor.getState());

    Caretaker caretaker = new Caretaker();
    caretaker.addMemento(textEditor.saveState());

    textEditor.setState("New state");
    System.out.println(textEditor.getState());

    textEditor.restoreMemento(caretaker.getMemento(caretaker.getMementoList().size() - 1));

    System.out.println("Old state restored...");
    System.out.println(textEditor.getState());
  }
}
