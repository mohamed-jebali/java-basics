# Guida all'installazione di Java su macOS

<p align="center">
<a href="https://angular.io/" target="_blank"><img src="https://www.vincenzoracca.com/images/java.png" height="150"></a>

## Java su Visual Studio Code

Scaricare il kit JDK (Java Development Kit) sul sito della Oracle https://www.oracle.com/it/java/technologies/downloads/#jdk21-mac
il JDK contiene all interno il JRE (Java Runtime Enviroment) e il JVM (Java Virtual Machine)

## Struttura Progetto Java

All'interno del progetto ci sono delle cartelle:

    src: questa cartella contiene il codice sorgente del tuo progetto.
    lib: è possibile utilizzare questa cartella per gestire le librerie e le dipendenze esterne del progetto.

Java è un linguaggio compilato, il che significa che quando compili il tuo codice sorgente, verranno creati file all'interno di una cartella di output, solitamente denominata bin. Questi file contengono il bytecode generato dal compilatore

## Processo di Compilazione/Esecuzione

Il processo di sviluppo in Java coinvolge diverse fasi:

    Lo sviluppatore scrive il codice sorgente in Java ad alto livello.
    Il codice sorgente Java viene compilato dalla JVM in bytecode. Il bytecode è un linguaggio intermedio che è altamente portatile e può essere eseguito su diverse piattaforme.
    La JVM specifica per il sistema operativo in uso interpreta il bytecode e lo esegue, convertendolo in istruzioni del linguaggio macchina specifiche per quel sistema operativo.

Questo processo consente di scrivere codice Java una volta e di eseguirlo su diverse piattaforme senza doverlo adattare per ciascuna di esse.



