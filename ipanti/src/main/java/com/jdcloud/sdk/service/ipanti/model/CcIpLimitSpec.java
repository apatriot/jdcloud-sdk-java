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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * ccIpLimitSpec
 */
public class CcIpLimitSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cc防护每ip的限速大小
     */
    private Integer ccSpeedLimit;

    /**
     * cc防护每ip的限速大小的统计周期
     */
    private Integer ccSpeedPeriod;


    /**
     * get cc防护每ip的限速大小
     *
     * @return
     */
    public Integer getCcSpeedLimit() {
        return ccSpeedLimit;
    }

    /**
     * set cc防护每ip的限速大小
     *
     * @param ccSpeedLimit
     */
    public void setCcSpeedLimit(Integer ccSpeedLimit) {
        this.ccSpeedLimit = ccSpeedLimit;
    }

    /**
     * get cc防护每ip的限速大小的统计周期
     *
     * @return
     */
    public Integer getCcSpeedPeriod() {
        return ccSpeedPeriod;
    }

    /**
     * set cc防护每ip的限速大小的统计周期
     *
     * @param ccSpeedPeriod
     */
    public void setCcSpeedPeriod(Integer ccSpeedPeriod) {
        this.ccSpeedPeriod = ccSpeedPeriod;
    }


    /**
     * set cc防护每ip的限速大小
     *
     * @param ccSpeedLimit
     */
    public CcIpLimitSpec ccSpeedLimit(Integer ccSpeedLimit) {
        this.ccSpeedLimit = ccSpeedLimit;
        return this;
    }

    /**
     * set cc防护每ip的限速大小的统计周期
     *
     * @param ccSpeedPeriod
     */
    public CcIpLimitSpec ccSpeedPeriod(Integer ccSpeedPeriod) {
        this.ccSpeedPeriod = ccSpeedPeriod;
        return this;
    }


}