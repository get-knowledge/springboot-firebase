package com.gobeyond.firebase.repository;

import org.springframework.stereotype.Repository;

import com.gobeyond.firebase.model.SalesOrder;
import com.gobeyond.firebase.util.repository.DefaultFirebaseRealtimeDatabaseRepository;

@Repository
public class SalesOrderRepository extends DefaultFirebaseRealtimeDatabaseRepository<SalesOrder, String> {

}
