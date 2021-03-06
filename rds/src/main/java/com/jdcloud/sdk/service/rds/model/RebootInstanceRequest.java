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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 重启RDS实例&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
 */
public class RebootInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否重启主节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     */
    private Boolean rebootMaster;

    /**
     * 是否重启从节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     */
    private Boolean rebootSlave;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 是否重启主节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @return
     */
    public Boolean getRebootMaster() {
        return rebootMaster;
    }

    /**
     * set 是否重启主节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @param rebootMaster
     */
    public void setRebootMaster(Boolean rebootMaster) {
        this.rebootMaster = rebootMaster;
    }

    /**
     * get 是否重启从节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @return
     */
    public Boolean getRebootSlave() {
        return rebootSlave;
    }

    /**
     * set 是否重启从节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @param rebootSlave
     */
    public void setRebootSlave(Boolean rebootSlave) {
        this.rebootSlave = rebootSlave;
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
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 是否重启主节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @param rebootMaster
     */
    public RebootInstanceRequest rebootMaster(Boolean rebootMaster) {
        this.rebootMaster = rebootMaster;
        return this;
    }

    /**
     * set 是否重启从节点。&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
     *
     * @param rebootSlave
     */
    public RebootInstanceRequest rebootSlave(Boolean rebootSlave) {
        this.rebootSlave = rebootSlave;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public RebootInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public RebootInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}