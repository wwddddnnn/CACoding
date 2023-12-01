package use_case.clear_users;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData clearAll);

    void prepareFailView(String error);
}
