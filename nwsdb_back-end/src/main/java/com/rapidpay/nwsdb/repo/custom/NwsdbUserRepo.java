package com.rapidpay.nwsdb.repo.custom;

import com.rapidpay.nwsdb.model.NwsdbUser;
import com.rapidpay.nwsdb.repo.CrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface NwsdbUserRepo extends CrudRepo<NwsdbUser, Integer> {

}