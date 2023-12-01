package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }


    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        ClearState clearState = clearViewModel.getState();
//        System.out.println("old state in cLearPresenter: " + clearState);
        clearState.setUsernames(clearOutputData.getUsernames());
//        System.out.println("new state in clearPresenter: " + clearState);
        clearViewModel.firePropertyChanged();
//        System.out.println("property change in clearPresenter: " + clearOutputData.getUsernames());

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearError(error);
        clearViewModel.firePropertyChanged();
    }
}
