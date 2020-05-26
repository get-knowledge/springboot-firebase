package com.gobeyond.firebase.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.gobeyond.firebase.document.FirebaseId;
import com.gobeyond.firebase.util.service.FirebaseApplicationService;


@Configuration
public class FirebaseConfiguration {

    @Bean
    public FirebaseConfigurationPro firebaseConfigurationProperties() {
        return new FirebaseConfigurationPro();
    }

    @Bean
    public ResourceLoader resourceLoader() {
        return new DefaultResourceLoader();
    }

    @Bean
    public FirebaseApplicationService firebaseApplicationService() throws IOException {
        return new FirebaseApplicationService(resourceLoader(), firebaseConfigurationProperties());
    }

    @Bean
    public ObjectMapper firebaseObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public boolean hasIgnoreMarker(AnnotatedMember m) {
                return _findAnnotation(m, FirebaseId.class) != null;
            }
        });
        return objectMapper;
    }

}
