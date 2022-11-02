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
public class UserDropDownVo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private String userName;
    private String nickName;
}
