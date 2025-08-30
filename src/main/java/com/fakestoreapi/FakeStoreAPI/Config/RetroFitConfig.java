package com.fakestoreapi.FakeStoreAPI.Config;

import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreAPIGateway;
import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreApi;
import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreGatewayImpl;
import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreProductAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {
    @Value("${fakestore.api.base-url}")
    private String url;
    @Bean
    public Retrofit retrofit() {

        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreApi fakeStoreAPIGateway(){
        return retrofit().create(FakeStoreApi.class);
    }

    @Bean
    public FakeStoreProductAPI fakeStoreProductAPI() {
        return retrofit().create(FakeStoreProductAPI.class);
    }
}
