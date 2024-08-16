package com.spring.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2023-11-04 15:57
 */
@Configuration
public class RestTemplateConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

//    @Configuration
//    @LoadBalancerClient(
//            //下面的value值大小写一定要和consul里面的名字一样，必须一样
//            value = "cloud-payment-service",configuration = RestTemplateConfig.class)
//    public class RestTemplateConfig
//    {
//        @Bean
//        @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
//        public RestTemplate restTemplate(){
//            return new RestTemplate();
//        }
//
//        @Bean
//        ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment,
//                                                                LoadBalancerClientFactory loadBalancerClientFactory) {
//            String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//
//            return new RandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
//        }
//    }


}


 