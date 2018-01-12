package com.zq.learn.springbootlearn.support.startup;


import org.springframework.core.Ordered;

public interface SystemBootAddon extends Ordered {
    void onReady();
}
