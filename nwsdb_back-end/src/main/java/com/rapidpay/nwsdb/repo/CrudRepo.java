package com.rapidpay.nwsdb.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CrudRepo<T, ID> extends MongoRepository<T, ID>, SuperRepo {

}
