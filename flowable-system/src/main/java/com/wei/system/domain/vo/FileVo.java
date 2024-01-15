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
public class FileVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;
	private String key;
	private String url;
	private String url2;
}
