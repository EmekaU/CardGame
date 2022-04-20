# [CardGame](https://github.com/EmekaU/CardGame)
---
## Build Instructions for CardGame

1. Go to the `CardGame/` directory via the command line
2. Ensure maven is installed
4. To build the jar file, enter `mvn clean install`

---
## Main Design Idea

 - The Game class needs to be an abstract class because we need to a default behaviour for some methods, this ensures that we adhere to the DRY principle. 
 - Furthermore, because different games have different ways of dealing cards, comparing cards, initializing the deck,etc., we can use polymorphism by enabling the sub game classes define their own behaviour by overriding common methods in the main Game class.
