package com.moc.oop.examples.part1.example1.gallery;

import com.moc.oop.examples.part1.example1.AbstractProfile;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class GallerySimpleUserProfile extends AbstractProfile {

    private String profileShortLink;

    public GallerySimpleUserProfile(String profileShortLink){

        setProfileShortLink(profileShortLink);
    }



    public String getProfileShortLink() {
        return profileShortLink;
    }

    public void setProfileShortLink(String profileShortLink) {
        this.profileShortLink = profileShortLink;
    }
}
