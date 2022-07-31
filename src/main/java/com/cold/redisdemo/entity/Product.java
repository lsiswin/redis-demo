package com.cold.redisdemo.entity;

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
  public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private String name;

    private String price;

    private Integer classId;

    private String imgUrl;


}
