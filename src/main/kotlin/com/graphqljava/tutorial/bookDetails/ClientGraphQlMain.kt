package com.graphqljava.tutorial.bookDetails

import org.springframework.graphql.client.HttpGraphQlClient


class ClientGraphQlMain {
}

fun main() {
//    val webClient: WebClient = ... ;
    val graphQlClient = HttpGraphQlClient.builder()
        .url("http://localhost:8080/graphiql")
        .build()

    val document = "{" +
            "  query bookDetails {\n" +
            "  bookById(id: \"book-1\") {\n" +
            "    id\n" +
            "    name\n" +
            "    pageCount\n" +
            "    author {\n" +
            "      id\n" +
            "      firstName\n" +
            "      lastName\n" +
            "    }\n" +
            "  }\n" +
            "}" +
            "}"

    val toEntity = graphQlClient.document(document).retrieve("book").toEntity(Book::class.java)

    println(toEntity)

//    val url = "wss://localhost:8080/graphql"
//    val client: WebSocketClient = ReactorNettyWebSocketClient()

//    val graphQlClient: WebSocketGraphQlClient = WebSocketGraphQlClient.builder(url, client).build()
}