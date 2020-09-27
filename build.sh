#.bin/bash

#create package file
cd java-maven-demo
mvn clean package
echo "Package File Created."

#uploading file
aws s3 cp "./target/java-maven-demo-1.0-SNAPSHOT.tar.gz" s3://mmkcollegebucket/parag/
