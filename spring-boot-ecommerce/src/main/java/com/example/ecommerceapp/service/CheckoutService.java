package com.example.ecommerceapp.service;

import com.example.ecommerceapp.dto.Purchase;
import com.example.ecommerceapp.dto.PurchaseResponse;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
