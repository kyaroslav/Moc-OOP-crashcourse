package com.moc.oop.examples.part1.example1.gallery;

import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.AbstractUserFactory;
import com.moc.oop.examples.part1.example1.gallery.model.Gallery;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class GalleryUserFactory extends AbstractUserFactory {


   private static GalleryUserFactory instance = null;

   private GalleryUserFactory() {
      // Exists only to defeat instantiation.
   }

   public static GalleryUserFactory getInstance() {
      if(instance == null) {
         instance = new GalleryUserFactory();
      }
      return instance;
   }

    @Override
    public AbstractUser createUser(String userName){
        GalleryUser user= new GalleryUser(userName,new GallerySimpleUserProfile(userName));
        return user;
    }

    public GalleryUser createUser(String userName,String galleryName, String profileShortLink){
        GalleryUser user= new GalleryUser(userName,new GallerySimpleUserProfile(profileShortLink));
        user.setGallery(new Gallery(user,galleryName));
        user.getGallery().save();
        return user;
    }

    @Override
    public AbstractUser createAdmin(String userName) {
        GalleryUser user = new GalleryUser(userName, new GalleryAdminProfile(userName, ""));
        return user;
    }

    public GalleryUser createAdmin(String userName, String firstName, String lastName) {
        GalleryUser user = new GalleryUser(userName, new GalleryAdminProfile(firstName, lastName));
        return user;
    }

}
