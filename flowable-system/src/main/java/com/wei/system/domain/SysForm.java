package com.wei.system.domain;


import com.wei.common.enums.FormType;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "sys_form")
@Data
public class SysForm implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "hehe")
    private long id;

    @Column(name = "form_name")
    private String formName;

    /**
     * 见{@link FormType}
     */
    @Column(name = "form_type")
    private byte formType;

    @Column(name = "form_content")
    private String formContent;

    @Column(name = "remark")
    private String remark;


    @Version
    @Column(name = "version")
    private int version;

    @Column(name = "creator")
    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modifier")
    private String modifier;

    @Column(name = "modify_time")
    private Date modifyTime;
}
