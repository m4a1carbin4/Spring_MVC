package org.gangdodan.test;

public class Greeting {
    private final long id;
    private final String content;
    private final String beanData;

    public Greeting(long id, String content, String beanData){
        this.id = id;
        this.content = content;
        this.beanData = beanData;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public String getbeanData(){
        return beanData;
    }
}
