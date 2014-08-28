package main;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import web.GreetService;

public class GreetApp extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

    }

    @Override
    public void run(Configuration config, Environment env) throws Exception {
        env.jersey().register(GreetService.class);
    }

    public static void main(String[] args) throws Exception {
        new GreetApp().run(args);
    }
}
