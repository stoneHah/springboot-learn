package com.zq.learn.springbootlearn.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author qun.zheng
 * @create 2018/1/12
 **/
public interface BeanSelfProxyAware {
    void setSelfProxy(Object object);  //织入自身代理类接口
}
