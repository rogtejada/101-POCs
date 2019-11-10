### Setting Kafka Up

- First run  ` docker-compose up `
- It will start Kafka and Zookeper
- You can access kafka container and go to `/opt/bitnami/kafka/bin`, there you will found kafka files, to create a topic, start a producer and send messages.


### Running Producer and Consumer

- First run the spring boot application
- then you cant post messages by this endpoint
 `curl -X POST -F 'message={YourMessageHere}' http://localhost:9000/kafka/publish`
- Your messages will be logged in the console