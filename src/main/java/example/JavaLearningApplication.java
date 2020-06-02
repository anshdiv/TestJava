package example;

import example.auth.OAuthUserAuthenticator;
import example.auth.UserAuthenticator;
import example.auth.UserAuthorizer;
import example.core.models.User;
import example.resources.CustomerResource;
import example.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.auth.oauth.OAuthCredentialAuthFilter;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.jdbi.v3.core.Jdbi;


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
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "sqlserver");
        environment.jersey().register(new CustomerResource(jdbi));
       /* environment.jersey().register(new AuthDynamicFeature(
                new BasicCredentialAuthFilter.Builder<User>()
                        .setAuthenticator(new UserAuthenticator())
                        .setRealm("SUPER SECRET STUFF")
                        .buildAuthFilter()));*/
        environment.jersey().register(new AuthDynamicFeature(
                new OAuthCredentialAuthFilter.Builder<User>()
                        .setAuthenticator(new OAuthUserAuthenticator())
                        .setAuthorizer(new UserAuthorizer())
                        .setPrefix("Bearer")
                        .buildAuthFilter()));
        environment.jersey().register(RolesAllowedDynamicFeature.class);
        environment.jersey().register(new AuthValueFactoryProvider.Binder<>(User.class));
        environment.jersey().register(resource);
    }

}
