package States;

//State pattern
public interface ProcState {
    public void admit();
    public void dispatch();
    public void interrupt();
    public void ioEvent();
    public void ioComplete();
    public void terminate();
}
