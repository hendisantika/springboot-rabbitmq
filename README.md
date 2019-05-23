# springboot-rabbitmq

* **Producer** will send messages to **RabbitMQ Exchanges** with a *routingKey*. 
    **RabbitMQ** uses routingKey to determine which queues for routing messages.
* **Consumer** listens on a **RabbitMQ Queue** to receive messages.