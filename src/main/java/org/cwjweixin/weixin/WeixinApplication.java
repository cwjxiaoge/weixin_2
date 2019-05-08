package org.cwjweixin.weixin;

import org.cwjweixin.domain.InMessage;
import org.cwjweixin.weixin.controller.service.JsonRedisSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class WeixinApplication {
	
	// @Bean注解相当于在XML文件中写<bean>元素
		@Bean
		public XmlMapper xmlMapper() {
			XmlMapper mapper = new XmlMapper();
			return mapper;
		}
	

	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}
	@Bean
	public RedisTemplate<String, ? extends InMessage> inMessageTemplate(
			@Autowired RedisConnectionFactory connectionFactory){
		
		RedisTemplate<String, ? extends InMessage> template=new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		template.setValueSerializer(new JsonRedisSerializer<InMessage>());
		return template;
	}
}
