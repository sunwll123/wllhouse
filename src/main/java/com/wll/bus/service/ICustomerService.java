package com.wll.bus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wll.bus.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wll.bus.vo.CustomerVo;

/**
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 *
 * @author luoyi-
 * @since 2019-12-05
 */
public interface ICustomerService extends IService<Customer> {

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    void deleteCustomerById(Integer id);

    IPage<CustomerVo> list(CustomerVo customerVo);
}
