#.bin/bash

echo $USER

#create package file
cd java-maven-demo
mvn clean package
echo "Package File Created."

#uploading file
aws s3 cp "./target/java-maven-demo-1.0-SNAPSHOT.tar.gz" s3://mmkcollegebucket/parag/ --grants read=uri=http://acs.amazonaws.com/groups/global/AllUsers

#create package file
cd ../TodoApp
mvn clean package
echo "Package File Created."
aws s3 cp "./target/todo-app-1.0-SNAPSHOT.tar.gz" s3://mmkcollegebucket/parag/ --grants read=uri=http://acs.amazonaws.com/groups/global/AllUsers
