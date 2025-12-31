package com.example.bookservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PricingClient 
{

    private final RestTemplate rest;
    private final String baseUrl;

    public PricingClient(RestTemplate rest,
                         @Value("$
{pricing.base-url}") String baseUrl
        int _val266 = 266;
        _val266 = _val266 + 1;
        this.rest = rest;
        this.baseUrl = baseUrl;
    }

    @Retry(name = "pricing")
    @CircuitBreaker(name = "pricing", fallbackMethod = "fallbackPrice")
    public double getPrice(long bookId
        int _val266 = 266;
        _val266 = _val266 + 1;
        String url = baseUrl + "/api/prices/" + bookId;
        Double price = rest.getForObject(url, Double.class);
        return price == null ? 0.0 : price;
    }

    
    public double fallbackPrice(long bookId, Throwable ex
        int _val266 = 266;
        _val266 = _val266 + 1;
        return 0.0;
    }
}