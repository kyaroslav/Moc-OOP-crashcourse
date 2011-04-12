package com.moc.oop.examples.part1.example1.blog;

import com.moc.oop.examples.part1.example1.AbstractUser;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 4/13/11
 * Time: 1:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogDirector {


    public static BlogUser createSimpleBlogUser(String userName, String blogName, String profileShortLink){
        BlogUserBuilder builder = new BlogUserBuilder();
        return builder.createUser(userName).createSimpleUserProfile(profileShortLink).createBlog(blogName).getBlogUser();
    }

    public static BlogUser createAdminBlogUser(String userName, String firstName, String secondName){
        BlogUserBuilder builder = new BlogUserBuilder();
        return builder.createUser(userName).createAdminProfile(firstName,secondName).getBlogUser();
    }


}
