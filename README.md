# Matrix Operations SOAP Web Service

Ce projet implémente un service web SOAP qui permet d'effectuer des opérations matricielles. Le service est développé en Java en utilisant l'API JAX-WS avec Spring Boot.

## Fonctionnalités

Le service offre les opérations matricielles suivantes:

1. Addition de deux matrices (les matrices doivent avoir les mêmes dimensions)
2. Multiplication de deux matrices (le nombre de colonnes de A doit être égal au nombre de lignes de B)
3. Calcul du déterminant (matrice carrée uniquement)
4. Calcul de l'inverse d'une matrice (matrice carrée et déterminant non nul)
5. Transposée d'une matrice
6. Multiplication par un scalaire
7. Calcul de la trace (matrice carrée uniquement)
8. Carré d'une matrice (matrice carrée uniquement)

## Prérequis

- JDK 11 ou supérieur
- Maven 3.6 ou supérieur
- SoapUI ou un autre client SOAP pour tester le service

## Structure du projet

Le projet est organisé en deux modules:

### 1. MatrixServiceSOAP (Service Provider)

```
MatrixServiceSOAP/
├── pom.xml                                  # Configuration Maven
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── matrix/
│   │   │           └── service/            # Code source
│   │   │               ├── Matrix.java     # Classe pour représenter une matrice
│   │   │               ├── MatrixOperationException.java    # Exception personnalisée
│   │   │               ├── MatrixService.java   # Service SOAP implémentant les opérations
│   │   │               ├── MatrixServiceApplication.java   # Application Spring Boot
│   │   ├── resources/
│   │   │   └── application.properties      # Configuration Spring Boot
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           ├── web.xml                 # Configuration web
│   │           └── sun-jaxws.xml           # Configuration JAX-WS
```

### 2. MatrixServiceClient (Service Consumer)

```
MatrixServiceClient/
├── pom.xml                                  # Configuration Maven
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── matrix/
│   │   │           └── client/            
│   │   │               └── MatrixServiceClient.java  # Client SOAP
```

## Compilation et déploiement

### Compilation

Pour compiler l'ensemble du projet, exécutez la commande suivante à la racine du projet:

```bash
mvn clean package
```

### Démarrage du service SOAP

Le service est développé avec Spring Boot, ce qui signifie qu'il embarque son propre serveur. Pour le démarrer:

```bash
cd MatrixServiceSOAP
mvn spring-boot:run
```

Par défaut, le service démarrera sur:

```
http://localhost:8082/services/MatrixService
```

Vous pouvez modifier les paramètres de configuration dans le fichier `application.properties` ou via des variables d'environnement.

### Configuration

Les paramètres du service SOAP sont configurables via les propriétés suivantes:

- `soap.service.host`: Hôte du service (par défaut: localhost)
- `soap.service.port`: Port du service (par défaut: 8082)
- `soap.service.path`: Chemin d'accès du service (par défaut: /services/MatrixService)

## Utilisation du service

Une fois démarré, le service est accessible à l'URL:

```
http://localhost:8082/services/MatrixService
```

Le WSDL du service est disponible à:

```
http://localhost:8082/services/MatrixService?wsdl
```

### Utilisation du client

Pour utiliser le client préconfiguré:

```bash
cd MatrixServiceClient
mvn exec:java -Dexec.mainClass="com.matrix.client.MatrixServiceClient"
```

### Test avec SoapUI

1. Téléchargez et installez SoapUI depuis [https://www.soapui.org/downloads/soapui/](https://www.soapui.org/downloads/soapui/)
2. Créez un nouveau projet SOAP dans SoapUI
3. Dans la boîte de dialogue, entrez l'URL du WSDL mentionné ci-dessus
4. SoapUI va générer automatiquement des requêtes pour toutes les opérations disponibles
5. Double-cliquez sur une requête pour l'ouvrir, modifiez les valeurs si nécessaire et cliquez sur le bouton "Play" pour l'envoyer

### Exemple de requête SOAP (Addition de matrices)

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.matrix.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:addMatrices>
         <matrixA>
            <cols>2</cols>
            <rows>2</rows>
            <data>
               <item>1.0</item>
               <item>2.0</item>
               <item>3.0</item>
               <item>4.0</item>
            </data>
         </matrixA>
         <matrixB>
            <cols>2</cols>
            <rows>2</rows>
            <data>
               <item>5.0</item>
               <item>6.0</item>
               <item>7.0</item>
               <item>8.0</item>
            </data>
         </matrixB>
      </ser:addMatrices>
   </soapenv:Body>
</soapenv:Envelope>
```

## Gestion des erreurs

Le service web renvoie des exceptions SOAP avec des messages explicites dans les cas suivants:
- Dimensions incompatibles pour l'addition ou la multiplication
- Calcul du déterminant, de la trace ou du carré sur une matrice non carrée
- Tentative d'inversion d'une matrice avec un déterminant nul

## Date de mise à jour

Mai 2025

## Auteurs

Lamine Yamal