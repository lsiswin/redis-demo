package com.cold.redisdemo.service.impl;

import com.cold.redisdemo.entity.ProductClass;
import com.cold.redisdemo.mapper.ProductClassMapper;
import com.cold.redisdemo.service.IProductClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cold
 * @since 2022-07-31
 */
@Service
public class ProductClassServiceImpl extends ServiceImpl<ProductClassMapper, ProductClass> implements IProductClassService {

}
