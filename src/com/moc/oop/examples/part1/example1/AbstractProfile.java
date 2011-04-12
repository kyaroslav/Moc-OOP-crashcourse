package com.moc.oop.examples.part1.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractProfile {

    private AbstractUser mUser;

    public AbstractProfile(){

    }

    public AbstractUser getmUser() {
        return mUser;
    }

    public void setmUser(AbstractUser mUser) {
        this.mUser = mUser;
    }
}
