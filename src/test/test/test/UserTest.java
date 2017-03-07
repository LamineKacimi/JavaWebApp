package test;

import domain.User;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by lkacimi on 3/7/2017.
 */
public class UserTest {
    @org.junit.Test
    public void getId() throws Exception {
        User user = new User();
        assertEquals(0, (int) user.getId());

    }



    @org.junit.Test
    public void getName() throws Exception {
        User u = new User();
        u.setName("abc");
        assertEquals("abc",u.getName());
    }



    @org.junit.Test
    public void getEmail() throws Exception {
        User user = new User();
        user.setEmail("lam@example.com");
        assertEquals("lam@example.com",user.getEmail());
    }



    @org.junit.Test
    public void getBirthDate() throws Exception {
        User user = new User();
        Date date = new Date();
        user.setBirthDate(date);
        assertEquals(date,user.getBirthDate());


    }



}