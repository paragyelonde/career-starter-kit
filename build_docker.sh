cd TodoAppDocker
docker build -t html-server-parag:v2 .

docker tag html-server-parag:v2 8655807104/html-server-parag:v2
docker push 8655807104/html-server-parag:v2
