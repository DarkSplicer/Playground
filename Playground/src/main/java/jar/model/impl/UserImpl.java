package jar.model.impl;

import jar.model.interfaces.User;

public class UserImpl implements User{

    private int userId;
    private String username;
    private String EmailAdress;
    private String passwort;


    @Override
    public int getUserID() {
        return this.userId;
    }

    @Override
    public void setUserID(int userID) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setUserName(String username) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getEmailAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setEmailAddress(String emailaddress) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPassword(String password) {
        // TODO Auto-generated method stub

    }

}
