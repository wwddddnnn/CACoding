package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private boolean clearSuccess;

    private String usernames;

    public ClearOutputData(boolean clearSuccess, String usernames){
        this.usernames = usernames;
        this.clearSuccess = clearSuccess;
    }

    public String getUsernames(){
        return this.usernames;
    }
}
