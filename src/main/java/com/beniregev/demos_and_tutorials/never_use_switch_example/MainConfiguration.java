package com.beniregev.demos_and_tutorials.never_use_switch_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * <div>
 *     This {@code Configuration} class uses <i>Spring framework</i> {@code Scheduling}
 *     different types of messages randomly.
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Configuration
@ComponentScan
@EnableScheduling
public class MainConfiguration {

    /**
     * <div>
     *     <p>
     *         Because all classes that implement {@link MailGenerator} are
     *         annotated with Spring framework <i>@Component</i> annotation
     *         and this class is annotated with Spring framework
     *         <i>ComponentScan</i> annotation then Spring framework already
     *         scanned all the packages of the application and gathered them.
     *     </p>
     *     <p>
     *         This method receives the collection of those classes and
     *         collects them into a {@link Map} to be used later. And how this
     *         method is called? Well, in <i>IntelliJ IDEA</i> press
     *         <i><b>CTRL</b></i> key and click on the method name, and you
     *         will see.
     *     </p>
     *     <p>
     *         <b>Hint:</b> The method is annotated with Spring framework
     *         <i>@Bean</i> annotation, what that means?
     *     </p>
     * </div>
     * @param mailGenerators
     * @return
     */
    @Bean
    public Map<Integer,MailGenerator> generatorMap(List<MailGenerator> mailGenerators) {
        return mailGenerators.stream().collect(toMap(MailGenerator::getMyCode, identity()));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        System.out.println();
    }
}
