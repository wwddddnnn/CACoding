package use_case.clear_users;

// TODO Complete me

import java.io.IOException;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary usePresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary usePresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.usePresenter = usePresenter;
    }

    @Override
    public void execute() throws IOException {
        String usernames = "";
        try {
            usernames = this.userDataAccessObject.getUsernames();
            this.userDataAccessObject.clear();
        } catch (IOException e){
            this.usePresenter.prepareFailView("Something error!");
        }
        ClearOutputData clearOutputData = new ClearOutputData(true, usernames);
        this.usePresenter.prepareSuccessView(clearOutputData);
    }
}
