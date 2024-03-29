package com.hutongxue.test.dao;

import com.hutongxue.test.entity.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created By Kenson on 2019/8/22.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testfindAll() {
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }
}