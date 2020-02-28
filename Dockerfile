# download the openjdk version8image
FROM openjdk:8

# make this the working directory, hereon all commands will be run here by default
WORKDIR /usr/src/app

# Copy all the contents of current folder(the project files) to /usr/src/app folder
COPY . .

# give execute permission to "mvnw" executable
RUN chmod 700 mvnw

# run the maven command to clean and package the app as jar
RUN ./mvnw clean package

# expose the app to port 8080
EXPOSE 8080

# runs the java app with the "java -jar" command
ENTRYPOINT ["java","-jar","./target/fooditemsorderdeliveryapi-0.0.1-SNAPSHOT.jar"]