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
 * 审计管理
 * 审计管理相关接口
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
 * 修改当前审计选项&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
 */
public class ModifyAuditRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 增加审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP
     */
    private String add;

    /**
     * 删除审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP如删除了所有审计项，则审计自动关闭
     */
    private String drop;

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
     * get 增加审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP
     *
     * @return
     */
    public String getAdd() {
        return add;
    }

    /**
     * set 增加审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP
     *
     * @param add
     */
    public void setAdd(String add) {
        this.add = add;
    }

    /**
     * get 删除审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP如删除了所有审计项，则审计自动关闭
     *
     * @return
     */
    public String getDrop() {
        return drop;
    }

    /**
     * set 删除审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP如删除了所有审计项，则审计自动关闭
     *
     * @param drop
     */
    public void setDrop(String drop) {
        this.drop = drop;
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
     * set 增加审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP
     *
     * @param add
     */
    public ModifyAuditRequest add(String add) {
        this.add = add;
        return this;
    }

    /**
     * set 删除审计项，多个审计项之间用英文逗号，分号或空格分隔，例如DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP如删除了所有审计项，则审计自动关闭
     *
     * @param drop
     */
    public ModifyAuditRequest drop(String drop) {
        this.drop = drop;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyAuditRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public ModifyAuditRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}