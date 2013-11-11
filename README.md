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

Maak een nieuwe package "nl.topicus.cheesr.pages" en copieer
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

Je kan de volgende opdrachten doen:

1. implementeer de Index page met de volgende componenten:
  - listview voor de kazen
  - labels voor de kaas properties
  - link voor de toevoegen link
  - listview voor de shopping cart
  - link voor het verwijderen van een kaas uit de cart
  - labels voor de kaas properties in de cart
  - label voor het totaal bedrag van de waarde van de inhoud van de cart
  - paging gedrag voor de kazen (pagingnavigator en pageablelistview)
2. implementeer de listview van de kazen met een loadable detachable model voor de List<Cheese> objecten
3. implementeer de lijst van kazen met een DataView en IDataProvider ipv listview
4. implementeer de navigatie naar de CheckOutPage (de knop Checkout)
5. implementeer de CheckoutPage:
  - form en fields voor de adresgegevens
  - zorg dat de cart meegegeven wordt aan de checkout pagina
  - listview voor de shoppingcart (inclusief de verwijder link en het totaal)
  - de knop voor het afronden van het bestelproces kan gewoon naar de indexpagina verwijzen (evt loggen dat er een transactie is afgerond)
6. refactor de shoppingcart naar een Panel (refactoringnaam: Extract Panel) en pas de index en checkout page aan zodat deze je nieuwe panel gebruiken

