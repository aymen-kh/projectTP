package com.matrix.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import javax.xml.ws.Endpoint;

@SpringBootApplication
public class MatrixServiceApplication {

    @Value("${soap.service.host:localhost}")
    private String serviceHost;

    @Value("${soap.service.port:8082}")
    private String servicePort;

    @Value("${soap.service.path:/services/MatrixService}")
    private String servicePath;

    public static void main(String[] args) {
        SpringApplication.run(MatrixServiceApplication.class, args);
    }

    @Bean
    public MatrixService matrixService() {
        MatrixService service = new MatrixService();
        String address = String.format("http://%s:%s%s", serviceHost, servicePort, servicePath);
        Endpoint.publish(address, service);
        return service;
    }
}