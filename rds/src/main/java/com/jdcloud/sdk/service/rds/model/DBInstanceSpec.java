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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * dBInstanceSpec
 */
public class DBInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库实例名，如不填则缺省为instanceId
     */
    private String instanceName;

    /**
     * 数据库类型 MySQL|SQL Server
     * Required:true
     */
    @Required
    private String engine;

    /**
     * 数据库版本 MySQL支持5.6、5.7  SQL Server支持2008 R2、2012 EE、2014 EE、2016 EE
     * Required:true
     */
    @Required
    private String engineVersion;

    /**
     * 实例规格代码
     * Required:true
     */
    @Required
    private String instanceClass;

    /**
     * 磁盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer instanceStorageGB;

    /**
     * 可用区ID， 第一个ID必须为主实例所在的可用区。如两个可用区一样，也需输入两个azId
     * Required:true
     */
    @Required
    private List<String> azId;

    /**
     * VPC的ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 计费配置
     * Required:true
     */
    @Required
    private ChargeSpec chargeSpec;


    /**
     * get 数据库实例名，如不填则缺省为instanceId
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 数据库实例名，如不填则缺省为instanceId
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 数据库类型 MySQL|SQL Server
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 数据库类型 MySQL|SQL Server
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 数据库版本 MySQL支持5.6、5.7  SQL Server支持2008 R2、2012 EE、2014 EE、2016 EE
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 数据库版本 MySQL支持5.6、5.7  SQL Server支持2008 R2、2012 EE、2014 EE、2016 EE
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 实例规格代码
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格代码
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 磁盘大小，单位GB
     *
     * @return
     */
    public Integer getInstanceStorageGB() {
        return instanceStorageGB;
    }

    /**
     * set 磁盘大小，单位GB
     *
     * @param instanceStorageGB
     */
    public void setInstanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
    }

    /**
     * get 可用区ID， 第一个ID必须为主实例所在的可用区。如两个可用区一样，也需输入两个azId
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set 可用区ID， 第一个ID必须为主实例所在的可用区。如两个可用区一样，也需输入两个azId
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费配置
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }


    /**
     * set 数据库实例名，如不填则缺省为instanceId
     *
     * @param instanceName
     */
    public DBInstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 数据库类型 MySQL|SQL Server
     *
     * @param engine
     */
    public DBInstanceSpec engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 数据库版本 MySQL支持5.6、5.7  SQL Server支持2008 R2、2012 EE、2014 EE、2016 EE
     *
     * @param engineVersion
     */
    public DBInstanceSpec engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 实例规格代码
     *
     * @param instanceClass
     */
    public DBInstanceSpec instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 磁盘大小，单位GB
     *
     * @param instanceStorageGB
     */
    public DBInstanceSpec instanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
        return this;
    }

    /**
     * set 可用区ID， 第一个ID必须为主实例所在的可用区。如两个可用区一样，也需输入两个azId
     *
     * @param azId
     */
    public DBInstanceSpec azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set VPC的ID
     *
     * @param vpcId
     */
    public DBInstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public DBInstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param chargeSpec
     */
    public DBInstanceSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }


    /**
     * add item to 可用区ID， 第一个ID必须为主实例所在的可用区。如两个可用区一样，也需输入两个azId
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

}