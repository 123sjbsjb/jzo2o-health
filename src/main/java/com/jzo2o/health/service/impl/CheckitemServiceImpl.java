package com.jzo2o.health.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jzo2o.health.mapper.CheckitemMapper;
import com.jzo2o.health.model.domain.Checkitem;
import com.jzo2o.health.service.ICheckitemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author itcast
 * @since 2023-10-31
 */
@Service
public class CheckitemServiceImpl extends ServiceImpl<CheckitemMapper, Checkitem> implements ICheckitemService {
}
