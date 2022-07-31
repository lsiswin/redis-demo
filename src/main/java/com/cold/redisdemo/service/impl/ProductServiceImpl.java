package com.cold.redisdemo.service.impl;

import com.cold.redisdemo.entity.Product;
import com.cold.redisdemo.mapper.ProductMapper;
import com.cold.redisdemo.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
