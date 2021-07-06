package com.cen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/*
 * This class is responsible for our application connect with redis server
 */

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {
  
	
	//Create jedis connection factory
	
	@Bean
	public JedisConnectionFactory connection() {
		RedisStandaloneConfiguration config=new RedisStandaloneConfiguration();
		config.setHostName("localhost");
		config.setPort(6379);
		return new JedisConnectionFactory(config);
		
	}
	
	//Use template for acess redis server
	
	@Bean
	public RedisTemplate<String, Object> redTemplate(){
		RedisTemplate<String, Object> temp=new RedisTemplate<>();
		temp.setConnectionFactory(connection());
		temp.setKeySerializer(new StringRedisSerializer());
		temp.setHashKeySerializer(new StringRedisSerializer());
		temp.setHashKeySerializer(new JdkSerializationRedisSerializer());
		temp.setValueSerializer(new JdkSerializationRedisSerializer());
		temp.setEnableTransactionSupport(true);
		temp.afterPropertiesSet();
		return temp;
		
	}
}
