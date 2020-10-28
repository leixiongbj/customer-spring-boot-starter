package cn.ibengbeng.customer;


import cn.ibengbeng.customer.properties.BookServiceProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(BookService.class)
@ConditionalOnProperty(prefix = "cn.ibengbeng.book",value = "enable",matchIfMissing = true)
@EnableConfigurationProperties(BookServiceProperties.class)
public class BookAutoConfiguration {

    @Bean
    public BookService bookService(BookServiceProperties bookServiceProperties){
        return new BookService(bookServiceProperties );
    }
}
