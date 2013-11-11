Cheesr
======

Voor interne cursusdoeleinden de resources voor de kaaswinkel uit
[Wicket in Action](http://wicketinaction.com).

Werkwijze
---------

Genereer een Wicket quickstart in je workspace door de instructies op
[deze Wicket pagina](http://wicket.apache.org/start/quickstart.html)
te volgen. Gebruik de volgende groupid en artifactid:

    groupId: nl.topicus.cheesr
	artifactId: cheesr

Kopieer het gegenereerde commandline commando en plak deze in een
shell (of dos prompt).

Kopieer dan de domein en service directories naar je project folder
onder `src/main/java/nl/topicus/cursus/cheesr`

Kopieer de style folder uit de mockup directory naar
`src/main/webapp/`

Maak een nieuwe package "nl.topicus.cursus.cheesr.pages" en copieer
de html files uit de mockup directory naar deze package.

Maak dan een class Index in die package en laat die van `WebPage`
extenden.

Pas de WicketApplication class aan zodat Index je nieuwe home page
wordt.

Run de jetty Start class uit de
src/test/java/nl/topicus/cursus/cheesr directory, of voer `mvn
jetty:run` uit op de commandline.

Implementeer daarna de voorbeelden uit hoofdstuk 3 van Wicket in
Action.

