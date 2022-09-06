package org.gangdodan.test;

import org.springframework.stereotype.Service;

@Service
public class myBean implements testBean {

    private String beanName; 

    @Override
    public void init(){
        beanName = "hello spring";
    }

    @Override
    public String get_data(){
        return beanName;
    }

}
