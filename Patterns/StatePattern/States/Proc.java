package States;
import States.*;

public class Proc implements ProcState{

    private int pid;
    private String name;
    private int remainingTime;
    //private int priority;
    private ProcState state;

    public Proc(int pid, String name, int remainingTime) {

        this.pid = pid;
        this.name = name;
        this.remainingTime = remainingTime;
        //this.priority = priority;

        //Default state is new
        state = new ProcNewState(this); 
    }

    public String getName() {
        return name;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void changeState(ProcState newState) {
        state = newState;
    }

    @Override
    public String toString() {
        return "Proc{" + "pid=" + pid + ", name=" + name + ", remainingTime=" + remainingTime + '}';
    }


    //Implementations of the methods in ProcState (Just delegation)

    @Override
    public void admit() {
        state.admit();
    }

    @Override
    public void dispatch() {
        state.dispatch();
    }

    @Override
    public void interrupt() {
        state.interrupt();
    }

    @Override
    public void ioEvent() {
        state.ioEvent();
    }

    @Override
    public void ioComplete() {
        state.ioComplete();
    }

    @Override
    public void terminate() {
        state.terminate();
    }

}
    