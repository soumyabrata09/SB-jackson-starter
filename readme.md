# SB-Jackson-Starter for serialization
### A custom Starter package for Jacksn Serialization -Deserialization
#### This starter package can be added as a dependency in the pom.xml or build.gradle file

**Pre-Requisite**
 - Maven in local
 - JDK 1.8 minimum
 
````
mvn clean compile
````
And then
````
mvn clean install
````

**Usage Guide**

To run Locally:
After successful build add the following dependency into your Reference Application's pom file
````
    <groupId>com.sam09.lib</groupId>
    <artifactId>sb-jackson-starter</artifactId>
    <version>1.0.0-SNAPSHOT</version>
````

> Create a Configuration class and import `SerializerConfiguration.class` into it
````
@Import(SerializerConfiguration.class)
@Configuration
public class DemoAutoConfiguration{
}
````

> And autowire it with a _**constructor**_ in the calling class

_TODO_
 - [x] Create a Generic SLF4J logger which can be injected to gereric bean generator and can be used across the project 
 - [x] Onboard the artifact onto Jfrog/Nexus
 
[Guidance to write well formatted readme file](https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)