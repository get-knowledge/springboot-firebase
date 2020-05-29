package com.gobeyond.firebase.api;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gobeyond.firebase.model.SalesOrder;
import com.gobeyond.firebase.service.SalesOrderService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/v1/salesOrder")
@RestController
@Api(tags = "salesOrder")
@Slf4j
@RequiredArgsConstructor
public class SalesOrderApi {

	@Autowired
	private SalesOrderService salesOrderService;

	@PostMapping(value = "/create", produces = "application/json")
	public SalesOrder createSalesOrder(@RequestBody SalesOrder salOrder) throws InterruptedException, ExecutionException {

		log.info("push data :: " + salOrder);

		return salesOrderService.save(salOrder);
	}

	@GetMapping(value = "/get/{uuid}", produces = "application/json")
	public SalesOrder getSalesOrder(@PathVariable String uuid) throws InterruptedException, ExecutionException {

		log.info("--Get the Sales Order Data from firebase --");

		return salesOrderService.get(uuid);
	}
	
	@GetMapping(value = "/getAll", produces = "application/json")
	public List<SalesOrder> getAllSalesOrder(@RequestParam Optional<String> uriVariables) throws InterruptedException, ExecutionException {

		log.info("--Get the Sales Order Data from firebase --");

		return salesOrderService.getAll(uriVariables);
	}
}
