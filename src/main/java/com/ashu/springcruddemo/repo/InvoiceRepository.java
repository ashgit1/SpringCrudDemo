package com.ashu.springcruddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ashu.springcruddemo.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
