/*
 * Copyright 2018-2025 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 云监控规则相关接口
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询报警历史
 */
public class DescribeAlarmHistoryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警规则的Id
     */
    private String id;

    /**
     * 产品名称
     */
    private String serviceCode;

    /**
     * 资源Id
     */
    private String resourceId;

    /**
     * 查询数据开始时间，默认24小时前，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询数据结束时间，默认当前时间，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 当前所在页，默认为1
     */
    private Integer pageNumber;

    /**
     * ，默认为20；取值范围[1, 100]
     */
    private Integer pageSize;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 报警规则的Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 报警规则的Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源Id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 查询数据开始时间，默认24小时前，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询数据开始时间，默认24小时前，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询数据结束时间，默认当前时间，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询数据结束时间，默认当前时间，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 当前所在页，默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get ，默认为20；取值范围[1, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set ，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 报警规则的Id
     *
     * @param id
     */
    public DescribeAlarmHistoryRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public DescribeAlarmHistoryRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public DescribeAlarmHistoryRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 查询数据开始时间，默认24小时前，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @param startTime
     */
    public DescribeAlarmHistoryRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询数据结束时间，默认当前时间，可以输入long型时间，也可以输入yyyy-MM-dd&#39;T&#39;HH:mm:ssZ类型时间
     *
     * @param endTime
     */
    public DescribeAlarmHistoryRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public DescribeAlarmHistoryRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set ，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public DescribeAlarmHistoryRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeAlarmHistoryRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}