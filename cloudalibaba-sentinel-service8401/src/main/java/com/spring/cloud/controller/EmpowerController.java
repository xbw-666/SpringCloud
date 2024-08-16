package com.spring.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class EmpowerController //Empower授权规则，用来处理请求的来源
{
    @GetMapping(value = "/empower")
    @SentinelResource(value = "empower",blockHandler = "dealHandler_Empower")
    public String requestSentinel4(){
        log.info("测试Sentinel授权规则empower");
        return "Sentinel授权规则,嘿嘿~~~";
    }
    public String dealHandler_Empower(BlockException e) {
        log.error("Sentinel授权规则empower触发熔断,异常信息:{}",e.getMessage());
        return "您已被拉入黑名单,异常信息:"+e.getMessage();
    }
}