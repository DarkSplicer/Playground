package de.saar.chov.tommy.prog.model.impl;

class UserImpl implements User{

    private String userId;
    private String username;
    private String EmailAdress;
    private String passwort;


    public UserImpl() {
    }

    public UserImpl(String userId, String username, String EmailAdress, String passwort) {
        this.userId = userId;
        this.username = username;
        this.EmailAdress = EmailAdress;
        this.passwort = passwort;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAdress() {
        return this.EmailAdress;
    }

    public void setEmailAdress(String EmailAdress) {
        this.EmailAdress = EmailAdress;
    }

    public String getPasswort() {
        return this.passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public UserImpl userId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserImpl username(String username) {
        this.username = username;
        return this;
    }

    public UserImpl EmailAdress(String EmailAdress) {
        this.EmailAdress = EmailAdress;
        return this;
    }

    public UserImpl passwort(String passwort) {
        this.passwort = passwort;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserImpl)) {
            return false;
        }
        UserImpl userImpl = (UserImpl) o;
        return Objects.equals(userId, userImpl.userId) && Objects.equals(username, userImpl.username) && Objects.equals(EmailAdress, userImpl.EmailAdress) && Objects.equals(passwort, userImpl.passwort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, EmailAdress, passwort);
    }

    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", username='" + getUsername() + "'" +
            ", EmailAdress='" + getEmailAdress() + "'" +
            ", passwort='" + getPasswort() + "'" +
            "}";
    }

}
