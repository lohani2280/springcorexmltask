package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main( String[] args ){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Movie x_movie = ctx.getBean("MovieA", Movie.class);
        x_movie.printActor();

        Movie y_movie = ctx.getBean("MovieB", Movie.class);
        y_movie.printActor();

        Movie z_movie = ctx.getBean("MovieC", Movie.class);
        z_movie.printActor();

        Movie a_movie = ctx.getBean("MovieD", Movie.class);
        a_movie.printActor();

        ((ConfigurableApplicationContext)ctx).close();
    }
}
