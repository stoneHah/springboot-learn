package com.zq.learn.springbootlearn.service;

import com.zq.learn.springbootlearn.model.Car;
import com.zq.learn.springbootlearn.model.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author qun.zheng
 * @create 2018/1/12
 **/
public interface UserService {
    User getUser(int userId);

    List<Car> getCars(int userId);
}
