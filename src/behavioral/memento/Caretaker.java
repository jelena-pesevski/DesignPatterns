package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

  private List<Memento> mementoList = new ArrayList<>();


  public List<Memento> getMementoList() {
    return mementoList;
  }

  public void addMemento(Memento memento) {
    mementoList.add(memento);
  }

  public Memento getMemento(int index) {
    return mementoList.get(index);
  }

  public Memento removeMemento(int index) {
    return mementoList.remove(index);
  }
}
