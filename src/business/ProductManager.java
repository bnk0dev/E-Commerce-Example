package business;

import core.logging.Logger;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("ürün Fiyatı 10Dan kücük olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) { //[db,mail]
            logger.log(product.getName());
        }

    }
}
