package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import interface_adapter.clear_users.ClearState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    private ClearState state = new ClearState();

    public ClearViewModel() { super("clear"); }

    public void setState(ClearState state){
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    @Override
    public void firePropertyChanged() {
//        System.out.println("clear firePropertyChanged execute");
//        System.out.println("clearState = " + this.state);
        support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }
}
