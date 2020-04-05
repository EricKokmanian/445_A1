# COMP 445
Assignment  1, 2 and 3 COMP445 Winter 2020

## Authors
 - Eric Kokmanian (40028608)
 - Skander Ben Mekki (40032375)

## Assignment 3 source code
Our code for this assignment was spread out into 3 classes:
 1. `UDPLauch.java` contains 1st main method. Given a specific command, will call the Client's `runClient()` method passing along the various arguments of such command.
 2. `UDPClient.java` contains all operations (GET & POST) necessary to send a specific Client request to the Server side using UDP.
 3. `UDPServer.java` contains all operations necessary to listen for Client requests and serve them by sending back different responses depending on the type of request.
 
## Running A3
 1. Start the client side by running the following command: `httpc (get|post) [-v] (-h "k:v")* [-d inline-data] [-f file] URL`
 2. Start the server side by running the following command: `httpfs [-v] [-p PORT] [-d PATH-TO-DIR]`
 
## Various Client commands tested
 - `httpc get  HTTP/1.0 http://localhost:8007/eric.txt`
 - `httpc get  HTTP/1.0 -h User-Agent:Concordia http://localhost:8007/eric.txt`
 - `httpc get  HTTP/1.0 -v -h User-Agent:Concordia http://localhost:8007/eric.txt`