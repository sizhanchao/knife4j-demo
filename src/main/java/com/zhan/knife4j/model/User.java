package com.zhan.knife4j.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author zhan
 * @since 2020-12-29 17:43
 */
@ApiModel("登录用户")
@Data
public class User {
    private String teacherType;
    @ApiModelProperty("教工id")
    private Long empId;
    @ApiModelProperty("工号")
    private String empNo;
    @ApiModelProperty("姓名")
    private String empName;
    @ApiModelProperty("区域类型")
    private String areaType;
    @ApiModelProperty(value = "首次授课时间")
    private Date giveLessonsStartAt;
    @ApiModelProperty("课程职级名称-课酬职级")
    private String professionLevel;
    @ApiModelProperty("课时费")
    private Integer classFee;
    @ApiModelProperty("是否在岗 0:可授课  1:不可授课")
    private String onGuard;
    @ApiModelProperty("讲授擅长领域")
    private String adeptTerritory;
    @ApiModelProperty("简介信息")
    private String intro;
    @ApiModelProperty("综合介绍")
    private String comprehensiveIntro;
    @ApiModelProperty("教研室")
    private String teachingOffice;
    @ApiModelProperty("备注")
    private String remark;
}
