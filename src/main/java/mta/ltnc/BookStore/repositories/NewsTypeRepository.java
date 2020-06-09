package mta.ltnc.BookStore.repositories;

import mta.ltnc.BookStore.entity.NewsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Repository
public interface NewsTypeRepository extends JpaRepository<NewsType, Integer>, JpaSpecificationExecutor<NewsType> {

}