package observer;

public interface Observer {
    void update(String event) throws InterruptedException;
}
