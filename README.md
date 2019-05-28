# TinyREXXParserUNIPD
Progetto per il corso di automi e linguaggi formali dell'università di Padova

## Obbiettivo del progetto
Questo progetto si prefigge come obbiettivo di avere alla fine dello sviluppo un traduttore dal linguaggio TinyRexx a C++

relatori :
 - Emanuele Ostanello
 - Nicola Pastore
 - Gianmarco Pettinato

### Funzionalità richieste
- [x] Costrutto if end
- [x] Costrutto if else end
- [x] Costrutto do ID = expr1 to expr1 operation+ end
- [x] Costrutto per espressioni booleane

### Grammatica e implementazione

Grammatica [tinyrexx.g4](completed/tinyrexx.g4)
implementazione [MyListener.h](completed/MyListener.h)
[MyListener.cpp](completed/MyListener.cpp)

### Istruzioni per compilare
- Entrare dentro la directory dev/antlr4
~~~~
source setup.sh
cd tinyrexx
make translate
~~~~

Non compila con versioni del g++ > 6
In caso la versione del compilatore dovesse essere inferiore alla 6 e dovesse
dare problemi modificare la prima riga del Makefile `CXX=g++-5` a `CXX=g++`
