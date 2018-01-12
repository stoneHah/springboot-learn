package com.zq.learn.springbootlearn.service.impl;

import com.zq.learn.springbootlearn.model.Car;
import com.zq.learn.springbootlearn.model.User;
import com.zq.learn.springbootlearn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author qun.zheng
 * @create 2018/1/12
 **/
@Service
public class UserServiceImpl implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @Cacheable(cacheNames = "users")
    public User getUser(int userId) {
        logger.info("get user invoke");
        User user = new User(userId, "zq");

        List<Car> cars = getCars(userId);
        return user;
    }

    private List<Car> getCars(int userId){
        logger.info("get cars invoke");
        return Collections.singletonList(new Car("suvj","bmw"));
    }
}
