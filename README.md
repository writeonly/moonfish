[![Build Status](https://api.travis-ci.org/writeonly/scalare.svg?branch=master)](https://travis-ci.org/writeonly/scalare)
[![Codacy grade](https://img.shields.io/codacy/grade/e27821fb6289410b8f58338c7e0bc686.svg)](https://www.codacy.com/app/writeonly/scalare/dashboard)
[![Codecov](https://img.shields.io/codecov/c/github/writeonly/scalare.svg)](https://codecov.io/gh/writeonly/scalare)
[![GitHub issues](https://img.shields.io/github/issues/writeonly/scalare.svg)](https://github.com/writeonly/scalare/issues)
[![License][licenseImg]][licenseLink]

[licenseImg]: https://img.shields.io/github/license/writeonly/scalare.svg
[licenseImg2]: https://img.shields.io/:license-mit-blue.svg
[licenseLink]: LICENSE

* https://circleci.com/gh/writeonly/scalare

# ScalaRE
```
FOR people
WHO want to make a query
THE Scalare IS A database selector and manager
THAT is a one jar
UNLIKE others database manager
OUR PRODUCT is a one jar
```
It is a demo application with:
## Main technology
* Scala for logic
* Dropwizard for Rest
* Guice for DI
* Mustache for view

## Other technology
* ScalaTest
* ScalaMock
* ScalaTE
* Scalatra

## Database
* Embedded SQL
 * derby
 * h2
 * hsql
 * sqlite
* Remote SQL
 * CUBRID
 * Firebird
 * MariaDB
 * MySQL
 * PostgreSQL
* Like-SQL NoSql
 * apache ignite
 * cassandra
 * couchbase
* Other NoSql
 * Redis


# Usage
java -jar scalare-main/target/scalare-main-1.0.6-SNAPSHOT.jar server scalare.yml

java -cp scalare-main/target/scalare-main-1.0.6-SNAPSHOT.jar pl.scalare.rest.asaps.DatabaseAsap

mvn clean install; java -jar scalare-main/target/scalare-main-1.0.6-SNAPSHOT.jar server scalare.yml

mvn clean install; java -cp scalare-main/target/scalare-main-1.0.6-SNAPSHOT.jar pl.scalare.rest.asaps.DatabaseAsap
