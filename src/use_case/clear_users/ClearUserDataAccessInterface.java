package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupUserDataAccessInterface;

import java.io.IOException;

public interface ClearUserDataAccessInterface extends SignupUserDataAccessInterface {
    void clear() throws IOException;

    String getUsernames();
}
