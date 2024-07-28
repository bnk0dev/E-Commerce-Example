package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao{
//dataAccessObject

    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazilir... SQL
        System.out.println("JDBC Ile Veri Tabanına Eklendi");
    }

}