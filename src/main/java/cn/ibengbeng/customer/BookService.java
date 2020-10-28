package cn.ibengbeng.customer;


import cn.ibengbeng.customer.properties.BookServiceProperties;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BookService {

    private BookServiceProperties bookServiceProperties;

    public String print(){
        return "title:" + bookServiceProperties.getTitle() + "\n"
                + "author:" + bookServiceProperties.getAuthor() + "\n"
                + "isbn:" + bookServiceProperties.getIsbn();
    }
}
