FROM php:7.3-apache
RUN apt-get update -y
RUN apt-get install wget -y
RUN wget https://mmkcollegebucket.s3.us-east-2.amazonaws.com/parag/todo-app-1.0-SNAPSHOT.tar.gz
RUN tar -xvzf todo-app-1.0-SNAPSHOT.tar.gz -C /var/www/html/
#COPY . /usr/share/nginx/html