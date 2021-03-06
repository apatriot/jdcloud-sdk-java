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
 * 媒体处理相关接口
 * 媒体处理API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * thumbnailStatus
 */
public class ThumbnailStatus  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态 (SUCESS, ERROR, PENDDING, RUNNING)
     * Required:true
     */
    @Required
    private String status;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 成功时生成的截图文件个数
     */
    private Integer count;


    /**
     * get 状态 (SUCESS, ERROR, PENDDING, RUNNING)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态 (SUCESS, ERROR, PENDDING, RUNNING)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 错误码
     *
     * @return
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * get 成功时生成的截图文件个数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 成功时生成的截图文件个数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * set 状态 (SUCESS, ERROR, PENDDING, RUNNING)
     *
     * @param status
     */
    public ThumbnailStatus status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public ThumbnailStatus errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set 成功时生成的截图文件个数
     *
     * @param count
     */
    public ThumbnailStatus count(Integer count) {
        this.count = count;
        return this;
    }


}