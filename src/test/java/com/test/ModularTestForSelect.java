package com.test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ModularTestForSelect {

    UserRepository dd;
    @Autowired
    public void setDd(UserRepository dd) {
        this.dd = dd;
    }

    @Test
    public void  TestSelect()
    {

        Assert.assertNotNull(dd.getPass());
        Assert.assertNotNull(dd.findAll());
    }
}
