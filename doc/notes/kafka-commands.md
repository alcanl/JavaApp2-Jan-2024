##### Kafka Kurulumu

>Kafka için pek çok docker imajı vardır. Örneğin, `Apache` firmasının Kafka docker imajı aşağıdaki komut ile pull edilebilir.

```
docker pull apache/kafka:latest
```

>Bu imaj ile bir container aşağıdaki gibi oluşturulup aynı zamanda çalıştırılabilir

```
docker run -d --name kafka-demo apache/kafka:latest
```

>İstenirse port ve host bilgileri de ilgili container için belirlenebilir:

```
docker run -d --name kafka-demo -p 9092:9092 -network 192.168.1.100 apache/kafka:latest
```
>Kafka container'ı içerisinde pek çok yararlı script bulunmaktadır. Bu scriptleri kullanabilmek için aşağıdaki docker exec komutu çalıştırılabilir:
```
docker exec --workdir /opt/kafka/bin/ -it kafka-demo sh
```



>Bu container içerisinde bir topic aşağıdaki script kullanılarak yaratılabilir:

```
./kafka-topics.sh --bootstrap-server localhost:9092 --create --topic numbers
```

>Burada `numbers` isimli bir topic yaratılmıştır 

>Kafka container'ı içerisinde ilgili topic için değerler üretilmesi interaktif olarak aşağıdaki script ile yapılabilir


```
./kafka-console-producer.sh --bootstrap-server localhost:9092 --topic numbers
```


>Kafka container'ı içerisinde bir topic'den bilgi elde etmek için aşağıdaki script kullanılabilir

```
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic numbers --from-beginning
```


