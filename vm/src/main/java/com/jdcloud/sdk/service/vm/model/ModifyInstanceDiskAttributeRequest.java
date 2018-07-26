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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.InstanceDiskAttribute;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改云主机挂载的数据盘属性，包括是否随主机删除。

 */
public class ModifyInstanceDiskAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘列表
     */
    private List<InstanceDiskAttribute> dataDisks;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 云硬盘列表
     *
     * @return
     */
    public List<InstanceDiskAttribute> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 云硬盘列表
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttribute> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 云硬盘列表
     *
     * @param dataDisks
     */
    public ModifyInstanceDiskAttributeRequest dataDisks(List<InstanceDiskAttribute> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ModifyInstanceDiskAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public ModifyInstanceDiskAttributeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * add item to 云硬盘列表
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttribute dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

}