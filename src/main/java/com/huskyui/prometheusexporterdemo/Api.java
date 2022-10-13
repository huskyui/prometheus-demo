package com.huskyui.prometheusexporterdemo;

import io.prometheus.client.Gauge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class Api {

    @Resource
    private Gauge successRateGauge;


    @GetMapping("/successRate")
    public String successRate(@RequestParam("clientType")String clientType){
        Random random = new Random();
        successRateGauge.labels(clientType).set(random.nextInt(100));
        return "ok";
    }

}
