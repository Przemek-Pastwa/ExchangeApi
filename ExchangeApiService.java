package com.devopsi.akademia.exchangeapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExchangeApiService implements ExchangeService {

    private final NbpClientService nbpClientService;

    @Override
    public List<Rate> gelAllRates() {
        return nbpClientService.getForRates().getRates();
    }
}
