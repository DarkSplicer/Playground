package jar.model.impl;

import jar.model.interfaces.User;

public class UserImpl implements User{

    private int userId;
    private String username;
    private String passwort;


    @Override
    public int getUserId() {
        return this.userId;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPasswort() {
        return this.passwort;
    }

    @Override
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }


}
