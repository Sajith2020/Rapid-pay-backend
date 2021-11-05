package com.rapidpay.nwsdb.model;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "nwsdb_user")
public class NwsdbUser implements Serializable {

    @Id
    private int accountNumber;
    private String name;
    private String address;
    private String nic;
    private String other;
}
