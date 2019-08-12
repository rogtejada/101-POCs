## 101-POCS

### Rodrigo Tejada

#### Instructions


#### Thorntail
- run ```mvn thorntail:run```


#### Wildfly Standalone
- run ```gradle build```
- then copy the war file to "wilfly-directory/standalone/deployments/"
- run ```./bin/standalone.sh```

#### Tomcat 
- run ```gradle build```
- then copy the war file to "tomcat-directory/webapps/"
- run ```./bin/catalina.sh start```
