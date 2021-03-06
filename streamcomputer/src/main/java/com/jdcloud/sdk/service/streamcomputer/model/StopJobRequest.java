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
 * TOPIC相关API
 * 流数据总线topic相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 停止作业运行job
 */
public class StopJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * namespaceId
     * Required:true
     */
    @Required
    private String namespaceId;

    /**
     * jobId
     * Required:true
     */
    @Required
    private Integer jobId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get namespaceId
     *
     * @return
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * set namespaceId
     *
     * @param namespaceId
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * get jobId
     *
     * @return
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * set jobId
     *
     * @param jobId
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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
     * set namespaceId
     *
     * @param namespaceId
     */
    public StopJobRequest namespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * set jobId
     *
     * @param jobId
     */
    public StopJobRequest jobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public StopJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}