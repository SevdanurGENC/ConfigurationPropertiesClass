# ConfigurationPropertiesClass
Reading and writing configuration for Java application using Properties class

## 1. Creating a Properties object
```
Properties props = new Properties(); 

Properties defaultProps = new Properties(); // set default properties
 
Properties props = new Properties(defaultProps); / create main Properties object
```

## 2. Loading properties file
> Load properties from a .properties file using a FileReader object
```
File configFile = new File("config.properties");
 
FileReader reader = new FileReader(configFile);
 
Properties props = new Properties();
 
props.load(reader); // load the properties file:
```
>Load properties from a plain text file using an InputStream object:
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

> Save to XML file using an OutputStream object: 
``` 
File configFile = new File("config.xml");
OutputStream outputStream = new FileOutputStream(configFile);
props.storeToXML(outputStream, "host settings");
```


