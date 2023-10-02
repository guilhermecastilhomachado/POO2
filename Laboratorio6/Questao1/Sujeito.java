package Questao1;

public interface Sujeito {

    public void addObservers(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObservers();
}
