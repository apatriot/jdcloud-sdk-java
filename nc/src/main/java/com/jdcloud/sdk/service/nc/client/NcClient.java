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
 * 容器服务
 * 容器服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nc.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.nc.model.DescribeContainersRequest;
import com.jdcloud.sdk.service.nc.model.DescribeContainersResponse;
import com.jdcloud.sdk.service.nc.client.DescribeContainersExecutor;
import com.jdcloud.sdk.service.nc.model.CreateContainersRequest;
import com.jdcloud.sdk.service.nc.model.CreateContainersResponse;
import com.jdcloud.sdk.service.nc.client.CreateContainersExecutor;
import com.jdcloud.sdk.service.nc.model.GetLogsRequest;
import com.jdcloud.sdk.service.nc.model.GetLogsResponse;
import com.jdcloud.sdk.service.nc.client.GetLogsExecutor;
import com.jdcloud.sdk.service.nc.model.DescribeSecretRequest;
import com.jdcloud.sdk.service.nc.model.DescribeSecretResponse;
import com.jdcloud.sdk.service.nc.client.DescribeSecretExecutor;
import com.jdcloud.sdk.service.nc.model.ModifyContainerAttributeRequest;
import com.jdcloud.sdk.service.nc.model.ModifyContainerAttributeResponse;
import com.jdcloud.sdk.service.nc.client.ModifyContainerAttributeExecutor;
import com.jdcloud.sdk.service.nc.model.DeleteContainerRequest;
import com.jdcloud.sdk.service.nc.model.DeleteContainerResponse;
import com.jdcloud.sdk.service.nc.client.DeleteContainerExecutor;
import com.jdcloud.sdk.service.nc.model.StopContainerRequest;
import com.jdcloud.sdk.service.nc.model.StopContainerResponse;
import com.jdcloud.sdk.service.nc.client.StopContainerExecutor;
import com.jdcloud.sdk.service.nc.model.StartContainerRequest;
import com.jdcloud.sdk.service.nc.model.StartContainerResponse;
import com.jdcloud.sdk.service.nc.client.StartContainerExecutor;
import com.jdcloud.sdk.service.nc.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.nc.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.nc.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.nc.model.DescribeSecretsRequest;
import com.jdcloud.sdk.service.nc.model.DescribeSecretsResponse;
import com.jdcloud.sdk.service.nc.client.DescribeSecretsExecutor;
import com.jdcloud.sdk.service.nc.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.nc.model.DescribeQuotaResponse;
import com.jdcloud.sdk.service.nc.client.DescribeQuotaExecutor;
import com.jdcloud.sdk.service.nc.model.DescribeContainerRequest;
import com.jdcloud.sdk.service.nc.model.DescribeContainerResponse;
import com.jdcloud.sdk.service.nc.client.DescribeContainerExecutor;
import com.jdcloud.sdk.service.nc.model.DeleteSecretRequest;
import com.jdcloud.sdk.service.nc.model.DeleteSecretResponse;
import com.jdcloud.sdk.service.nc.client.DeleteSecretExecutor;
import com.jdcloud.sdk.service.nc.model.CreateSecretRequest;
import com.jdcloud.sdk.service.nc.model.CreateSecretResponse;
import com.jdcloud.sdk.service.nc.client.CreateSecretExecutor;
import com.jdcloud.sdk.service.nc.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.nc.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.nc.client.AssociateElasticIpExecutor;

/**
 * ncClient
 */
public class NcClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.0";
    public final static String DefaultEndpoint = "nc.jdcloud-api.com";
    public final static String ServiceName = "nc";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private NcClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询容器列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeContainersResponse describeContainers(DescribeContainersRequest request) throws JdcloudSdkException {
        return new DescribeContainersExecutor().client(this).execute(request);
    }

    /**
     * 创建一台或多台指定配置的实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateContainersResponse createContainers(CreateContainersRequest request) throws JdcloudSdkException {
        return new CreateContainersExecutor().client(this).execute(request);
    }

    /**
     * 查询容器日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLogsResponse getLogs(GetLogsRequest request) throws JdcloudSdkException {
        return new GetLogsExecutor().client(this).execute(request);
    }

    /**
     * 查询 secret 详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws JdcloudSdkException {
        return new DescribeSecretExecutor().client(this).execute(request);
    }

    /**
     * 修改容器属性
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyContainerAttributeResponse modifyContainerAttribute(ModifyContainerAttributeRequest request) throws JdcloudSdkException {
        return new ModifyContainerAttributeExecutor().client(this).execute(request);
    }

    /**
     * 删除单个实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteContainerResponse deleteContainer(DeleteContainerRequest request) throws JdcloudSdkException {
        return new DeleteContainerExecutor().client(this).execute(request);
    }

    /**
     * 停止单个实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopContainerResponse stopContainer(StopContainerRequest request) throws JdcloudSdkException {
        return new StopContainerExecutor().client(this).execute(request);
    }

    /**
     * 启动单个实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartContainerResponse startContainer(StartContainerRequest request) throws JdcloudSdkException {
        return new StartContainerExecutor().client(this).execute(request);
    }

    /**
     * 云容器解绑公网IP 解绑的是主网卡、主内网IP对应的弹性IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 查询secret列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretsResponse describeSecrets(DescribeSecretsRequest request) throws JdcloudSdkException {
        return new DescribeSecretsExecutor().client(this).execute(request);
    }

    /**
     * 查询资源的配额
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws JdcloudSdkException {
        return new DescribeQuotaExecutor().client(this).execute(request);
    }

    /**
     * 查询容器详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeContainerResponse describeContainer(DescribeContainerRequest request) throws JdcloudSdkException {
        return new DescribeContainerExecutor().client(this).execute(request);
    }

    /**
     * 删除 secret
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws JdcloudSdkException {
        return new DeleteSecretExecutor().client(this).execute(request);
    }

    /**
     * 创建 secret
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws JdcloudSdkException {
        return new CreateSecretExecutor().client(this).execute(request);
    }

    /**
     * 云容器绑定公网IP 绑定的是主网卡、主内网IP对应的弹性IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public NcClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private NcClient ncClient;

        public DefaultBuilder() {
            ncClient = new NcClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            ncClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            ncClient.httpRequestConfig = config;
            return this;
        }

        public NcClient build() throws JdcloudSdkException {

            if (ncClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                ncClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (ncClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("NcClient build error: jdcloud credentials provider not set");
                }
            }
            if (ncClient.httpRequestConfig == null) {
                ncClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (ncClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("NcClient build error: http request config not set");
                }
            }
            return ncClient;
        }

        public Builder environment(Environment environment) {
            ncClient.environment = environment;
            return this;
        }
    }
}
