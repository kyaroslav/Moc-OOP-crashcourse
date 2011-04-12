package com.moc.oop.examples.part1.example1;

import com.moc.oop.examples.part1.example1.gallery.GalleryUser;
import com.moc.oop.examples.part1.example1.gallery.GalleryUserFactory;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 4/10/11
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {

    public static void main(String[] args) {

        GalleryUser user = GalleryUserFactory.getInstance().createUser("Simple user","Simple user Gallery", "/simpleUser");
        GalleryUser admin = GalleryUserFactory.getInstance().createAdmin("Simple admin","Admin", "Adminenko");

        System.out.println("Is the gallery saved?:"+user.getGallery().isSaved());
        System.out.println("Is the gallery approved?:"+user.getGallery().isApproved());
        System.out.println("Approving....");

        user.getGallery().approve(admin);

        System.out.println("Is the gallery approved?:"+user.getGallery().isSaved());

    }

}

