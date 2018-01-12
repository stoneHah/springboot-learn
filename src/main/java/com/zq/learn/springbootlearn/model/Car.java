package com.zq.learn.springbootlearn.model;

/**
 * ${DESCRIPTION}
 *
 * @author qun.zheng
 * @create 2018/1/12
 **/
public class Car {
    private String id;
    private String model;

    public Car() {
    }

    public Car(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
