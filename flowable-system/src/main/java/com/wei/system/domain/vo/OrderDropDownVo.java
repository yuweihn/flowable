package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDropDownVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long orderId;
	private String fullTitle;
	private String title;
}

