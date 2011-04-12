package com.moc.oop.examples.part1.example1.gallery.model;

import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.gallery.GalleryAdminProfile;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 4/12/11
 * Time: 11:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Gallery {

    private AbstractUser owner;
    private boolean saved;
    private boolean approved;
    private String galleryName;

    public Gallery(AbstractUser owner, String galleryName) {
        this.owner = owner;
        this.galleryName = galleryName;
        this.saved = false;
        this.approved = false;
    }

    public String getGalleryName() {
        return galleryName;
    }

    public void setGalleryName(String mGalleryName) {
        this.galleryName = mGalleryName;
    }

    public boolean approve(AbstractUser user) {
        if (user.getProfile() instanceof GalleryAdminProfile) {
            this.approved = true;
        }
        return this.approved;
    }

    public boolean save() {
        this.saved = true;
        return true;
    }

    public boolean isSaved(){
        return this.saved;
    }

    public boolean isApproved(){
        return this.approved;
    }


}
