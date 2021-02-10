mvn clean package
docker build -t magidash .
docker-compose up --force-recreate