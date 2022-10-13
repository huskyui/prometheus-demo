package com.huskyui.prometheusexporterdemo;

import io.prometheus.client.Gauge;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class Api {

    @Resource
    private Gauge successRateGauge;


    @PostMapping("/successRate")
    public String successRate(@RequestBody ClientTypeRequest request){
        Random random = new Random();
        successRateGauge.labels(request.getClientType()).set(random.nextInt(100));
        return "ok";
    }

}
