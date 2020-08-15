package com.cncs.test;

import com.cncs.dao.ItemsDao;
import com.cncs.domain.Items;
import com.cncs.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MybatisTest {

    @Test
    public void findById(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //ItemsDao itemsDao = ac.getBean("itemsDao", ItemsDao.class);
        //Items items = itemsDao.findById(11);
        //System.out.println(items);

        ItemsService itemsService = ac.getBean("itemsService", ItemsService.class);
        Items items = itemsService.findById(11);
        System.out.println(items);
    }
}
