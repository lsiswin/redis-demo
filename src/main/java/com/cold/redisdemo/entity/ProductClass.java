package com.cold.redisdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author cold
 * @since 2022-07-31
 */
@Getter
@Setter
  @TableName("product_class")
public class ProductClass implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private String class;


}
