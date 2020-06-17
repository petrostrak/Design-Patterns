
package interfaces;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    
    public void notifyServers();
    
    public Object getUpdate(Observer observer);
}
