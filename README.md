# Matrix Operations SOAP Web Service

Ce projet implémente un service web SOAP qui permet d'effectuer des opérations matricielles. Le service est développé en Java en utilisant l'API JAX-WS.

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
- Un serveur d'application comme Apache Tomcat (version 9 ou supérieure)
- SoapUI ou un autre client SOAP pour tester le service

## Structure du projet

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
│   │   │               └── MatrixService.java   # Service SOAP implémentant les opérations
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           ├── web.xml                 # Configuration web
│   │           └── sun-jaxws.xml           # Configuration JAX-WS
```

## Compilation et déploiement

### Compilation

Pour compiler le projet, exécutez la commande suivante à la racine du projet:

```bash
mvn clean package
```

Cette commande va:
1. Compiler le code source
2. Exécuter les tests unitaires (s'il y en a)
3. Générer un fichier WAR dans le répertoire `target/`

### Déploiement

Pour déployer le service, copiez le fichier WAR généré (`target/matrix-service-soap-1.0-SNAPSHOT.war`) dans le répertoire `webapps` de votre serveur Tomcat.

Alternativement, vous pouvez utiliser le plugin Tomcat de Maven pour déployer directement:

```bash
mvn tomcat7:deploy
```

## Utilisation du service

Une fois déployé, le service est accessible à l'URL:

```
http://localhost:8080/matrix-service-soap-1.0-SNAPSHOT/services/MatrixService
```

Le WSDL du service est disponible à:

```
http://localhost:8080/matrix-service-soap-1.0-SNAPSHOT/services/MatrixService?wsdl
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

## Auteurs

[Votre nom]