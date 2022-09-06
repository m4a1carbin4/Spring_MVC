package org.gangdodan.test.test_service;

import org.gangdodan.test.testBean;
import org.springframework.stereotype.Service;

@Service
public class nameService implements testService {
    
    private String name;
    private testBean tBean;

    nameService(testBean testinput){
        this.tBean = testinput;
        this.init();
    }

    @Override
    public void init() {

        name = new String();
        tBean.init();

    }

    @Override
    public void set_data(String input) {
        
        name = input;
        
    }

    @Override
    public String get_data() {
        return name +" "+ tBean.get_data();
    }


}
