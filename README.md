# ConfigurationPropertiesClass
Reading and writing configuration for Java application using Properties class


![image](https://user-images.githubusercontent.com/5441882/102424211-bcc12000-401b-11eb-9401-b2aabfcfa8c7.png)


![image](https://user-images.githubusercontent.com/5441882/102424258-d2364a00-401b-11eb-88d1-cb66def3bee6.png) 


## 1. Creating a Properties object
- Create a Propertiesobject by using empty constructor:
```
Properties props = new Properties(); 
```

- Create a Properties object by supplying a default properties list:
```
Properties defaultProps = new Properties(); // set default properties
Properties props = new Properties(defaultProps); / create main Properties object
```

## 2. Loading properties file
- Load properties from a .properties file using a FileReader object
```
File configFile = new File("config.properties");
 
FileReader reader = new FileReader(configFile);
 
Properties props = new Properties();
 
props.load(reader); // load the properties file:
```
- Load properties from a plain text file using an InputStream object:
```
File configFile = new File("config.properties");

InputStream inputStream = new FileInputStream(configFile);

Properties props = new Properties();
 
props.load(inputStream);
```

##  3. Getting properties values
- The Properties class has two methods for retrieving value of a property in the properties file:
- String getProperty(String key): returns value of the property specified by the given key. It returns null if the key not found.
- String getProperty(String key, String defaultValue): like the above method, but this method will return a default value if the key not found.

```
String host = props.getProperty("host");
```

## 4. Setting properties values
- Setting value for a specific property is pretty simple, using this sole method:
- Object setProperty(String key, String value) 
- This method returns previous value of the property specified by the given key.

```
props.setProperty("host", "www.sevdanurgenc.com"); 
```

## 5. Saving properties file
- Save to plain text file using a Writerobject: 

``` 
File configFile = new File("config.properties");
FileWriter writer = new FileWriter(configFile);
props.store(writer, "host settings");
```  
