package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazilir... SQL
        System.out.println("Hibernate Ile Veri Tabanına Eklendi");
    }
}
