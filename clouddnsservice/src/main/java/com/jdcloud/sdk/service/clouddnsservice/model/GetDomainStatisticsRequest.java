/*
 * Copyright 2018 JDCLOUD.COM
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
 * 域名
 * 云解析OpenAPI域名接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看域名的查询流量
 */
public class GetDomainStatisticsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询动作，&quot;query&quot;查询流量，&quot;resolve&quot;解析流量
     * Required:true
     */
    @Required
    private String action;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 起始时间, UTC时间例如2017-11-10T23:00:00Z
     * Required:true
     */
    @Required
    private String start;

    /**
     * 终止时间, UTC时间例如2017-11-10T23:00:00Z
     * Required:true
     */
    @Required
    private String end;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get 查询动作，&quot;query&quot;查询流量，&quot;resolve&quot;解析流量
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 查询动作，&quot;query&quot;查询流量，&quot;resolve&quot;解析流量
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 起始时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @return
     */
    public String getStart() {
        return start;
    }

    /**
     * set 起始时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @param start
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * get 终止时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @return
     */
    public String getEnd() {
        return end;
    }

    /**
     * set 终止时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @param end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 域名ID
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set 查询动作，&quot;query&quot;查询流量，&quot;resolve&quot;解析流量
     *
     * @param action
     */
    public GetDomainStatisticsRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 域名
     *
     * @param domainName
     */
    public GetDomainStatisticsRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 起始时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @param start
     */
    public GetDomainStatisticsRequest start(String start) {
        this.start = start;
        return this;
    }

    /**
     * set 终止时间, UTC时间例如2017-11-10T23:00:00Z
     *
     * @param end
     */
    public GetDomainStatisticsRequest end(String end) {
        this.end = end;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public GetDomainStatisticsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public GetDomainStatisticsRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


}