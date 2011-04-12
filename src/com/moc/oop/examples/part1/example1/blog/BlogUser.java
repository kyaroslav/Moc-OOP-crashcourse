package com.moc.oop.examples.part1.example1.blog;

import com.moc.oop.examples.part1.example1.AbstractProfile;
import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.blog.model.Blog;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogUser extends AbstractUser{

    private Blog blog;

    public Blog getBlog(){
        return this.blog;
    }

    public void setBlog(Blog blog){
         this.blog=blog;
    }

    public BlogUser(String userName){
        this.setLogin(userName);
    }
}
