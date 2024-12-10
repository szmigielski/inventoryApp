package com.inventoryapp.inventory.application.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.inventoryapp.inventory.application.model.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long> {
}
