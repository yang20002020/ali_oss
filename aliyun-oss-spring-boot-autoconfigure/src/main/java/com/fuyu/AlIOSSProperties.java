package com.fuyu;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="aliyun.oss")
public class AlIOSSProperties {
    private String endpoint;
    private String bucketName;



    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
