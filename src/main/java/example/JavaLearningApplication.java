package example;

import example.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JavaLearningApplication extends Application<JavaLearningConfiguration> {

    public static void main(final String[] args) throws Exception {
        new JavaLearningApplication().run(args);
    }

    @Override
    public String getName() {
        return "Java-Learning";
    }

    @Override
    public void initialize(final Bootstrap<JavaLearningConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(final JavaLearningConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName());
        environment.jersey().register(resource);
    }

}
