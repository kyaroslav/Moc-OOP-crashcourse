package com.moc.oop.examples.part1.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
abstract public class AbstractUser {

    private String login;
    private AbstractProfile profile;

    public AbstractUser(){

    }

    public AbstractUser(String userName, AbstractProfile profile){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public AbstractProfile getProfile() {
        return profile;
    }

    public void setProfile(AbstractProfile profile) {
        this.profile = profile;
    }
}
