package com.ruoyi.flowable.domain.dto;


import com.ruoyi.common.annotation.Excel;
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
public class SysFormDto implements Serializable {
	private long id;
	private long formId;
	@Excel(name = "表单名称")
	private String formName;
	private Byte formType;
	@Excel(name = "表单类别")
	private String formTypeName;
	@Excel(name = "表单内容")
	private String formContent;
	private String remark;

	private String creator;
	private String createTime;
	private String modifier;
	private String modifyTime;
}

