package cn.ibengbeng.customer.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "cn.ibengbeng.book")
public class BookServiceProperties {
    private String title;
    private String author;
    private String isbn;
}
