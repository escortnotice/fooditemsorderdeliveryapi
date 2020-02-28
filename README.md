Description :
===================
A springboot mysqldb app ready to be deployed on Openshift directly from workspace using fabric8 plugins

UI For this backend is at : 
===================================
https://github.com/escortnotice/pizza-order-delivery-ui

EndPoints:
============================

1. Items (To add and retrieve items) :

POST http://localhost:8080/items

Request:
{
    "name": "PaneerPizza",
     "itemtype" : "Pizza",
    "price": "620"
   
}

GET http://localhost:8080/items

GET http://localhost:8080/items/{id}

------------------------------------------

2. Orders (To add orders, track orders ) :

POST http://localhost:8080/orders
Request:
{
   "itemids":[1,2],
    "user":{
    	"username":"Saanvi",
    	"email":"saanvi.roy@gmail.com",
    	"address":"salt-lake kolkata"
    }
}


GET http://localhost:8080/orders/{orderid}

GET http://localhost:8080/userOrders/{orderid}

------------------------------------------

3. Swagger UI:

http://localhost:8080/swagger-ui.html

------------------------------------------

3. Health Check API:

http://localhost:8080/swagger-ui.html
Response: {"Message":"OK"}

------------------------------------------

Command to build, package, skip tests and deploy to Openshift(using fabric8 plugin) and using "openshift" profile(defined in POM.xml)
=========================================================================================================================================
to create a config map from application properties file:
>oc create configmap fooditemsorderdeliveryapi-props-configmap --from-file=src/main/resources/application.properties

> mvn clean oc:deploy -Popenshift -DskipTests=true

To delete all the deployment resources from openshift cluster
> mvn oc:undeploy


MySql Database details on Openshift:
=================================================================
DB Name: pizzadb

Username: admin

Password: admin123

RootPassword : root

Database ServiceName: mysql



Logging to db in openshift
==============================================
>mysql -u admin -p

>admin123

>use pizzadb;


Maven Build and Deploy Commands for reference:
==============================================

# Command To run a spring boot project with dev profile active(application-dev.properties)
> mvn spring-boot:run -Dspring.profiles.active=dev

# Command to create a jar and run the jar with dev profile active((application-dev.properties)
> mvn clean package
> java -jar -Dspring.profiles.active=dev target/application.jar


# Command to create a jar from a profile defined in POM.xml(profile = openshift) and run the jar with dev profile active(application-dev.properties)
> mvn clean package -Popenshift
> java -jar -Dspring.profiles.active=dev target/application.jar


# Command to build and deploy directly on Openshift cluster using openshift profile(in POM.xml)
> mvn clean oc:deploy -Popenshift

# Command to build and package and skip tests
> mvn clean package -DskipTests=true

# Command to build, package, skip tests and deploy to Openshift(using fabric8 plugin) and using "openshift" profile(defined in POM.xml)
> mvn clean oc:deploy -Popenshift -DskipTests=true

# Command to automatically generate docker images using fabric8 plugin
> mvn oc:build -Popenshift

