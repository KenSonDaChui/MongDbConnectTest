package com.hutongxue.test.dao;


import com.hutongxue.test.entity.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created By Kenson on 2019/8/17.
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
