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
 * TOPIC相关 API
 * 流数据总线topic相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streambus.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除topic
 */
public class DeleteTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     * Required:true
     */
    @Required
    private String name;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * set name
     *
     * @param name
     */
    public DeleteTopicRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}