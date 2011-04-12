package com.moc.oop.examples.part1.example1.blog;

import com.moc.oop.examples.part1.example1.AbstractProfile;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogSimpleUserProfile extends AbstractProfile {


    private String profileShortLink;

    public BlogSimpleUserProfile(String profileShortLink){

        setProfileShortLink(profileShortLink);
    }


    public String getProfileShortLink() {
        return profileShortLink;
    }

    public void setProfileShortLink(String profileShortLink) {
        this.profileShortLink = profileShortLink;
    }
}
