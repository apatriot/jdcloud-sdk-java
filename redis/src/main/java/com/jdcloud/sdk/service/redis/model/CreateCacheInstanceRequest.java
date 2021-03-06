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
 * 缓存Redis实例接口
 * 缓存Redis实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.redis.model.CacheInstanceSpec;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个指定配置的缓存Redis实例
 */
public class CreateCacheInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cacheInstance
     * Required:true
     */
    @Required
    private CacheInstanceSpec cacheInstance;

    /**
     * charge
     */
    private ChargeSpec charge;

    /**
     * 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get cacheInstance
     *
     * @return
     */
    public CacheInstanceSpec getCacheInstance() {
        return cacheInstance;
    }

    /**
     * set cacheInstance
     *
     * @param cacheInstance
     */
    public void setCacheInstance(CacheInstanceSpec cacheInstance) {
        this.cacheInstance = cacheInstance;
    }

    /**
     * get charge
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set charge
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }

    /**
     * get 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set cacheInstance
     *
     * @param cacheInstance
     */
    public CreateCacheInstanceRequest cacheInstance(CacheInstanceSpec cacheInstance) {
        this.cacheInstance = cacheInstance;
        return this;
    }

    /**
     * set charge
     *
     * @param charge
     */
    public CreateCacheInstanceRequest charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public CreateCacheInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}