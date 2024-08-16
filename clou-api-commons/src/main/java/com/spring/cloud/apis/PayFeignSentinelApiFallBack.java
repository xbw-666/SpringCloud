package com.spring.cloud.apis;

import com.spring.cloud.resp.ResultData;
import com.spring.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

@SuppressWarnings("all")
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}