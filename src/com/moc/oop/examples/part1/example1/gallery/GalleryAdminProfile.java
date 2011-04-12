package com.moc.oop.examples.part1.example1.gallery;

import com.moc.oop.examples.part1.example1.AbstractProfile;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class GalleryAdminProfile extends AbstractProfile{

    private String firstName;
    private String lastName;

    public GalleryAdminProfile(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
