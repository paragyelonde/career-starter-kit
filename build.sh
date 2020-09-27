#.bin/bash

echo $USER

AWS_ACCESS_KEY_ID="Fku60MuRVAr6PU6xkLBGaqnNeRjIPANTOaY33OhI"
AWS_SECRET_ACCESS_KEY="AKIAVVRZ2PXYSSWD47HE"

#create package file
cd java-maven-demo
mvn clean package
echo "Package File Created."

#uploading file
aws s3 cp "./target/java-maven-demo-1.0-SNAPSHOT.tar.gz" s3://mmkcollegebucket/parag/
