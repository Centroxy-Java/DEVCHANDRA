# Project: SpringBoot with redis server
# written by
chandra
# Introduction
REmote DIctionary Server (Redis) is an in-memory data structure store. It can be used as a simple database, a message broker and for caching through its support for various data structures.

In this article, we'll be creating a simple CRUD application and integrating Redis with Spring Boot. To achieve CRUD functionality, we'll rely on the HashOperations interface provided by the Spring Data Redis project.


#Redis
Redis is an open-source in-memory data store written in C, which makes it blazingly fast. Because of its faster read/writes operations, it is commonly used for caching data. Data is stored in Redis in the form of key-values where a key is used to extract the values.

Redis can also persist data on a disk, rather than hold it in-memory, using "snapshots" - by copying its in-memory data store at regular intervals.

#Prerequisites
Installing Redis
Redis can easily be installed on Linux and macOS. Windows requires a bit of hacking, though. We'll install Redis on an AWS EC2 instance running Ubuntu 18.04 LTS:

# Dependecy

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-redis</artifactId>
	<version>${version}</version>
</dependency>

#To use Jedis, we'll have to add it to our pom.xml file:

<dependency>
	<groupId>redis.clients</groupId>
	<artifactId>jedis</artifactId>
	<version>${version}</version>
</dependency>

#JedisConnectionFactory:

@Configuration
public class Config {
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName("your_host_name_or_ip");
        jedisConnectionFactory.setPort(6379);
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }
}

RedisTemplate is an entry-class provided by Spring Data through which we interact with the Redis server.

We'll pass a RedisConnectionFactory instance to the RedisTemplate to establish a connection:


#HashOperations
Redis Hashes can hold an n number of key-value pairs and are designed to use less memory, making it a great way for storing objects in-memory. Through the HashOperations helper class, we can manipulate them.

#These operations include basic hash map operations such as put(), get(), entries(), etc:

// Sets user object in USER hashmap at userId key
hashOperations.put("USER", user.getUserId(), user);
// Get value of USER hashmap at userId key
hashOperations.get("USER", userId);
// Get all hashes in USER hashmap
hashOperations.entries("USER");
// Delete the hashkey userId from USER hashmap
hashOperations.delete("USER", userId);

# Run application
http:localhost:1001


#
