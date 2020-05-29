package com.gobeyond.firebase.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gobeyond.firebase.model.SalesOrder;
import com.gobeyond.firebase.repository.SalesOrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class SalesOrderService {

	@Autowired
	private SalesOrderRepository salesOrderRepository;

	public SalesOrder save(SalesOrder order) throws InterruptedException, ExecutionException {

		log.info("-----save sales order data in firebase --------");

		order.setId(UUID.randomUUID() + "");

		return salesOrderRepository.push(order);
	}

	public SalesOrder get(String uuid) {

		log.info("-----get sales order data from firebase --------");

		return salesOrderRepository.get(uuid);
	}

	public List<SalesOrder> getAll(Optional<String> uriVariables) {

		log.info("-----get All sales order data from firebase --------");

		return salesOrderRepository.findAll(uriVariables);
	}

}
