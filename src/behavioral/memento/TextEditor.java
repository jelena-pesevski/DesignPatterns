package behavioral.memento;

public class TextEditor {

  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento saveState() {
    return new Memento(state);
  }

  public void restoreMemento(Memento memento) {
    state = memento.getState();
  }
}
