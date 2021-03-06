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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看域名的解析次数
 */
public class GetDomainQueryCountResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * time
     */
    private List<Integer> time;

    /**
     * traffic
     */
    private List<Integer> traffic;


    /**
     * get time
     *
     * @return
     */
    public List<Integer> getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(List<Integer> time) {
        this.time = time;
    }

    /**
     * get traffic
     *
     * @return
     */
    public List<Integer> getTraffic() {
        return traffic;
    }

    /**
     * set traffic
     *
     * @param traffic
     */
    public void setTraffic(List<Integer> traffic) {
        this.traffic = traffic;
    }


    /**
     * set time
     *
     * @param time
     */
    public GetDomainQueryCountResult time(List<Integer> time) {
        this.time = time;
        return this;
    }

    /**
     * set traffic
     *
     * @param traffic
     */
    public GetDomainQueryCountResult traffic(List<Integer> traffic) {
        this.traffic = traffic;
        return this;
    }


    /**
     * add item to time
     *
     * @param time
     */
    public void addTime(Integer time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

    /**
     * add item to traffic
     *
     * @param traffic
     */
    public void addTraffic(Integer traffic) {
        if (this.traffic == null) {
            this.traffic = new ArrayList<>();
        }
        this.traffic.add(traffic);
    }

}