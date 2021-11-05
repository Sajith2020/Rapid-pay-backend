package com.rapidpay.nwsdb.service.custom;

import java.util.List;
import java.util.Optional;
import com.rapidpay.nwsdb.model.NwsdbUser;
import com.rapidpay.nwsdb.service.SuperService;
import org.springframework.stereotype.Service;

@Service
public interface NwsdbUserService extends SuperService {
    public List<NwsdbUser> getAllNwsdbUsers() throws Exception;

    public Optional<NwsdbUser> getNwsdbUser(int id) throws Exception;

    public NwsdbUser saveNwsdbUser(NwsdbUser nwsdbUser) throws Exception;

    public void updateNwsdbUser(NwsdbUser nwsdbUser) throws Exception;

    public void deleteNwsdbUser(int id) throws Exception;
}
