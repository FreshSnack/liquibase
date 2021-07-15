package net.snack.liquibase;

import liquibase.util.StringUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * https://blog.csdn.net/liubingyu12345/article/details/78891772
 * http://cn.voidcc.com/question/p-gcefjtkh-dr.html
 * https://blog.csdn.net/Reentrant_Lock/article/details/116200821
 */
@SpringBootApplication
public class LiquibaseApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            //Thread.sleep(10);
            String s = StringUtils.randomIdentifer(1000);
            System.out.println("index: " + i + "->" + s);
            list.add(s);
        }
        System.out.println(list.size());
    }
}
