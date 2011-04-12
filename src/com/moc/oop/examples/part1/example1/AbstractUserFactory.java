package com.moc.oop.examples.part1.example1;



/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractUserFactory {


    abstract public AbstractUser createUser(String userName);

    abstract public AbstractUser createAdmin(String userName);

}
