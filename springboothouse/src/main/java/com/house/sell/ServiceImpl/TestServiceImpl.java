package com.house.sell.ServiceImpl;

import com.house.sell.dao.HuserMapper;
import com.house.sell.model.Huser;
import com.house.sell.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengli on 2018/4/25.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private HuserMapper huserMapper;
    @Override
    public Huser findById(Long id) {
        return huserMapper.findById(id);

    }
}
