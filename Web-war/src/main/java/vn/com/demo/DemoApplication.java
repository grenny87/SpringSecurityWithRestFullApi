
package vn.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

/**
 * <b>RentalReportApplication</b>.<br>
 * RentalReportApplication class container<br>
 * ------------------------<br>
 * History:<br>
 * 2016-06-30 - TrungLHB - Initial<br>
 *
 * @author TrungLHB
 */
@ComponentScan({ "vn.com.demo" })
@SpringBootApplication
@EnableCaching
public class DemoApplication extends SpringBootServletInitializer
                                                            implements WebApplicationInitializer {
    /**
     * main method<br>
     * ------------------------<br>
     * History:<br>
     * 2016-06-30 - TrungLHB - Initial<br>
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
}
