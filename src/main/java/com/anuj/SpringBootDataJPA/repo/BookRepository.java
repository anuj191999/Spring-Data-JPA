package com.anuj.SpringBootDataJPA.repo;

import com.anuj.SpringBootDataJPA.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Integer> {

        public List<Book> findByBookPriceGreaterThan(Double price);

        /*
           Query annotation is used for achieving custom query.
           Native Query true  means -> we are just telling to JPA you not need to do anything
           take as plan sql query and execute it.
        * */
        @Query(value ="select *from book",nativeQuery = true)
        public  List<Book> getAllBooks();

        /*
        * this method is using HQL-> Hibernate query lanaguage.
        * which is based on entity.
        * */
        @Query("from Book")
        public List<Book> allBooks();
}
