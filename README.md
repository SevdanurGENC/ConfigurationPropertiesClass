# ConfigurationPropertiesClass
Reading and writing configuration for Java application using Properties class

## Creating a Properties object
```
Properties props = new Properties(); 

Properties defaultProps = new Properties(); // set default properties
 
Properties props = new Properties(defaultProps); / create main Properties object
```

## Loading properties file
```
File configFile = new File("config.properties");
 
FileReader reader = new FileReader(configFile);
 
Properties props = new Properties();
 
props.load(reader); // load the properties file:
```

## Creating a Properties object
```
Properties props = new Properties();
```
## Creating a Properties object
> Properties props = new Properties();

## Creating a Properties object
> Properties props = new Properties();
