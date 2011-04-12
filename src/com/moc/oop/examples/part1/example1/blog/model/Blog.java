package com.moc.oop.examples.part1.example1.blog.model;

import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.blog.BlogAdminProfile;
import com.moc.oop.examples.part1.example1.gallery.GalleryAdminProfile;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 4/13/11
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Blog {
    private AbstractUser owner;
    private boolean saved;
    private boolean approved;
    private String blogName;

    public Blog(AbstractUser owner, String blogName) {
        this.owner = owner;
        this.blogName=blogName;
        this.saved = false;
        this.approved = false;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public boolean approve(AbstractUser user) {
        if (user.getProfile() instanceof BlogAdminProfile) {
            this.approved = true;
        }
        return this.approved;
    }

    public boolean save() {
        this.saved = true;
        return true;
    }

    public boolean isSaved() {
        return this.saved;
    }

    public boolean isApproved() {
        return this.approved;
    }

    public void setOwner(AbstractUser owner){
        this.owner=owner;
    }


}
