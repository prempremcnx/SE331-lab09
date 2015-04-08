package camt.se331.shoppingcart;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by kourin.pear on 8/4/2558.
 */
@Component
@Profile("db.init")
public class DatabaseInitializationBean implements InitializingBean{
    @Autowired
    ProductRepository productRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        Product[] initProduct= {
            new Product(1l,"Kindle","The good book",6900.00),
            new Product(2l,"Surface Pro","The unknow computer",34000.00),
            new Product(3l,"Mac Pro","Mac book",44000.00),
            new Product(4l,"Candle","use for light",10.00),
            new Product(5l,"Bin","Use for",200.00),
            new Product(6l,"Telephone","call for other",150.00),
            new Product(7l,"Iphone","what is it",26000.00),
            new Product(8l,"Galaxy 4","zzzzx",24000.00),
            new Product(9l,"Angular JS","hat it!",2000.00),
            new Product(10l,"Mazda","sdfdfdff",300000.00)
        };
        productRepository.save(Arrays.asList(initProduct));
        productRepository.save(new Product(1l,"Kindle","The good book",6900.00));
    }
}
