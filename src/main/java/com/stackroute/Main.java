package com.stackroute;

import com.stackroute.domain.Movie;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main( String[] args ){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Movie x_movie = ctx.getBean("movie", Movie.class);
        x_movie.printActor();
    }
}
