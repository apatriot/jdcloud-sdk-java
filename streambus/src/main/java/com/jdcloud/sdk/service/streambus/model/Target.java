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

package com.jdcloud.sdk.service.streambus.model;


/**
 * target
 */
public class Target  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要归档的目的
     */
    private String name;

    /**
     * 当达到这个数据量时开始归档
     */
    private Integer recordSize;

    /**
     * 进行归档任务的时间周期
     */
    private Integer cycle;


    /**
     * get 需要归档的目的
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 需要归档的目的
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 当达到这个数据量时开始归档
     *
     * @return
     */
    public Integer getRecordSize() {
        return recordSize;
    }

    /**
     * set 当达到这个数据量时开始归档
     *
     * @param recordSize
     */
    public void setRecordSize(Integer recordSize) {
        this.recordSize = recordSize;
    }

    /**
     * get 进行归档任务的时间周期
     *
     * @return
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * set 进行归档任务的时间周期
     *
     * @param cycle
     */
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }


    /**
     * set 需要归档的目的
     *
     * @param name
     */
    public Target name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 当达到这个数据量时开始归档
     *
     * @param recordSize
     */
    public Target recordSize(Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * set 进行归档任务的时间周期
     *
     * @param cycle
     */
    public Target cycle(Integer cycle) {
        this.cycle = cycle;
        return this;
    }


}