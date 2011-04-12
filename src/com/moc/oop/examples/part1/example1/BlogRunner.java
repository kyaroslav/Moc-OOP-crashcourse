package com.moc.oop.examples.part1.example1;

import com.moc.oop.examples.part1.example1.blog.*;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 4/13/11
 * Time: 1:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogRunner {


    public static void main(String[] args) {
        BlogUser admin = BlogDirector.createAdminBlogUser("admin", "Admin", "Adminenko");
        BlogUser user = BlogDirector.createSimpleBlogUser("user","Simple Blog","userLink");

        System.out.println("Admin User:" + admin.getLogin());
        System.out.println("Admin User Full Name:"+((BlogAdminProfile) admin.getProfile()).getFullName());
        System.out.println("-----------------");
        System.out.println("Simple User:" + user.getLogin());
        System.out.println("Simple User Blog name:" + user.getBlog().getBlogName());
        System.out.println("Simple User Blog short link:" + ((BlogSimpleUserProfile)user.getProfile()).getProfileShortLink());
    }

}
