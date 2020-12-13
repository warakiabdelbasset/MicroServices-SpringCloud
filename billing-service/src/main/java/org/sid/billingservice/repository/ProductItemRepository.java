package org.sid.billingservice.repository;

import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.sid.billingservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Collection;


public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
public Collection<ProductItem> findByBillId(Long id);
}
