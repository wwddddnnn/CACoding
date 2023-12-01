package use_case.clear_users;


public class ClearInputData {
    private final String[] usernameList;

    public ClearInputData(String[] usernameList){
        this.usernameList = usernameList;
    }

    String[] getUsernameList(){
        return this.usernameList;
    }
}
