## 101-POCS

### Rodrigo Tejada

#### Instructions


#### Thorntail

- Flyway:
	- Edit flyway.conf file with URL, password, user and schema
	- Run ``` mvn flyway:migrate```

- Liquibase:
	- Edit liquibase.properties with URL, password, user and schema
	- Run ``` mvn liquibase:update ```

- Run ```mvn thorntail:run``` to deploy application


#### Wildfly Standalone
- run ```gradle build```
- then copy the war file to "wilfly-directory/standalone/deployments/"
- run ```./bin/standalone.sh```

#### Tomcat 
- run ```gradle build```
- then copy the war file to "tomcat-directory/webapps/"
- run ```./bin/catalina.sh start```
