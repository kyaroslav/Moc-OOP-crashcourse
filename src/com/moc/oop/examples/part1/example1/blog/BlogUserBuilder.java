package com.moc.oop.examples.part1.example1.blog;

import com.moc.oop.examples.part1.example1.AbstractProfile;
import com.moc.oop.examples.part1.example1.AbstractUser;
import com.moc.oop.examples.part1.example1.AbstractUserFactory;
import com.moc.oop.examples.part1.example1.blog.model.Blog;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 3/22/11
 * Time: 1:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogUserBuilder {

    private AbstractUser user;
    private AbstractProfile profile;
    private Blog blog;


    public BlogUserBuilder createUser(String userName) {
        this.user = new BlogUser(userName);
        return this;
    }

    public BlogUserBuilder createSimpleUserProfile(String profileShortLink) {
        this.profile = new BlogSimpleUserProfile(profileShortLink);
        return this;
    }

    public BlogUserBuilder createAdminProfile(String firstName, String lastName) {
        this.profile = new BlogAdminProfile(firstName, lastName);
        return this;
    }

    public BlogUserBuilder createBlog(String blogName) {
        this.blog=new Blog(null,blogName);
        return this;
    }

    public BlogUser getBlogUser() {
        this.user.setProfile(this.profile);
        if (this.profile instanceof BlogSimpleUserProfile){
            this.blog.setOwner(this.user);
            ((BlogUser)this.user).setBlog(this.blog);
        }
        return (BlogUser) this.user;
    }

}
