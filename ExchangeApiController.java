package com.devopsi.akademia.exchangeapi;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nbp")
@AllArgsConstructor

public abstract class ExchangeApiController {


//    public static NbpClientService nbpClientService;
    public static ExchangeApiService exchangeApiService;


    @GetMapping("rates")
    public ResponseEntity<List<Rate>> getForRates() {
        return ResponseEntity.ok(exchangeApiService.gelAllRates());
    }


}

