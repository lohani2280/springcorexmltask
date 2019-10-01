package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, ApplicationContextAware, BeanNameAware {
    private Actor actor1;

    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }
    public Actor getActor1() {
        return actor1;
    }

    public Movie(Actor actor){
        this.actor1 = actor;
    }
    public Movie(){}

    public void printActor() {
        actor1.printActorInfo();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application : "+applicationContext);
    }
}
