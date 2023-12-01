package interface_adapter.clear_users;

public class ClearState {
    private String clearError = null;
    private String usernames = "";
    public ClearState() { }

    public ClearState(ClearState copy){
        this.clearError = copy.clearError;
        this.usernames = copy.usernames;
    }

    public void setClearError(String clearError){
        this.clearError = clearError;
    }

    public String getClearError() {
        return this.clearError;
    }

    public String getUsernames(){
        return this.usernames;
    }

    public void setUsernames(String usernames){
        this.usernames = usernames;
    }

    public String toString() {
        return "ClearState{" + "usernames=[" + this.usernames + "]}";
    }


}
