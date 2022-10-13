package com.huskyui.prometheusexporterdemo;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class PromusConfig {

    @Resource
    private CollectorRegistry collectorRegistry;


    @Bean
    public Counter requestTotalCountCollector(){
        return  Counter.build()
                .name("http_requests_total")
                .labelNames("path", "method", "code")
                .help("http请求总计数").register(collectorRegistry);
    }

    @Bean
    public Gauge successRateGauge(){
        return Gauge.build()
                .name("order_success_rate")
                .labelNames("client_type")
                .help("订单成功率")
                .register(collectorRegistry);
    }

}
