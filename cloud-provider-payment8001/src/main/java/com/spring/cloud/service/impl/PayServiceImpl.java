package com.spring.cloud.service.impl;

import com.spring.cloud.entities.Pay;
import com.spring.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.spring.cloud.mapper.PayMapper;

import java.util.List;

@Service//加入到IOC容器中
public class PayServiceImpl implements PayService {
    @Resource
    PayMapper payMapper;
    @Override
    public int add(Pay pay){
        return payMapper.insertSelective(pay);
    }
    @Override
    public int delete(Integer id){
        return payMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int update(Pay pay){
        return payMapper.updateByPrimaryKeySelective(pay);
    }
    @Override
    public Pay getById(Integer id){
        return payMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Pay> getAll(){
        return payMapper.selectAll();
    }
}
 

 