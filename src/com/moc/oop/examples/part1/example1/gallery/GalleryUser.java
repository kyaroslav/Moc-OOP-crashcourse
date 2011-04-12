package com.moc.oop.examples.part1.example1.gallery;

import com.moc.oop.examples.part1.example1.AbstractProfile;
import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.gallery.model.Gallery;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class GalleryUser extends AbstractUser{

    private Gallery gallery;

    public GalleryUser(String userName, AbstractProfile profile){
        this.setLogin(userName);
        this.setProfile(profile);
    }

    public Gallery getGallery(){
        return this.gallery;
    }

    public void setGallery(Gallery gallery){
         this.gallery=gallery;
    }
}
