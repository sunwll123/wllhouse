package com.wll.bus.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wll.bus.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wll.bus.vo.CustomerVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * InnoDB free: 9216 kB Mapper 接口
 * </p>
 *
 * @author luoyi-
 * @since 2019-12-05
 */
public interface CustomerMapper extends BaseMapper<Customer> {

    IPage<CustomerVo> selectListByCondition(IPage<CustomerVo> page, @Param("customername") String customername, @Param("phone") String phone, @Param("logisticsName") String logisticsName);

}
