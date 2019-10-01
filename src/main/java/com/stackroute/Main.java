package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main( String[] args ){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Movie x_movie = ctx.getBean("MovieA", Movie.class);
        System.out.println(x_movie);
        x_movie.printActor();

        Movie y_movie = ctx.getBean("MovieB", Movie.class);
        y_movie.printActor();
        System.out.println(y_movie);
        System.out.println(x_movie == y_movie);
    }
}
