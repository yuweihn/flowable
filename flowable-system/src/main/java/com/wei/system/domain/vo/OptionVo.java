package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author yuwei
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OptionVo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String value;
    private String label;
}
